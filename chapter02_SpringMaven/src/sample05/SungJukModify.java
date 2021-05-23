package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SungJukModify implements SungJuk {
	@Autowired
	@Qualifier("list")
	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.print("수정할 이름 입력 : ");
		String name = scan.next();
		
	
		int sw=0;
		for(SungJukDTO2 sungJukDTO2 : list) {
		//for(int i=list.size()-1; i>=0; i--) {
			if(sungJukDTO2.getName().equals(name)) {
//				sungJukDTO2 = list.get(i);
				System.out.println(sungJukDTO2);
				
				System.out.print("국어점수 입력 : ");
				int kor = scan.nextInt();
				System.out.print("영어점수 입력 : ");
				int eng = scan.nextInt();
				System.out.print("수학점수 입력 : ");
				int math = scan.nextInt();
				
				int tot = kor + eng + math;
				double avg = tot/3.0;
				
				sungJukDTO2.setKor(kor);
				sungJukDTO2.setEng(eng);
				sungJukDTO2.setMath(math);
				sungJukDTO2.setTot(tot);
				sungJukDTO2.setAvg(avg);
				
				sw=1;
			}
		}//for
		
		if(sw==0) {
			System.out.println("찾고자하는 이름이 없습니다");
		}else {
			System.out.println(name + "님의 데이터를 수정 하였습니다");
		}

	}           

}
