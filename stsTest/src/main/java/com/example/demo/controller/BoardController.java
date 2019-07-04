package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BoardModel;
import com.example.demo.sevice.BoardService;

@Controller
public class BoardController {

	
	@Autowired
	BoardService boardService;

	@RequestMapping("/hello") // URL 주소
	public String list(Model model) {
		System.out.println("111");
		BoardModel board = boardService.printBoard();
		model.addAttribute("id", board.getId());
		model.addAttribute("name", board.getName());
		System.out.println(board.getName());
		return "hello"; // JSP 파일명
	}
	
	
	@RequestMapping("/hello2") // URL 주소
	public String hello2() {
		return "hello"; // JSP 파일명
	}

}
