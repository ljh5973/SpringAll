package com.team404.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.team404.command.FreeBoardVO;
import com.team404.freeboard.service.FreeBoardService;

@Controller
@RequestMapping("/freeBoard")
public class FreeBoardController {
	
	
	@Autowired
	@Qualifier("freeService")
	private FreeBoardService freeService;
	
	
	//리스트화면
	@RequestMapping("/freeList")
	public String freeList(Model model) {
		
		ArrayList<FreeBoardVO> list = freeService.getList();
		model.addAttribute("list", list); //화면에 전달(여러값이라면 맵으로가능)
//		System.out.println(list.toString());
		
		return "freeBoard/freeList";
	}
	
	//등록화면
	@RequestMapping("/freeRegist")
	public String freeRegist() {
		return "freeBoard/freeRegist";
	}
	
	//상세화면
	@RequestMapping("/freeDetail")
	public String freeDetail(@RequestParam("bno") int bno) {
		
		//메서드이름 - getDetail()
		//sql문을 이용해서 FreeBoardVO에 결과값을 반환받습니다.
		//화면에서 사용할수 있도록 boardVO이름으로 model을 전달하고, 화면에 처리
		
		
		return "freeBoard/freeDetail";
	}
	
	
	
	//변경화면
	@RequestMapping("/freeModify")
	public String freeModify() {
		return "freeBoard/freeModify";
	}
	
	//등록요청
	@RequestMapping("/registForm")
	public String registForm(FreeBoardVO vo,
							 RedirectAttributes RA) {
		
		
		int result = freeService.regist(vo); //성공시 1반환, 실패시 0
		
		if(result == 1) {
			RA.addFlashAttribute("msg", "등록 처리 되었습니다");
		} else {
			RA.addFlashAttribute("msg", "등록에 실패했습니다. 다시 시도하세요");
		}
		
		
		return "redirect:/freeBoard/freeList"; //다시컨트롤러를 태움
	}
	

	
	
	
	
	
 	
}
