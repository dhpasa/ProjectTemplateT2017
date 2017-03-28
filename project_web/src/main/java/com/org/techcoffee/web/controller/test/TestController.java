package com.org.techcoffee.web.controller.test;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.techcoffee.web.controller.base.BaseController;

@Controller
@RequestMapping("/Test")
public class TestController extends BaseController {

	/**
	 * Test
	 * 
	 * @param model
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "init")
	public String paysuccess(Model model, HttpServletResponse response, HttpSession session, String orderNo,
			String is_success) throws Exception {
		
		
		Thread.sleep(5000);
		return "/business/Test";

	}
}
