package net.byg.runtime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：
 * @author byg
 * @date 2017年12月15日 下午5:03:30
 * @sinces 0.0.1
 */
@Controller
public class GreetingController {

	@RequestMapping(path="")
	public String index() {
		return "index";
	}
}
