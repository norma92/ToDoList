package it.softwareInside.NoteAppLezione22.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.softwareInside.NoteAppLezione22.models.ToDoList;
import it.softwareInside.NoteAppLezione22.services.ToDoListService;

@RestController
public class ToDoListRestController {

	@Autowired
	ToDoListService listS;
	
	@PostMapping("/add-list")
	public String add(@RequestBody ToDoList list) {
			
		return listS.addList(list);		
	}
	
	@PostMapping("/update-list")
	public String update(@RequestBody ToDoList list) {
		
		return listS.updateList(list);
	}
	
	@PostMapping("/find-list")
	public ToDoList find(@RequestParam Integer id) {
		
		return listS.findList(id);
	}
	
	@GetMapping("/all-list")
	public Iterable<ToDoList> printAll() {
		
		return listS.printAll();
	}
	
	@DeleteMapping("/remove")
	public String removeList(@RequestParam Integer id) {
		
		return listS.deleteList(id);
	}
	
	@DeleteMapping("/remove-all")
	public String removeAll() {
		
		return listS.deleteAll();
	}
	
}
