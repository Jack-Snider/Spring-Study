package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole() {
		
	}
	
	public InlineExamConsole( Exam exam ) {
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.printf( "total is %d, avg is %f\n ", exam.total(), exam.avg() );
	}



	@Override
	@Autowired // xml에서 setter방법인 property를 하는거와 같은 효과의 Annotation이다.
	public void setExam( Exam exam ) {
		
		this.exam = exam;
		
	}

}
