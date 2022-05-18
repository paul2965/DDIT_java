package sec13_2;

import java.util.Comparator;

class TotalSort implements Comparator<Student>{
	@Override
	public int compare(Student std1, Student std2) {
		if(std1.getTotal() == std2.getTotal()){
			return std1.getNum().compareTo(std2.getNum()) * -1;
		} else {
			return Integer.compare(std1.getTotal(), std2.getTotal()) * -1;
		}
	}
}