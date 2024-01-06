import  java.io.*;

public class PassByValue {
int data=50;  
 void change(int data){  
 this.data=data+100;
 }  
 public static void main(String args[]){  
 PassByValue op=new PassByValue();   
 System.out.println("before change "+op.data);  
  op.change(500);  
  System.out.println("after change "+op.data);  
 }  }  
