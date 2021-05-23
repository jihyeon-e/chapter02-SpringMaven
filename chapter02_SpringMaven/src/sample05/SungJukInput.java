package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2;
	@Autowired
	@Qualifier("list")
	private List<SungJukDTO2> list;
	
//	public void setSungJukDTO2(SungJukDTO2 sungJukDTO2) {
//		this.sungJukDTO2 = sungJukDTO2;
//	}
//
//	public void setList(List<SungJukDTO2> list) {
//		this.list = list;
//	}

	@Override
	public void execute() {
		//System.out.println("size = "+list.size());
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		int math = scan.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot/3.0;
		
		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);
		
		//System.out.println(name);
		//System.out.println(sungJukDTO2.getName());
		
		list.add(sungJukDTO2);
		
		//System.out.println("size"+list.size());
		//System.out.println("test"+sungJukDTO2.getName());
		
		//System.out.println(list.get(0).getName());
		
		System.out.println(name + "님의 데이터를 입력 하였습니다");
	}


}
