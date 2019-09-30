package test3;

public class NewLec extends Exam{
	private int com;
	NewLec(){
		this(0,0,0,0);
		com=0;
	}
	NewLec(int kor,int eng,int math,int com){
		this.kor=kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}
	public int total() {
		return kor+eng+math+com;
	}
}
