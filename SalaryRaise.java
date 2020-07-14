package application;

import java.util.Scanner;

public class SalaryRaise{
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Employee> list = new ArrayList();

    System.out.print("How many employees will be registered? ");
    int n = sc.nextInt();
    System.out.println();

    for(int i=0;i<n;i++){
      System.out.print("Employee #"+ i+1 +":");
      System.out.print("Id: ");
      int id = sc.nextInt();
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
      Employee employee = new Employee(id,name,salary);
      List<Employee> checkId = list.stream().filter(x -> x.getId() == id).findfirst().orElse(null);
      for (String x : checkId){
        if(checkId != null){
          list.add(employee);
        }else{
          System.out.print("Erro! id já existente");
          
        }
      }
      System.out.println();
  }










    sc.close();

  }
}
