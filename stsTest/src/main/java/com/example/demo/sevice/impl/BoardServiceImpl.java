package com.example.demo.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.model.BoardModel;
import com.example.demo.sevice.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao dao;

	public BoardModel printBoard() {
		BoardModel board = dao.getBoard();
		return board;
	}

	
	

}
