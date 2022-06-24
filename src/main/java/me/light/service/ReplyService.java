package me.light.service;

import java.util.List;

import me.light.model.Criteria;
import me.light.model.ReplyVO;

public interface ReplyService {
	List<ReplyVO> getListAll();
	int register(ReplyVO vo);
	ReplyVO get(Long rno);
	int remove(Long bno);
	int modify(ReplyVO vo);
	List<ReplyVO> getList(Criteria cri,Long bno);
	
}
