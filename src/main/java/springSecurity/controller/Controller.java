package springSecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String showHome(){

        return "home";
    }

    @GetMapping("/leaders")
    public String showLeaders(){

        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystems(){

        return "systems";
    }
}
