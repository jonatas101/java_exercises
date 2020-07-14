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
      System.out.print("Salary: ");
      double salary = sc.nextDouble();
  }










    sc.close();

  }
}
