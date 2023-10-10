package com.tns.staticprogram;
//program to demonstrate static method and block

public class Myclass {
private int section;//instance variabe
private static int srNo;//static variable

//static block
static {
	System.out.println("---staticblock---");
	srNo=1090;
}
//default constructor
Myclass(){
	System.out.println("---default constructor---");
srNo++;
section++;

}
static void display() {
	//System.out.println("section=+section");
	System.out.println("serialNo"+srNo);
}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}

}

