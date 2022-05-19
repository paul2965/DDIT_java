package kr.or.ddit.basic;

import java.util.Iterator;
import java.util.Map;

public class T02GenericEnumTest {
	/*제네릭 클래스 선언
	 * class 클래스명 <제네릭타입글자> {
	 * 	제네릭타입 변수명;
	 *  제네릭타입 메서드명() { -> 반환값이 있는 메서드에게 사용
	 *  	retrun 값;
	 *  }
	 * }
	 * 
	 * -- 타입문자 --
	 * T : Type
	 * V : Value
	 * K : Key
	 * E : Element
	 * */
	
	public static void main(String[] args) {
		NonGenericClass ng1 = new NonGenericClass();
		ng1.setVal("가나다라");
		
		NonGenericClass ng2 = new NonGenericClass();
		ng2.setVal(100);
		
		String rtnVal1 = (String) ng1.getVal();
		System.out.println("문자열 반환값 rtbng1 -> " + rtnVal1);
		
		Integer irtnVal2 = (Integer) ng2.getVal();
		System.out.println("정수 반환값 irtng2 -> " + irtnVal2);
		
		MyGeneric<String> mg1 = new MyGeneric<String>();
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		
		mg1.setVal("우리나라");
		mg2.setVal(500);
		
		rtnVal1 = mg1.getVal();
		irtnVal2 = mg2.getVal();
		
		System.out.println(rtnVal1);
		System.out.println(irtnVal2);
	}
}


class NonGenericClass {
	private Object val;

	public Object getVal() {
		return val;
	}

	public void setVal(Object val) {
		this.val = val;
	}
}

class MyGeneric<T>{
	private T val;

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
}

