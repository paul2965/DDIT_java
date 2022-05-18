package sec13;

import java.util.*;

public class EqualsHashCodeTest {
	/*
	 * @해쉬함수(Hash function)는 임의의 길이의 데이터를 고정된 길이의 데이터로
	 * 매핑하는 함수이다. 해쉬 함수에 의해 얻어지는 값은 해쉬갑쉬값, 핵시코드, 해시체크성 또는 간단하게 해시라고 한다.
	 * 
	 * HashSet, HashMap, Hashtable과 같은 컬렉션 객체들을 사용할 경우,
	 * 객체가 서로 같은지를 비교하기 위해 equals() 메서드와 hashCode()메서드를 
	 * 호출한다. 그래서 객체가 서로 같은지 여부를 결정하려면 두 메서드를 재정의 해야한다.
	 * 객체가 같은지 여부는 데이터를 추가할 때 검사한다.
	 * 
	 * - equals : 두 객체의 내용이 같은지 비교
	 * - hashcode() : 객체에 대한 해쉬코드를 반환하는 메서드
	 * 
	 * - equals, hashcode의 규칙
	 *  1. 두 객체가 같으면 반드시 같은 hashcodefm를 지켜야 한다.
	 *  2. 구 객체가 같으면 equals()를 호출했을때 true를 반환해야한다.
	 *  3. 두 객체의  hash가 같다고 해서 두 객체가 반드시 같은 객체가 아니다.(해쉬 충돌)
	 *     하지만, 두 객체의 같으면 반드시 hashcode가 같아야한다.
	 *  4.equals() 메서드를 override하면 반드시 hashcode()도 override 해야한다.
	 *  5.hashcode()는 기본적으로 heap메모리에 있는 각 객체에 대한 메모리 주소 매핑 정보를 기반으로 한 정수값을 반환한다.
	 *    즉, 클래스에서 hashcode메서드를 override하지 않으면 절대로 두 객체가 같은것으로 간주 할 수 없다.*/

	public static void main(String[] args) {
		Person p1 = new Person(1, "홍길동");
		Person p2 = new Person(1, "홍길동");
		Person p3 = new Person(1, "이순신");
		
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("p1 == p2 : " + (p1 == p2));
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		
		System.out.println("p1,p2 등록 후 데이터");
		for (Person person : set) {
			System.out.println(person.getNum() + person.getName());
		}
		
		System.out.println("add(p3) 등록 성공 여부 : " + set.add(p3));
		System.out.println("p3 등록 후 데이터");
		for (Person person : set) {
			System.out.println(person.getNum() + person.getName());
		}
		
		
	}
}

class Person {
	private int num;
	private String name;
	
	public Person(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && num == other.num;
	}
	
	/*@Override
	public int hashCode() {
		return (name + num).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		
		return this.num == p.getNum() && this.name.equals(getName());
	*/
}
