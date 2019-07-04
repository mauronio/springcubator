import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Controlador {

	@RequestMapping("/")
	String home() {
		return String.join("\n"
		,"<!DOCTYPE html>\n" 
		,"  <html>\n"
		,"    <body>\n"
		,"      <h1>Ejemplo Microservicio</h1>\n"
		,"		<p/>\n"
		,"		<p>/mostrar?id=HOLA</p>\n"
		,"		<p>/sumar?a=2&b=3</p>\n"
		,"    </body>\n"
		,"  </html>\n");
	}

	@RequestMapping("/mostrar")
	String mostrar(@RequestParam(value="id") String id) {
		return "{'id' : '" + id + "'}";
	}

	@RequestMapping("/sumar")
	String sumar(
		@RequestParam(value="a") int a,
		@RequestParam(value="b") int b) {
		return "{ 'a' : " + String.valueOf(a) + ", 'b' : " + String.valueOf(b) + ", 'suma' : " + String.valueOf(a+b) + " }";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Controlador.class, args);
	}

}
