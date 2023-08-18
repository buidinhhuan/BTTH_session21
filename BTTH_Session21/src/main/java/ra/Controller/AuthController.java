package ra.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ra.model.User;

@Controller
public class AuthController {

    @GetMapping("/")
    public String showLoginForm(Model model) {
        // Tạo một đối tượng User để gửi đến trang đăng nhập
        User user = new User();
        model.addAttribute("user", user);
        return "/login"; // Tên trang đăng nhập Thymeleaf
    }

    @PostMapping("/doLogin")
    public String doLogin(User user) {
        // Ở đây bạn có thể xử lý logic đăng nhập, kiểm tra thông tin người dùng và trả về trang kết quả phù hợp
        // Ví dụ: kiểm tra user.getUsername() và user.getPassword()
        if ("huan".equals(user.getUsername()) && "123123".equals(user.getPassword())) {
            return "/success"; // Chuyển hướng sau khi đăng nhập thành công
        } else {
            return "/error"; // Chuyển hướng với thông báo lỗi
        }
    }
}
