package com.employee.empService;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.empDao.EmpDao;
import com.employee.empEntity.Employee;
import com.employee.empRepository.empRepository;
import com.employee.exception.AgeNotFoundException;
import com.employee.exception.IdNotFoundException;
import com.employee.exception.NameNotFoundException;

@Service
public class EmpService {
@Autowired 
EmpDao ed;
@Autowired
empRepository er;
public String SingleObject(Employee e) {
	return ed.SingleObject(e);
}
public String listobject( List<Employee>e) {
	return  ed.listobject(e);
}
public List<Employee>getall() {
	return ed.getall();
}
public Employee getone( int id) {
	return ed.getone(id);
}
public String deleteone( int a) {
	return ed.deleteone(a);
}
public Integer getmax() {
	List<Employee>a=er.findAll();
	int max=a.stream().map(x->x.getSalary()).max(Comparable::compareTo).get();
	return max;
}
public List<String>getname() {
	List<Employee>e=er.findAll();
	List<String>a=e.stream().map(x->x.getName()).collect(Collectors.toList());
	return a;
}
public Employee secmaxob() {
	List<Employee>e=er.findAll();
    Employee a=e.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().get();
	return a;
}
public int secmax() {
	List<Employee>e=er.findAll();
	int a=e.stream().map(x->x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	return a;
}
public List<Employee>getsalary(int a,int b) {
	List<Employee>e=er.findAll();
	List<Employee>emp=e.stream().filter(x->x.getSalary()>=a&&x.getSalary()<=b).collect(Collectors.toList());
	return emp;
}
public List<Employee>getdetails(String a){
	List<Employee>e=er.findAll();
	List<Employee>empd=e.stream().filter(x->x.getName().equals(a)).collect(Collectors.toList());
	return empd;
}
public String changename(Employee e,int a) {
	return ed.changename(e,a);
}
public Long findcount() {
	List<Employee>e=er.findAll();
	long count=e.stream().map(x->x.getId()).count();
	return count;
}
public int gettotal() {
	List<Employee>e=er.findAll();
	Integer total=e.stream().collect(Collectors.summingInt(x->x.getSalary()));
	return total;
			}
public List<Employee> getAll() {
	return ed.getAll();
}
public List<Employee> getname1(String a){
	return ed.getname1(a);
}
public List<Employee> getdetails(int a,int b){
	return ed.getdetails(a,b);
}
public List<String> getname2(){
	return ed.getname2();
}
public int getmax1() {
	return ed.getmax1();
}
public Employee getmax1ob() {
	return ed.getmax1ob();
}
public int getsecmax1() {
	return ed.getsecmax1();
}
public Employee getsecmax1ob() {
	return ed.getsecmax1ob();
}
public List<Employee>findbyname(String a) {
	return ed.findbyname(a);
}
public List<Employee>findbyname1(String a){
	return ed.findbyname1(a);
}
public List<Employee>getallDetails() {
	return ed.getallDetails();
}
//public List<String>getnameonly() {
	//return ed.getnameonly();
//}
public String getname3(String a) {
	return ed.getname3(a);
}
public List<String> getname4(int a,int b){
	return ed.getname4(a, b);
}
public int getmax2() {
	return ed.getmax2();
}
public Employee getmax2ob() {
	return ed.getmax2ob();
}
public int getsecmax2() {
	return ed.getsecmax2();
}
public Employee getsecmax2ob() {
	return ed.getsecmax2ob();
}
public List<Employee>findbyname2(String a){
	return ed.findbyname2(a);
}
public List<Employee>findbyname4(String a){
	return ed.findbyname4(a);
}

//exception handling
public List<Employee>namenotfoundex(String a) throws NameNotFoundException {
	if(ed.namenotfoundex(a).isEmpty()) {
		throw new NameNotFoundException("This name is not in employee_details");
	}
	else
	{
		return ed.namenotfoundex(a);
	}
}

public List<Employee>getid(int a)throws IdNotFoundException {
	if(ed.getid(a).isEmpty()) {
	throw new IdNotFoundException("This id is not available");
}
	else
	{
		return ed.getid(a);
	}

}

public List<Employee>getage(int a)throws AgeNotFoundException {
	if(ed.getage(a).isEmpty()) {
		throw new AgeNotFoundException("This age is not eligible");
	}
	else
	{
		return ed.getage(a);
	}
}
}

