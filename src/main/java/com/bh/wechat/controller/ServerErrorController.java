package com.bh.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServerErrorController extends BaseController {

    @RequestMapping(value = "/tomcatError", method = RequestMethod.GET)
    public String tomcatError(Model model) {
        return "redirect:/error?errorMessage=";
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error(@RequestParam("errorMessage") String errorMessage, Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error");
        if ((errorMessage != null) && !errorMessage.isEmpty()) {
            mav.addObject("errorMessage", errorMessage);
        }

        return mav;
    }

    @RequestMapping(value = "/tomcatCrash", method = RequestMethod.GET)
    public String tomcatCrash(Model model) {
        return "redirect:/crash?errorMessage=";
    }

    @RequestMapping(value = "/crash", method = RequestMethod.GET)
    public ModelAndView crash(@RequestParam("errorMessage") String errorMessage, Model model) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("crash");
        if ((errorMessage != null) && !errorMessage.isEmpty()) {
            mav.addObject("errorMessage", errorMessage);
        }

        return mav;
    }
}
