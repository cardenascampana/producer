package pe.gob.mef.hcardenas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProducerResource {
	
	
	@RequestMapping("/rest/producer/{user}")
	public String usuario(@PathVariable("user") String user) {
		return "Hola " + user;
	}
}
