import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/chao")
	String chao() {
		return "Chabela!";
	}

	@RequestMapping("/mostrar")
	String mostrar(@RequestParam(value="id") String id) {
		return "Id = " + id;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}
