package com.collections;

	import java.util.Map.Entry;
	import java.util.*;

	public class Main {

		public static void main(String[] args) {
			Employee e1=new Employee(101,"Sara",30000,"sara@cg.com");
			Employee e2=new Employee(102,"Rama",50000,"rama@cg.com");
			Employee e3=new Employee(105,"Thara",20000,"thara@cg.com");
			Employee e4=new Employee(110,"Mara",80000,"mara@cg.com");
			
			Department d1 = new Department(101,"IT","Boston");
			Department d2 = new Department(103,"CSE","Singapore"); 
			
			Map<Employee,Department> empDeptMap = new HashMap<>();
			empDeptMap.put(e1, d1);
			empDeptMap.put(e2, d2);
			empDeptMap.put(e3, d1);
			empDeptMap.put(e4, d2);
			
			Set<Entry<Employee,Department>> entrySet = empDeptMap.entrySet();
			Iterator<Entry<Employee,Department>>iterator= entrySet.iterator();
			
			for(Entry<Employee,Department> entry:entrySet) {
				Employee employee = entry.getKey();
				Department department = entry.getValue();
				
				System.out.println(employee);
				System.out.println(department);
				
			}
			
			
			
		}


}
