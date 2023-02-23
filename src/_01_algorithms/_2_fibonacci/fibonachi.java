package _01_algorithms._2_fibonacci;

public class fibonachi {
public static void main(String[] args) {
int number1 = 0;
int number2 = 1;
int sum = 0;
System.out.println(number1);
System.out.println(number2);
for(int x=0; x<9; x++) {
	
	sum = number1 + number2;
	number1 = number2;
	number2 = sum;
	System.out.println(sum);
	
}
	
	
	
	
	
	
	
	
	
}
}
