package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Student;

public class ListOperations {
 static List<Student> list = new ArrayList<Student>();
	static Map<Integer,Student> map = new HashMap<Integer,Student>();
	public List<Student> addStudent(Student student){
		System.out.println("Add List");
		list.add(student);
		return list;
		
	}

	public Map<Integer,Student> addMap(int value, Student student) {
		++value;
		map.put(value, student);
		return map;
	}
	
}
