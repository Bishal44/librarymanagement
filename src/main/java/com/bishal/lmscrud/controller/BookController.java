package com.bishal.lmscrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bishal.lmscrud.Service.LmsService;
import com.bishal.lmscrud.model.Library;



@Controller
public class BookController {
	
@Autowired
	LmsService lmsservice;
	
@RequestMapping(value="/book_form",method = RequestMethod.GET)
public String getbookForm(@ModelAttribute Library library) {
	return "bookForm";
	
}
@RequestMapping(value="/save_bookinfo" ,method = RequestMethod.POST)
public String savebookForm(@ModelAttribute Library library) {
	
	if(library!=null) {
		lmsservice.saveBookInfo(library);	
	}
	
	return "redirect:/bookList";
	
}
@RequestMapping(value="/edit",method = RequestMethod.GET)
public String getbookEditForm( Model model,@RequestParam int id) {
	Library  library=lmsservice.getBookById(id);
	model.addAttribute("library", library);
	return "bookEdit";
	
}
@RequestMapping(value="/update_bookinfo" ,method = RequestMethod.POST)
public String UpdatebookForm(@ModelAttribute Library library) {
	
	if(library!=null) {
		lmsservice.saveBookInfo(library);	
	}
	
	return "redirect:/bookList";
	
}
@RequestMapping(value="/delete",method = RequestMethod.GET)
public String DeletebookForm(@RequestParam int id) {
	lmsservice.deleteBookInfo(id);
	return "redirect:/bookList";
	
}

@RequestMapping(value="/bookList",method = RequestMethod.GET)
public String getbookList(Model model) {
	model.addAttribute("books", lmsservice.getallBookInfo());
	return "bookList";
	
}
@ModelAttribute
public Model getDepartmentList(Model model) {
	List<String> departmentList=new ArrayList<String>();
	departmentList.add("BSC CSIT");
	departmentList.add("BIM");
	departmentList.add("CIVIL E");
	departmentList.add("COMPUTER E");
	departmentList.add("ELECRTICAL E");
	model.addAttribute("facultylist",departmentList);
	return model;
}
}
