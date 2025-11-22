import java.util.*;
public class calulater {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a :");
    int a = sc.nextInt();
    System.out.println("enter b :");
    int b = sc.nextInt();
    System.out.println("enter operator");
    char operator = sc.next().charAt(0);
    switch(operator) {
        case '+': 
            System.out.println(a + b);
            break;
        case '-': 
            System.out.println(a - b);
            break;
        case '*': 
            System.out.println(a * b);
            break;
        case '/': 
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Cannot divide by zero");
            }
            break;
        case '%': 
            if (b != 0) {
                System.out.println(a % b);
            } else {
                System.out.println("Cannot modulo by zero");
            }
            break;
        default : 
            System.out.println("wrong ans");
    }
    sc.close();
   } 
}
