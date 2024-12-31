package com.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	private Integer employeeId,employeeAge;
	private String employeeName, department,gender;
	private Double employeeSalary;
	public Employee(Integer employeeId, Integer employeeAge, String employeeName, String department, String gender,
			Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeAge = employeeAge;
		this.employeeName = employeeName;
		this.department = department;
		this.gender = gender;
		this.employeeSalary = employeeSalary;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeAge=" + employeeAge + ", employeeName=" + employeeName
				+ ", department=" + department + ", gender=" + gender + ", employeeSalary=" + employeeSalary + "]";
	}
	
	

	
}

public class StreamAPIDemo01 
{
	public static List<Employee> getListOfEmployee()
	{
		  Employee e1=new Employee(222, 31, "Scott Kohli", "IT", "Male", 45000.01);
		  Employee e2=new Employee(666, 27, "Mis Mohini Sharma", "Sales", "Female", 55213.99);
		  Employee e3=new Employee(333, 18, "Lalita", "HR", "Female", 32561.12);
		  Employee e4=new Employee(111, 45, "Ravi", "IT", "Male", 65213.01);
		  Employee e5=new Employee(888, 25, "Mohan Kumar", "HR", "Male", 45000.01);
		  Employee e6=new Employee(555, 65, "Zuber", "Sales", "Male", 21213.01);
		  Employee e7=new Employee(777, 41, "Kajal", "IT", "Female", 72213.01);
		  Employee e8=new Employee(444, 15, "Aman", "HR", "Male", 17213.01);
		  Employee e9=new Employee(444, 55, "Aman02", "HR", "Male", 17213.01);
		  Employee e10=new Employee(999, 35, "Chaman", "HR", "Male", 52213.01);
		  List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
		  return list;
	}
    @SuppressWarnings("unchecked")
	public static void main(String[] args) 
    {
//      //1) employee filter by gender  
//      getListOfEmployee().stream().filter((e)->e.getGender().equals("Female")).forEach((e)->System.out.println(e)); 
//      System.err.println("-------------------------------------------------------------------");
//      System.out.println();
     //2) Filter employee by age  above 30 age>30
      
//      getListOfEmployee().stream().filter((e)->e.getEmployeeAge()>35).forEach((e)->System.out.println(e));
//      System.err.println("-------------------------------------------------------------------");
     
    	//3. Filter Employees by Salary:
    	
    	//getListOfEmployee().stream().filter((e)->e.getEmployeeSalary()>35000).forEach((e)->System.out.println(e));
      
    	//4. Map Employee Names:
       // - Create a list of employee names (Strings).
    	
      //getListOfEmployee().stream().map((e)->e.getEmployeeName()).forEach((e)->System.out.println(e));
    	
    	//5. Calculate Average Salary:
       // - Calculate the average salary of all employees.
    	
   // OptionalDouble average=	getListOfEmployee().stream().mapToDouble((e)->e.getEmployeeSalary()).average();
   // System.out.println(average.getAsDouble());
    	
    //	6. Find Maximum Salary:
    //- Find the employee with the highest salary.
    	
   // Optional<Employee> max=	getListOfEmployee().stream().max((e1,e2)->e1.getEmployeeSalary().compareTo(e2.getEmployeeSalary()));
   // System.out.println(max.get().getEmployeeSalary());

   // Double max=   getListOfEmployee().stream().mapToDouble(Employee::getEmployeeSalary).max().orElseThrow();
   // System.out.println(max);
    	
   // Integer maxAge=   getListOfEmployee().stream().mapToInt(Employee::getEmployeeAge).max().orElseThrow();
   // System.out.println(maxAge);
    	
    //	7.Group Employees by Gender:
    	
   //  getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getGender)).forEach((e1,e2)->System.out.println(e1+"\n"+e2));
    
    //8. Count Male Employees:
    	
   // Long count=	getListOfEmployee().stream().filter((e)->e.getGender().equals("Male")).collect(Collectors.counting());
   // System.out.println(count);
    	
    // 9. Sum of All Salaries:
    // Calculate the total sum of salaries for all employees.
    
    //Double sumOfSalary=   getListOfEmployee().stream().mapToDouble(Employee::getEmployeeSalary).sum();
   //   System.out.println(sumOfSalary);
    	
    //	10. Sort Employees by Name:
    // Sort the employees by their names in alphabetical order.
    	
    //   getListOfEmployee().stream().sorted((e1,e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName())).forEach((e)->System.out.println(e));
    
    //  11. Sort Employees by Age:
    	
    //	getListOfEmployee().stream().sorted((e1,e2)->e1.getEmployeeAge().compareTo(e2.getEmployeeAge())).forEach((e)->System.out.println(e));;
    
    // 12. Sort Employees by Salary:
    	
    // getListOfEmployee().stream().sorted((e1,e2)->e2.getEmployeeSalary().compareTo(e1.getEmployeeSalary())).forEach((e)->System.out.println(e));
    	
    //	13. Find Oldest Employee:
    
  //  Optional<Employee> emp=getListOfEmployee().stream().max((e1,e2)->e1.getEmployeeSalary().compareTo(e2.getEmployeeSalary()));
  //	System.out.println(emp.get());
    	
    
     // 14. Group Employees by Age:
     //- Group employees into age groups (e.g., 20-30, 31-40, etc.)
     // and return a map with age group as the key and a list of 
     //  	employees as the value.
    	
//    	getListOfEmployee().stream()
//		.collect(Collectors.groupingBy((t) ->
//						{int age = t.getEmployeeAge();
//							if(age>=20 && age<=30)
//								return "20-30";
//							else if (age>=31 && age<=40)
//								return "31-40";
//							else
//								return "40+";
//						})).forEach((key,value)->System.out.println(key+ " - "+value ));
//    	
    	
//     getListOfEmployee().stream().collect(Collectors.groupingBy((e)->
//     {
//    	 int age=e.getEmployeeAge();
//    	 if(age<20)return "Below 20";
//    	 if(age>20 && age<=30)
//    		 return "20-30";
//    	 if(age>30 && age<=40)
//    		 return "31-40";
//    	 else return "40+";
//     })).forEach((key,value)->System.out.println(key+" "+value));;
    	
  
   // 	Find Employees with a Specific Age:
   //   Find all employees who are exactly 35 years old.
    	
   // 	getListOfEmployee().stream().filter((e)->e.getEmployeeAge()==35).forEach(System.out::println);
    	
    //	Calculate the Sum of Salaries by Gender:
    //  Calculate the sum of salaries for each gender (i.e., male and female)
    	
    //	getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(Employee::getEmployeeSalary))).forEach((key,value)->System.out.println(key+" \n"+value));
    
   	// Find Employees with Names Starting with "J":
    	
   // getListOfEmployee().stream().filter((e)->e.getEmployeeName().startsWith("L")).forEach(System.out::println);
    
   // 18. Calculate the Average Salary for Male and Female Employees:
  
   // getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getEmployeeSalary))).forEach((k,v)->System.out.println(k+" "+v));
    	
    // 19. Find the Top N Highest Paid Employees:
    
  //  getListOfEmployee().stream().sorted((e1,e2)->e2.getEmployeeSalary().compareTo(e1.getEmployeeSalary())).limit(5).forEach(System.out::println);
     
   // 	21. Find the Three Lowest-Paid Employees:
    	
  // Optional<Employee> minSalary=  getListOfEmployee().stream().min((e1,e2)->e1.getEmployeeSalary().compareTo(e2.getEmployeeSalary()));
    	
  //    System.out.println(minSalary.get());
    	
    	
   // 22. Sort Employees by Name Length:
   // Sort employees by the length of their names (shortest to longest).
    
   //   getListOfEmployee().stream().sorted((e1,e2)->e1.getEmployeeName().length()-(e2.getEmployeeName().length())).forEach(System.out::println);	
   
    
    // 23. Group Employees by Age Range:
    // Group employees into custom
    // age ranges (e.g., 20-29, 30-39, etc.)
    	
//    	getListOfEmployee().stream().collect(Collectors.groupingBy((e)->
//    	{
//    		int age=e.getEmployeeAge();
//    		if(age<=19)return "Under 19";
//    		if(age>=20 && age<=29) return "20-29";
//    		if(age>=30 && age<=39) return "30-39";
//    		else return "40+";
//    	})).forEach((k,v)->System.out.println(k+" \n"+v)); 
    	
    	
   	// 24. Find the Average Salary of Employees Aged 30 or Younger:
    // Calculate the average salary of employees aged 30 or younger.
    	
    //	getListOfEmployee().stream().filter((e)->e.getEmployeeAge()>=30).forEach(System.out::println);
  
    //25. Find the Names of Male Employees with Salaries Over $60,000:
    // Retrieve the names of male employees with salaries over $60,000.	
    
   // getListOfEmployee().stream().filter((e)->e.getEmployeeSalary()>45000 && e.getGender().equals("Male")).forEach((e)->System.out.println(e.getEmployeeName()));	
    	
    //26. Find the Youngest Female Employee:
    // Find the youngest female employee.
    	
  //  Optional<Employee> emp= getListOfEmployee().stream().filter((e)->e.getGender().equals("Female")).max((e1,e2)->e1.getEmployeeAge().compareTo(e2.getEmployeeAge()));	
  // System.out.println(emp.get().getEmployeeName());
  
  //27. Retrieve the Names of Employees in Reverse Order:
  // Get a list of employee names in reverse order (from the last employee to the first).
   
  //	28. Find the Highest Salary Among Female Employees:
  // Find the highest salary among female employees
    
   //Optional<Employee> emp=   getListOfEmployee().stream().filter((e)->e.getGender().equals("Female")).max((e1,e2)->e1.getEmployeeSalary().compareTo(e2.getEmployeeSalary()));	
   
  // System.out.println(emp.get().getEmployeeName()+" "+emp.get().getEmployeeSalary());
   
  //29. Group Employees by Age and Gender:
  // Group employees by both age and gender and return a multi-level map.
   
  // getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.groupingBy(Employee::getEmployeeAge))).forEach((k,v)->System.out.println(k+" "+v)); 
    
   //30. Find the Sum of Salaries for Employees with Names Containing "Smith":
   // Calculate the sum of salaries for employees whose names contain the substring "Smith."

   // getListOfEmployee().stream().filter((e)->e.getEmployeeName().equals("Lalita")).forEach((e)->System.out.println(e.getEmployeeSalary()));	
    
   //31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
   // Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.
     
   // getListOfEmployee().stream().filter((e1)->(e1.getEmployeeAge()>=30 && e1.getEmployeeAge()<=40) && (e1.getEmployeeSalary()>=50000 && e1.getEmployeeSalary()<60000)).forEach(System.out::println);
    
    //32. Calculate the Total Number of Employees:
    // Determine the total count of employees.	
 
   // long count=	getListOfEmployee().stream().count();
    //System.out.println(count);
    
    //33. Find the Most Common Age Among Employees:
    // Determine the age that is most common among the employees. 	
   
    //34. Find the Median Salary:
    // Calculate the median salary of all employees.
    	
    //35. Group Employees by Age and Count:
    // Group employees by age and count the number of employees in each age group.

//   Map<String,Long> list=  getListOfEmployee().stream().collect(Collectors.groupingBy((e)->
//   {
//	   int age=e.getEmployeeAge();
//	   if(age<=19)
//		   return "Under-19";
//	   else if(age>=20 && age<=30) return "20-30";
//	   else if(age>=31 && age<=40) return "31-40";
//	   else return "40+";
//   },Collectors.counting()));
//   
//         for(Map.Entry<String,Long> l:list.entrySet())
//         {
//        	  System.out.println(l.getKey()+" "+l.getValue());
//         }
   
     //36. Find the Employee with the Longest Name:
     // Find the employee with the longest name.
    	
    //	getListOfEmployee().stream().sorted((e1,e2)->e2.getEmployeeName().length()-e1.getEmployeeName().length()).limit(1).forEach((e)->System.out.println(e.getEmployeeName()));
    
    //37. Calculate the Sum of Salaries for Each Age:
    // Calculate the sum of salaries for each distinct age in a map.
	
//      getListOfEmployee().stream().collect(Collectors.groupingBy((e)->{
//    	  int age=e.getEmployeeAge();
//    	  if(age<=19)return "Under-19";
//    	  else if(age>=20 && age<=30) return "20-30";
//    	  else if(age>=31 && age<=40) return "31-40";
//    	  else return "40+";
//      },Collectors.summingDouble(Employee::getEmployeeSalary))).forEach((k,v)->System.out.println(k+" :"+v));
    	 
     //38. Sort Employees by Age, Then by Salary:
     // Sort employees first by age in ascending order, and then by salary in descending order.
    
//      getListOfEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmployeeAge).thenComparing(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed())).forEach((e)->System.out.println(e));
//      
//      System.err.println("--------------------------------------------");

//      getListOfEmployee().stream()
//		.sorted(Comparator.comparingInt(Employee::getEmployeeAge)
//				.thenComparing(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed()))
//		.forEach(System.out::println);

	
    //39. Find Employees Whose Names Contain More Than One Word:
    // Retrieve employees whose names consist of more than one word.

//    getListOfEmployee().stream().filter((e)->{
//    	String names=e.getEmployeeName();
//    	String name[]=names.split(" ");
//    	if(name.length>1)
//    	{
//    		return true;
//    	}
//    	return false;
//    	
//    }).forEach((e)->System.out.println(e.getEmployeeName()));
    	
      //40. Find the Two Highest Paid Female Employees:
      // Find and display the names of the two highest-paid female employees.
  //  getListOfEmployee().stream().filter((e)->e.getGender().equals("Female")).sorted((e1,e2)->e2.getEmployeeSalary().compareTo(e2.getEmployeeSalary())).limit(2).forEach(System.out::println);

     //41. Find the Employee with the Highest Salary in Each Gender:
     // Find the employee with the highest salary for each gender (male and female).
      
//      Map<String,List<Employee>> list=getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getGender));
//    	
//      list.forEach((k,v)->System.out.println(k+" "+v.get(0)));
       
     //42. Retrieve Employees with Unique Names:
     //- Find employees with unique names (no duplicate names in the list).

      //43. Find the Names of Employees in Uppercase:
      // Get a list of employee names in uppercase.
    	
    //	getListOfEmployee().stream().map((e1)->e1.getEmployeeName().toUpperCase()).forEach(System.out::println);
       
      //44. Calculate the Salary Range (Min-Max) for Each Age Group:
      // Calculate the salary range (minimum and maximum) for each distinct age group.
       
		/*getListOfEmployee().stream().collect(Collectors.groupingBy((e)->
		{
			int age=e.getEmployeeAge();
			if(age<=19) return "Under 19";
			else if(age>=20 && age<=30) return "20-30";
			else if(age>=31 && age<=40) return "31-40";
			else return "41+";
		}));
		*/
    	
    	//45. Filter Employees by First Name Initial:
        //- Retrieve employees whose first name starts with a specific initial (e.g., 'A').

    	 // getListOfEmployee().stream().filter((e)->e.getEmployeeName().startsWith("A")).forEach(System.out::println);
    	
        //46. Group Employees by Age and List Only Unique Salaries:
        // Group employees by age and display a list of unique salaries for each age group.

        //47. Find Employees with the Same Salary:
        //- Identify and display employees who have the same salary.

		/*getListOfEmployee().stream()
		.collect(Collectors.groupingBy(Employee::getEmployeeSalary))
		.entrySet()
		.stream() // k is entry
		.filter(k -> k.getValue().size()>1)
		.forEach(entry ->  // Map (Double , List<>)
		{
		//	System.out.println(entry.getKey());
			entry.getValue().forEach(System.out::println);
		
		});
		*/
//    	getListOfEmployee().stream()
//    	.collect(Collectors.groupingBy(Employee::getEmployeeSalary)).entrySet().stream().filter((k)->k.getValue().size()>1).forEach((e)->e.getValue().forEach(System.out::println));;
        
    	//48. Find the Employee with the Shortest Name Among Male Employees:
        // Find the male employee with the shortest name.
    	
    	//getListOfEmployee().stream().sorted((e1,e2)->e1.getEmployeeName().length()-e2.getEmployeeName().length()).limit(1).forEach(System.out::println);
//         Optional<Employee> min = getListOfEmployee().stream().filter((e)->e.getGender().equals("Male")).min((e1,e2)->Integer.compare(e1.getEmployeeName().length(), e2.getEmployeeName().length()));
//    	
//         System.out.println(min.get());
//      Employee emp = getListOfEmployee().stream().filter((e)->e.getGender().equals("Male"))
//    		  .min((e1,e2)->Integer.compare(e1.getEmployeeName().length(), e2.getEmployeeName().length())).orElseThrow();
//
//        System.out.println(emp);
    	
        //49. Find the Most Common Salary Value:
        // Determine the salary value that appears most frequently among the employees.

       //50. Find the Oldest Employee with the Lowest Salary:
       // Find the oldest employee with the lowest salary.
    	
      // Employee emp=	getListOfEmployee().stream().sorted(Comparator.comparingInt(Employee::getEmployeeAge).reversed()).min(Comparator.comparing(Employee::getEmployeeSalary)).get();

      // System.out.println(emp);
    	
      //51. Filter Employees by Gender:
      // Retrieve a list of all female employees.
    	
		/*getListOfEmployee()
		.stream()
		.filter(k->k.getGender().equals("Female"))
		.forEach(System.out::println);*/
    	
    	//55. Calculate Average Salary:
        //- Calculate the average salary of all employees.
    	
		/*double sal= getListOfEmployee().stream().mapToDouble(Employee::getEmployeeSalary).average().orElseThrow();
		
		System.out.println(sal);*/
    	
    	

    }
}







