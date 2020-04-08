package simple.basic_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BasicSpringApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringApplication.class, args);
	}
	
	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BasicSpringApplication.class);
    }

	//private static Class<BasicSpringApplication> applicationClass = BasicSpringApplication.class;
	

}

@RestController
class HelloController {
  
    @RequestMapping("/hello")
    String hello() {
          
             return "Hi! I'm working!";
               
    }
}
