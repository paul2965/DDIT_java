package sec13;

import java.util.Comparator;

public class scoreDesc implements Comparator<Student>{
	@Override
	public int compare(Student std1, Student std2) {
		if(std1.getTotalScore() == std2.getTotalScore()){
			return std1.getStudentNum().compareTo(std2.getStudentNum()) * -1;
		}else{
			return Integer.compare(std1.getTotalScore(), std2.getTotalScore()) * -1;
		}
		
	}
}
