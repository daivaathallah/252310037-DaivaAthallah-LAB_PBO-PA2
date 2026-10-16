package praktikum4;

public class array {
public static void main(String[] args) {
	int[] age=new int[5];
	
	age[0]= 10;
	age[1]= 12;
	age[2]= 5;
	age[3]= 20;
	age[4]= 1;
	
	System.out.println("=Value by index=");
	System.out.println("age[2]="+ age[2]);
	System.out.println("=useloop=");
	for(int i=0; i<5;i++) {
		System.out.println("age["+i+"]="+age[i]);
	}
}
}
