package hrms.caglar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.caglar.business.abstracts.JopPositionService;
import hrms.caglar.entities.concretes.JopPosition;


@RestController
@RequestMapping("api/positions")
public class JopPositionController {
	
	@Autowired
	private JopPositionService jopPositionService;

	

	@GetMapping("/getall")
	public List<JopPosition> getAll()
	
	{
	
	
		
		return jopPositionService.getAll();
	}
	
	
	@GetMapping("/getones")
	public String get1()
	{
		return "ÜRÜjkhjklhjklhjkN";
	}
	
}
