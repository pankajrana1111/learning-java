package com.pankaj;

class TestStatic{
static int a;
TestStatic(){
	System.out.println("Hello");
}
}


class TestStatic1{

public static void main(String...args){
TestStatic b=	new TestStatic();
System.out.println(TestStatic.a);
}	
}