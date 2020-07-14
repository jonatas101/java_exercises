package application;

import java.util.Scanner;

public class SalaryRaise{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Employee> list = new ArrayList();

    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();
    System.out.println();
// Gathering data to include new employees and checking if the id already exists.
    for(int i=0;i<n;i++){
      System.out.print("Employee #"+ i+1 +":");
      System.out.print("Id: ");
      int id = sc.nextInt();
      while(hasId(id) != null){
        System.out.print("Error! Try another id number: ")
        id = sc.nextInt();
      }
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
      Employee employee = new Employee(id,name,salary);
      list.add(Employee);

      }
      System.out.println();

      public boolean hasId(int id){
        return List<Employee> checkId = list.stream().filter(x -> x.getId() == id).findfirst().orElse(null);
      }
  }











    sc.close();

  }
}
