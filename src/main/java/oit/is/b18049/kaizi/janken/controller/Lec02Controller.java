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

    /**
   * @param hand
   * @param model
   * @return
   */

  @GetMapping("/lec02janken/{hand}")
  public String lec02janken(@PathVariable String hand, ModelMap model) {
    String judge = "";
    if(hand.equals("Gu")){
      judge += "Draw";
    }else if(hand.equals("Choki")){
      judge += "You Lose";
    }else if(hand.equals("Pa")){
      judge += "You Win";
    }
    model.addAttribute("Hand", hand);
    model.addAttribute("Judge", judge);

    return "lec02.html";
  }
}
