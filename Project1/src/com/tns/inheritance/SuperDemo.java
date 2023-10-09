package com.tns.inheritance;

class parent{
	int var=100;
}
public class SuperDemo  {
     int var=50;
     void display () {
    	 System.out.println("the value is"+var);
    	 System.out.println("");
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperDemo ob=new SuperDemo();
		ob.display();		

	}

}
