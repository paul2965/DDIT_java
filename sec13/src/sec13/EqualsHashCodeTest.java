package sec13;

import java.util.*;

public class EqualsHashCodeTest {
	/*
	 * @�ؽ��Լ�(Hash function)�� ������ ������ �����͸� ������ ������ �����ͷ�
	 * �����ϴ� �Լ��̴�. �ؽ� �Լ��� ���� ������� ���� �ؽ�������, �ٽ��ڵ�, �ؽ�üũ�� �Ǵ� �����ϰ� �ؽö�� �Ѵ�.
	 * 
	 * HashSet, HashMap, Hashtable�� ���� �÷��� ��ü���� ����� ���,
	 * ��ü�� ���� �������� ���ϱ� ���� equals() �޼���� hashCode()�޼��带 
	 * ȣ���Ѵ�. �׷��� ��ü�� ���� ������ ���θ� �����Ϸ��� �� �޼��带 ������ �ؾ��Ѵ�.
	 * ��ü�� ������ ���δ� �����͸� �߰��� �� �˻��Ѵ�.
	 * 
	 * - equals : �� ��ü�� ������ ������ ��
	 * - hashcode() : ��ü�� ���� �ؽ��ڵ带 ��ȯ�ϴ� �޼���
	 * 
	 * - equals, hashcode�� ��Ģ
	 *  1. �� ��ü�� ������ �ݵ�� ���� hashcodefm�� ���Ѿ� �Ѵ�.
	 *  2. �� ��ü�� ������ equals()�� ȣ�������� true�� ��ȯ�ؾ��Ѵ�.
	 *  3. �� ��ü��  hash�� ���ٰ� �ؼ� �� ��ü�� �ݵ�� ���� ��ü�� �ƴϴ�.(�ؽ� �浹)
	 *     ������, �� ��ü�� ������ �ݵ�� hashcode�� ���ƾ��Ѵ�.
	 *  4.equals() �޼��带 override�ϸ� �ݵ�� hashcode()�� override �ؾ��Ѵ�.
	 *  5.hashcode()�� �⺻������ heap�޸𸮿� �ִ� �� ��ü�� ���� �޸� �ּ� ���� ������ ������� �� �������� ��ȯ�Ѵ�.
	 *    ��, Ŭ�������� hashcode�޼��带 override���� ������ ����� �� ��ü�� ���������� ���� �� �� ����.*/

	public static void main(String[] args) {
		Person p1 = new Person(1, "ȫ�浿");
		Person p2 = new Person(1, "ȫ�浿");
		Person p3 = new Person(1, "�̼���");
		
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
		System.out.println("p1 == p2 : " + (p1 == p2));
		
		Set<Person> set = new HashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		
		System.out.println("p1,p2 ��� �� ������");
		for (Person person : set) {
			System.out.println(person.getNum() + person.getName());
		}
		
		System.out.println("add(p3) ��� ���� ���� : " + set.add(p3));
		System.out.println("p3 ��� �� ������");
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
