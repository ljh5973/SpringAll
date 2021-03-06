package com.team404.command;

import com.team404.util.Criteria;

import lombok.Data;

@Data
public class PageVO {
	
	
	private int total;	//게시판 총 게시글 수
	private int startPage;	//페이지에 보일 첫번째 번호
	private int endPage;	//페이지에 보일 마지막 번호
	private int realEnd;	//게시글 실제 마지막 페이지 번호

	private boolean prev;	//이전 버튼
	private boolean next;	//다음 버튼
	
	private int pageNum;
	private int amount;
	
	
	private Criteria cri;
	
	public PageVO(Criteria cri, int total) {
		
		this.cri=cri;
		this.total=total;
		this.pageNum=cri.getPageNum();
		this.amount=cri.getAmount();
		
		
		this.endPage=(int)(Math.ceil(this.pageNum/10.0)) *10;
		
		this.startPage=this.endPage-10 +1;
		
		this.realEnd=(int)Math.ceil(total/(double)this.amount);
		
		if(this.endPage>this.realEnd) {
			this.endPage=this.realEnd;
		}
		
		this.prev=this.startPage>1;
		
		this.next= this.realEnd>this.endPage;
		
		
	}
	

}
