package com.exam.project.controllerr;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exam.project.dao.DaoInterface;
import com.exam.project.model.Employee;

@RestController
public class HomeController {
	
	@Autowired
	DaoInterface dao;

	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public Employee register(@RequestBody Employee employee)
	{
		return dao.save(employee);
	}
	
	@RequestMapping(value = "/demo/{id}")
    public Optional<Employee> getShoopingList(@PathVariable ("id")int id) {
		return dao.findById(id);
    }
    
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Iterable<Employee> getItem() {
        return dao.findAll();
    }
    
    @PutMapping
    public Employee addShoppingList(@RequestBody Employee item) {
        return dao.save(item);
    }
    
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id) {
    	dao.deleteById(id);
    }
    
    @RequestMapping(value = "/test/{id}")
    public Optional<Employee> getTest(@PathVariable ("id")int id) {
		return dao.findById(id);
    }
}