package com.team404.freeboard.mapper;

import java.util.ArrayList;

import com.team404.command.FreeBoardVO;

public interface FreeBoardMapper {

	public int regist(FreeBoardVO vo); //등록
	public ArrayList<FreeBoardVO> getList(); //조회
}
