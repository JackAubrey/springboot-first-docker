/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author dcividin
 *
 */
@Controller
public class IndexController {
	@RequestMapping(value = {"/", "/index", "/index.html"})
	public String index(ModelAndView model) {
		return "index";
	}
}
