package com.pankaj;
class Methods{
static int intID;
static void updateId(int intId){
intID=intId;
}
public static void main(String[] args){
intID=1000;
updateId(1001);
System.out.println(intID);
}
}