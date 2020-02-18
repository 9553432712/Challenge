package com.mahesh.stream;

import java.util.ArrayList;

public class Streams {
	
	public static void main(String args[]) {
		match();
		//psvm();
		
	} 
	static void psvm() {
		
		ArrayList a = new ArrayList();
		a.add("mahesh");
		a.add("suresh");
		
		a.stream().filter(p -> p.equals("mahesh")).forEach(System.out::println);
		a.stream().filter(p -> p.equals("mahesh")).forEach(p->System.out.println(p));
				
		
		// TODO Auto-generated method stub

	}
	static void match() {
		ArrayList<Student> a = new ArrayList<Student>();
		Student s=new Student();
		s.name="mahesh";
		s.sal = 1200;
		a.add(s);
		Student s1=new Student();
		s1.name="naresh";
		s1.sal = 1200;
		a.add(s1);		
		a.stream().filter( x -> x.name.equals("naresh")).forEach(System.out::println);//.collect(Collectors.toList()));
		//a.parallelStream().sorted().collect(Collectors.toMap(s.name, Function.identity());
	}

}
class Student{
	int sal;
	String name;
	public String toString() {
		return name;
		
	}
}
