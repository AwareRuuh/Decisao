import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    int x = 1;
    int y = 2;
    System.out.println("Digite um número ");
    x = sc1.nextInt();
    System.out.println("Digite um número ");
    y = sc1.nextInt();
    if (x > y){
      System.out.println(x+ " É maior que " +y);
      }
    else if (x < y){
      System.out.println(x+ " É menor que " +y);
    }
    else{
      System.out.println(x+ " É igual a " +y);
    }
  }
}