import java.util.*;
public class Calendar {
	public static void main(String []args){
		int Days,year,month,day,weeks,i;
		int mon []={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner in = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ��� (ex : 2017)");
		year=in.nextInt();
		System.out.println("�� �� �ΰ���?");
		month=in.nextInt();
		System.out.println("�� �� �ΰ���?");
		day=in.nextInt();
	
		Days=365 * (year - 1) + ((year - 1) / 4) - ((year  - 1) / 100) + ((year - 1) / 400);
			for(i=0; i<month; i++){
				if(i==1 && ((year%4==0 && year%100 !=0) || year%400==0)){
					mon[1]+=1;   
				}
				Days += mon[i];
			}
			Days -= mon[i-1]; 
			weeks=(Days+1) % 7;
			i=(weeks+day-1)%7;
			 switch(i){
			 case 0 :
				 System.out.println("�Ͽ��� �Դϴ�.");
				 break;
			 case 1 :
				 System.out.println("������ �Դϴ�.");
				 break;
			 case 2 :
				 System.out.println("ȭ���� �Դϴ�.");
				 break;
			 case 3 :
				 System.out.println("������ �Դϴ�.");
				 break;
			 case 4 :
				 System.out.println("����� �Դϴ�.");
				 break;
			 case 5 :
				 System.out.println("�ݿ��� �Դϴ�.");
				 break;
			 case 6 :
				 System.out.println("����� �Դϴ�.");
				 break;
		 }
	}	
}	