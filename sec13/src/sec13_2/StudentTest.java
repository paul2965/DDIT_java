package sec13_2;

import java.util.*;


public class StudentTest {
	public static void main(String[] args) {
		StudentTest stdTest = new StudentTest();
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("1","�̻��",80,60,70));
		students.add(new Student("4","ȫ�浿",80,60,70));
		students.add(new Student("3","��μ�",85,50,47));
		students.add(new Student("5","������",100,100,100));
		students.add(new Student("2","�ְ��",50,90,73));

		stdTest.setRanking(students); 
		
		Collections.sort(students);
		System.out.println("�й� ���� (��������)");
		for(Student std : students){
			System.out.println(std);
		}
		System.out.println();
		
		Collections.sort(students, new TotalSort());
		System.out.println("���� ���� (��������)");
		for(Student std : students){
			System.out.println(std);
		}
	}
	
	//��� �ű��
	public void setRanking(List<Student> stdList){
		for(Student std1 : stdList) { 
			int rank = 1;
			for(Student std2 : stdList){ 
				if(std1.getTotal() < std2.getTotal()) {
					rank++;
				}
			}
			std1.setRank(rank);
		}
	}
}

class Student implements Comparable<Student>{
	private String studentNum;	  	
	private String name;	
	private int korScore;		
	private int engScore;		
	private int mathScore;		
	private int totalScore;		
	private int rank;		
	
	public Student(String num, String name, int korScore, int engScore, int mathScore) {
		this.studentNum = num;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = korScore + engScore + mathScore;
	}

	public String getNum() {
		return studentNum;
	}

	public void setNum(String num) {
		this.studentNum = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return korScore;
	}

	public void setKor(int kor) {
		this.korScore = kor;
	}

	public int getEng() {
		return engScore;
	}

	public void setEng(int eng) {
		this.engScore = eng;
	}

	public int getMat() {
		return mathScore;
	}

	public void setMat(int mat) {
		this.mathScore = mat;
	}

	public int getTotal() {
		return totalScore;
	}

	public void setTotal() {
		this.totalScore = korScore + engScore + mathScore;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public int compareTo(Student std) {
		return studentNum.compareTo(std.getNum());
	}
	
	@Override
	public String toString() {
		return String.format("�л���ȣ : " + studentNum + ", �̸� : " + name + ", �������� : " + korScore	
				+ ", �������� : " + engScore + ", �������� : " + mathScore + ", ���� : " + totalScore
				+ ", ��� : " + rank);
	}
}