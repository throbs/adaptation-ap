package io.swagger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @EnableAutoConfiguration: spring boot的注解，一般只用于主类
 * 是无xml配置启动的关键部分,明确指定了扫描包的路径为其修饰的主类的包（这也就是为什么主类要放在根包路径下的原因
 * 
 * @ComponentScan 进行包的扫描，扫描路径由@EnableAutoConfiguration指定了
 * 
 * 主类要位于根包路径下，方便之后的扫描(We generally recommend that you locate your main application class in a root package above other classes.)
 * 
 **/
@SpringBootApplication						//引导应用程序，开启组件扫描和自动配置
@EnableSwagger2								//也可称为@Abracadabra，配置开启了Spring Boot自动配置的魔力
@ComponentScan(basePackages = "io.swagger")		//启用组件扫描
public class Swagger2SpringBoot implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new ExitException();
		}
	}

	public static void main(String[] args) throws Exception {				//负责启动引导应用程序
		new SpringApplication(Swagger2SpringBoot.class).run(args);
	}

	class ExitException extends RuntimeException implements ExitCodeGenerator {
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}
}