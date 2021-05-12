package hrms.caglar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.caglar.business.abstracts.DenemeService;
import hrms.caglar.entities.concretes.Deneme;

@RestController
@RequestMapping("api/deneme")
public class DenemeController {
	
	@Autowired
	private DenemeService denemeService;
	
	@GetMapping("/getall")
   public	List<Deneme> getAll()
	{
		return denemeService.getAll();
	}

	
	@GetMapping("/get")
	   public	String get()
		{
			return "Deneme";
		}
	
	
}
