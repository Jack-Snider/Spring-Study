package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
	
	}
	
	public GridExamConsole( Exam exam ) {
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.println( "이것은 잭 스나이더의 코드입니다." );
		System.out.println( "┌──────────┐─────────┐" );
		System.out.println( "│	total	│	avg	  │" );
		System.out.println( "└──────────└─────────┘" );
		System.out.printf( "%3d		,		%3.2f", exam.total(), exam.avg() );
		

	}



	@Override
	public void setExam( Exam exam ) {
		
		this.exam = exam;
		
	}

}
