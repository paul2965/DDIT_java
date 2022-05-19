package kr.or.ddit.basic;

import java.util.Iterator;
import java.util.Map;

public class T02GenericEnumTest {
	/*���׸� Ŭ���� ����
	 * class Ŭ������ <���׸�Ÿ�Ա���> {
	 * 	���׸�Ÿ�� ������;
	 *  ���׸�Ÿ�� �޼����() { -> ��ȯ���� �ִ� �޼��忡�� ���
	 *  	retrun ��;
	 *  }
	 * }
	 * 
	 * -- Ÿ�Թ��� --
	 * T : Type
	 * V : Value
	 * K : Key
	 * E : Element
	 * */
	
	public static void main(String[] args) {
		NonGenericClass ng1 = new NonGenericClass();
		ng1.setVal("�����ٶ�");
		
		NonGenericClass ng2 = new NonGenericClass();
		ng2.setVal(100);
		
		String rtnVal1 = (String) ng1.getVal();
		System.out.println("���ڿ� ��ȯ�� rtbng1 -> " + rtnVal1);
		
		Integer irtnVal2 = (Integer) ng2.getVal();
		System.out.println("���� ��ȯ�� irtng2 -> " + irtnVal2);
		
		MyGeneric<String> mg1 = new MyGeneric<String>();
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		
		mg1.setVal("�츮����");
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

