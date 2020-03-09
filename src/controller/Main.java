package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;
import service.ListOperations;

public class Main {
	
	static List<Student> list =  new ArrayList<Student>();
	static Map<Integer,Student> map= new HashMap<Integer,Student>();
	public static void main(String[] args) throws IOException {
		
		String name;
		String dept;
		int id;
		int value = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ListOperations listoperations = new ListOperations();
	
		do {
		name = br.readLine();
		dept = br.readLine();
		id = Integer.parseInt(br.readLine());
		
		Student student = new Student();
		student.setName(name);
		student.setDept(dept);
		student.setId(id);
		
		list = listoperations.addStudent(student);
		map = listoperations.addMap(value,student);
		System.out.println("While part");
		}while(id!=0);
		System.out.println("Before display");
		if(list.isEmpty()) {
			System.out.println("list is not empty");
		}
		for(Student std:list) {
			System.out.println("Display");
			System.out.println(std.getId());
			System.out.println(std.getDept());
			System.out.println(std.getName());
		}
		
		for(Map.Entry<Integer, Student> maplist: map.entrySet()) {
			System.out.println("Key "+ maplist.getKey());
			System.out.println("Name"+ maplist.getValue().getName());
			System.out.println("Dept"+maplist.getValue().getDept());
		}

	}

}
