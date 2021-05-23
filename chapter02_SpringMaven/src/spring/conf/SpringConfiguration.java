package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample03.SungJukDTO;
import sample03.SungJukImpl;
import sample05.SungJukDTO2;

@Configuration //스프링 설정파일 : 실행과 동시에 xml파일처럼 무조건 읽어라 - 일반 java파일이 아님
public class SpringConfiguration {
	
	//메소드명을 Bean명으로 인식한다
	@Bean
	public SungJukDTO sungJukDTO(){ //메소드의 이름은 반드시 생성할 Bean의 이름과 똑같이 잡아야 함
		return new SungJukDTO();
	}
	
//	@Bean
//	public SungJukImpl sungJukImpl() {
//		return new SungJukImpl();
//	}
	
	@Bean(name="sungJukImpl")
	public SungJukImpl getSungJukImpl() {
		return new SungJukImpl();
	}
	
	@Bean
	public List<SungJukDTO2> list() {
		return new ArrayList<SungJukDTO2>();
	}
	
	//@Bean(name="tests")
	//public List<SungJukDTO2> list() {
		//List<SungJukDTO2> testsa = new ArrayList<SungJukDTO2>();
		
		//System.out.println("configuration.size1 = "+testsa.size());
		//return ArrayList<SungJukDTO2>();
	//}
}

//모든 자바 파일은 반드시 new 생성해야 한다
//- new 클래스()