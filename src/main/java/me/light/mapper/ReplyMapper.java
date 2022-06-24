package me.light.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.light.model.Criteria;
import me.light.model.ReplyVO;

public interface ReplyMapper {
	List<ReplyVO> getListAll();
	int insert(ReplyVO vo);
	ReplyVO read(Long rno);
	int delete(Long bno);
	int update(ReplyVO vo);
	List<ReplyVO> getListWithPaging(@Param ("cri") Criteria cri, @Param("bno")Long bno);
	
}
