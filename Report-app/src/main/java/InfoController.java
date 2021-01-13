import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deneme")
public class InfoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "merhabalar ben eclipse üzerinden çalışan garip bir endpoint im :(";
	}

}
