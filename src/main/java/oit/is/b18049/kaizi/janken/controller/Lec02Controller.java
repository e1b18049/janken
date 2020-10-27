package oit.is.b18049.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Lec02Controller {

  /**
   * @param name
   * @param model
   * @return
   */

  @GetMapping("/lec02")
  public String lec02(@RequestParam String name, ModelMap model) {
    model.addAttribute("Name", name);
    return "lec02.html";
  }
}
