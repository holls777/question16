package quiz2;
import java.util.Scanner;
public class collegecalc{
	public static void main(String[] args){
		double tuition= 12342.00;
		
		double totaltuition=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input tuition rate");
		double tuitionrate=sc.nextDouble();
		
		for(int yearini=1; yearini<5;yearini++ ){
			totaltuition+= tuition*tuitionrate;
			
		}
		System.out.println("Total tuition cost is "+totaltuition);
		sc.close();
	}
}