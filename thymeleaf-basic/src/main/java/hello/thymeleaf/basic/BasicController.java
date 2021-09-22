package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @GetMapping("text-basic")
    public String testBasic(Model model) {
        model.addAttribute("data", "Hello Spring!");

        return "basic/text-basic";
    }

    @GetMapping("text-unescaped")
    public String testUnescaped(Model model) {
        model.addAttribute("data", "Hello Spring!");

        return "basic/text-unescaped";
    }
}
