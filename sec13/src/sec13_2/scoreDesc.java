package sec13_2;

import java.util.Comparator;

public class scoreDesc implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.result > o2.result) {
			return -1;
		} else if(o1.result == o2.result) {
			return 0;
		} else {
			return 1;			
		}
	}
}
