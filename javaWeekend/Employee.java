class Employee{
  String name; //we do not assign a value, the value of name is undefined. when the value is empty, it takes a slot in the memory
  double salary;
  String role;
  double baseSalary = 600;
  
  public Employee(String name, double salary, String role){
    this.name = name;
    this.salary = salary;
    this.role = role;
    
  }
  
}