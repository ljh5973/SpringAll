package com.team404.freeboard.service;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;

public interface FreeBoardService {

	public int regist(FreeBoardVO vo); //등록
	public ArrayList<FreeBoardVO> getList(); //조회
}
