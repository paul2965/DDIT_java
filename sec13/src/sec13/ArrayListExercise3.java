package sec13;

import java.util.*;

public class ArrayListExercise3 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("1","�̻��",80,90,70));
		students.add(new Student("4","ȫ�浿",65,79,50));
		students.add(new Student("3","��μ�",85,50,47));
		students.add(new Student("5","������",100,100,100));
		students.add(new Student("2","�ְ��",50,90,73));
		
		Collections.sort(students);
		
		System.out.println("�й� ��������");
		for (Student stu : students) {
			System.out.println(stu);
		}
		
		Collections.sort(students, new scoreDesc());
		
		System.out.println();
		
		System.out.println("���� ��������");
		for(int i = 0 ; i < students.size(); i++) {
			System.out.println(students.get(i).toString());
		}
	}
}

class Student implements Comparable<Student> {
	private String studentNum;
	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private int rank;
	public int result;
	
	public Student(String studentNum, String name, int korScore, int engScore, int mathScore) {
		this.studentNum = studentNum;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = korScore + engScore + mathScore;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int result() {
		result = getEngScore() + getKorScore() + getMathScore();
		return result;
	}
	
	public String toString() {
		return String.format("�й� : " + getStudentNum() + ", �̸� : " + getName() + ", ���� ���� : " + getKorScore() 
		+ ", ���� ���� : " + getEngScore() + ", ���� ���� : " + getMathScore() + ", ��� : " + result() + ", ��� : " + getRank());
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(Integer.parseInt(studentNum), Integer.parseInt(o.studentNum));
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore() {
		this.totalScore = getEngScore() + getKorScore() + getMathScore();
	}
	
	public void setRanking(ArrayList<Student> stdList) {
		for (Student std1 : stdList) { // ���� ���
			int rank = 1;
			for (Student std2 : stdList) { // �� ���
				if (std1.getTotalScore() < std2.getTotalScore()) {
					rank++;
				}
			}
			std1.setRank(rank);
		}
	}
}