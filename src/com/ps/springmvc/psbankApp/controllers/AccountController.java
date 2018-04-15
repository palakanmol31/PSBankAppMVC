package com.ps.springmvc.psbankApp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ps.springmvc.psbankApp.model.Account;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class AccountController {
	
	@RequestMapping("/")
	public String showHomePage() {
 
		return "index";
	}
	
	@RequestMapping("/new")
	public String newAccount() {
 
		return "newAccount";
	}
	
	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}
	
	
	@RequestMapping(value="/saveAccount", method= RequestMethod.POST)
	public String saveAccount(Model model, HttpServletRequest request){
	/*	String acNo = request.getParameter("accountNo");
		String acHolderName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		//model.addAttribute("accountNo", acNo);
		//model.addAttribute("accountHolderName", acHolderName);
		//model.addAttribute("balance", balance);
		
		Account account = new Account();
		account.setAccountNo(Integer.valueOf(acNo));
		account.setAccountHolderName(acHolderName);
		account.setBalance(Integer.valueOf(balance));
		model.addAttribute("account", account);
		*/
		return "showAccount";
	}
	
}
