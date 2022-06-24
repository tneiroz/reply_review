package me.light.mapper;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import me.light.config.RootConfig;
import me.light.config.ServletConfig;
import me.light.model.Criteria;
import me.light.model.ReplyVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class, ServletConfig.class})
@WebAppConfiguration
public class ReplyMapperTest {

	@Autowired
	ReplyMapper mapper;
	
	@Ignore
	@Test
	public void getListAllTest() {
		System.out.println(mapper);
		mapper.getListAll()
		.forEach(vo -> System.out.println(vo));
	}
	@Test
	@Ignore
	public void insertTest() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(1L);
		vo.setReply("집에갈래");
		vo.setReplyer("테스트중");
		mapper.insert(vo);
	}
	@Ignore
	@Test
	public void readTest() {
		System.out.println(mapper.read(5L));
	}
	@Ignore
	@Test
	public void deleteTest() {
		System.out.println(mapper.delete(5L));
	}
	@Ignore
	@Test
	public void updateTest() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(2L);
		vo.setReply("이제 좀 시원하다");
		mapper.update(vo);
	}
	
	@Test
	public void listTest() {
		mapper.getListWithPaging(new Criteria(), 1L)
		.forEach(vo -> System.out.println(vo));
	}
	
}
