package io.swagger.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation 
 */
@Controller
public class HomeController {
	@RequestMapping(value = {
			"*",
			"/",
			"/page",
	})					//RequestMapping这个注解会将 HTTP 请求映射到 MVC 和 REST 控制器的处理方法上
	public String index() {
		System.out.println("swagger-ui.html");
		return "redirect:swagger-ui.html";
	}
}

//输入localhost:8080/nfvi或localhost:8080/nfvi/page,都会映射到localhost:8080/nfvi/swagger-ui.html