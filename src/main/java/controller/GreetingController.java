package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/hello")
    public String greeting(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "hung";
    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("hung");
        modelAndView.addObject("name", "Mai Quang Hung");
        return modelAndView;
    }
    @PostMapping("/hi")
    public ModelAndView demo(){
        ModelAndView modelAndView = new ModelAndView("hung");
        modelAndView.addObject("name", "Tran Xuan Thinh");
        return modelAndView;
    }

}
