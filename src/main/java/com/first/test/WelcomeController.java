package com.first.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ddokk
 *
 */
@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
