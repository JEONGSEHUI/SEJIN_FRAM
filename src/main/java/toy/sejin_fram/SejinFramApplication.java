package toy.sejin_fram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

// @SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
// @PropertySource("classpath:config.properties")
public class SejinFramApplication {

	@RequestMapping(value="/")
	String home(){
	
		return "redirect:/index";
	}

	public static void main(String[] args) {
		SpringApplication.run(SejinFramApplication.class, args);
	}

}
