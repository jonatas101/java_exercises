package entities;

public class Employee{
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String nome, double salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int GetId(){
    return id;
  }

  public SetId(int id){
    this.id = id;
  }

  public String GetName(){
    return name;
  }

  public SetName(String name){
    this.name = name;
  }

  public double SalaryRaise(double percentage){
    return this.salary += this.salary * percentage/100;
  }
}
