package logicalPrograms2;

public class Fab {
static int n=20,a=0,b=1,c=0;
public static void display() {
	if(n-->=1) {
		c=a+b;
		System.out.print(a+" ");
		a=b;
		b=c;
		display();
	}
}
public static void main(String[] args) {
	display();
}
}
