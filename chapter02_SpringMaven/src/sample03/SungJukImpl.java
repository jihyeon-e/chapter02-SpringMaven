package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component
@ComponentScan("spring.conf")
public class SungJukImpl implements SungJuk {
	@Autowired //@Component로 생성된 bean들 중에서 같은 SungJukDTO(자료형) type을 찾아서 자동으로 값을 주입해라
	private SungJukDTO sungJukDTO;
	
	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		//System.out.println(sungJukDTO.toString());
		System.out.println(sungJukDTO);
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
	}

}






//TO.지현이에게
//지현아 니 자리 좋다..
//뭔가 집중도 잘 될 거 같아..
//정말 명당에 앉았구나
//뭔가 키보드도 좋고 다 좋은것같아..
//재밌겠다 얘..
//즐거운 하루 보내렴^ㅁ^
//-존경스러운 희선 언니-
