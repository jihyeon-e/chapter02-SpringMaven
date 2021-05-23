package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class HelloSpring {
	
	@Autowired
	@Qualifier("list")
	private List<SungJukDTO2> list;
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring)context.getBean("helloSpring");
		//List<SungJukDTO2> lis2 = (List<SungJukDTO2>)context.getBean("list");
		//System.out.println("lis2.size1 = "+lis2.size());
		helloSpring.menu(context);
		System.out.println("프로그램을 종료합니다");
	}
	
	public void menu(ApplicationContext context) {
		//List<SungJukDTO2> lis1 = (List<SungJukDTO2>)context.getBean("list");
		//System.out.println("sizezzz1 = "+lis1);
		//System.out.println("sizezzz2 = "+list);
		
		//System.out.println("size1 = "+list.size());
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk=null;
		int num=0;
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 끝");
			System.out.println("**************");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			
			//System.out.println("size = "+list.size());
			
			if(num==5) break;
			else if(num==1) sungJuk = (SungJuk)context.getBean("sungJukInput");
			else if(num==2) sungJuk = (SungJuk)context.getBean("sungJukOutput");
			else if(num==3) sungJuk = (SungJuk)context.getBean("sungJukModify");
			else if(num==4) sungJuk = (SungJuk)context.getBean("sungJukDelete");
			
			sungJuk.execute();
			
		} //while
		
	} //menu()

}
