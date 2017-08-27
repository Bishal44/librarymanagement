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

import com.bishal.lmscrud.Service.BorrowerService;
import com.bishal.lmscrud.model.Borrower;
import com.bishal.lmscrud.model.Library;


@Controller
public class BorrowerController {
	@Autowired
	BorrowerService Service;
	@RequestMapping(value="/signup",method = RequestMethod.GET)
	public String getsignupForm(@ModelAttribute Borrower borrower) {
		return "BorrowerSignup";
		
	}
	@RequestMapping(value="/borrowersignup" ,method = RequestMethod.POST)
	public String saveborrowerForm(@ModelAttribute Borrower borrower) {
		
		if(borrower!=null) {
			Service.saveBorrowerInfo(borrower);	
		}
		
		return "redirect:/borrowerList";
		
	}
	@RequestMapping(value="/deleteborrower",method = RequestMethod.GET)
	public String Deleteborrower(@RequestParam int id) {
		Service.deleteBorrowerInfo(id);
		return "redirect:/borrowerList";
		
	}
	@RequestMapping(value="/borrowerList",method = RequestMethod.GET)
	public String getborrowerList(Model model) {
		model.addAttribute("borrower", Service.getallBorrowerInfo());
		return "BorrowerList";
		
	}
	@RequestMapping(value="/editborrower",method = RequestMethod.GET)
	public String getborrowerEditForm( Model model,@RequestParam int id) {
		Borrower  borrower=Service.getBorrowerInfobyId(id);
		model.addAttribute("borrower", borrower);
		return "BorrowerEdit";
		
	}
	@RequestMapping(value="/update_borrowerinfo" ,method = RequestMethod.POST)
	public String UpdateBorrowerForm(@ModelAttribute Borrower borrower) {
		System.out.println("boorrower is is: "+borrower.getBorrowerId());
		if(borrower!=null) {
			Service.saveBorrowerInfo(borrower);	
		}
		
		return "redirect:/borrowerList";
		
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
	@ModelAttribute
	public Model getGenderList(Model model) {
		List<String>genderList=new ArrayList<String>();
		genderList.add("Male");
		genderList.add("Female");
		model.addAttribute("genderlist", genderList);
		return model;
		
	}
}
