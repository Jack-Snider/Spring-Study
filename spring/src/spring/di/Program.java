package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	
	public static void main(String[] args) {
		
		/*
		 * 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole();
		 
		console.setter( exam );
		*/
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext( "/spring/di/settings.xml" );
		
		Exam exam = context.getBean( Exam.class );
		System.out.println( exam.toString() );
		
		
		//	bean의 id로 꺼내게 된다면 반환타입이 Object이기 떄문에 casting을 해줘야 한다.
		//	ExamConsole console = ( ExamConsole ) context.getBean( "console" );
		
		//	자료형으로 꺼내기
		//	ExamConsole console = context.getBean( ExamConsole.class );
		//	ExamConsole console = context.getBean( InlineExamConsole.class );
		ExamConsole console = ( ExamConsole ) context.getBean( "InlineExamConsole" );
		//	new InlineExamConsole()
		
		console.print();
		
	}
	
}
