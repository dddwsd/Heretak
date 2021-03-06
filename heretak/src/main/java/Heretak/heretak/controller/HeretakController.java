package Heretak.heretak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeretakController {

    @GetMapping("heretak")
    @ResponseBody
    public String heretak(@RequestParam("name") String name, Model model) {
        Heretak heretak = new Heretak();
        heretak.setName(name);
        return heretak.getName();
    }

    static class Heretak {
        private String name;
        public String getName() {
            return "We are " + name;
        }
        public void setName(String name){
            this.name = name;
        }
    }
}
