import java.util.*;
public class Calendar {
	public static void main(String []args){
		int Days,year,month,day,weeks,i;
		int mon []={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner in = new Scanner(System.in);

		System.out.println("년도를 입력하세요 (ex : 2017)");
		year=in.nextInt();
		System.out.println("몇 월 인가요?");
		month=in.nextInt();
		System.out.println("몇 일 인가요?");
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
				 System.out.println("일요일 입니다.");
				 break;
			 case 1 :
				 System.out.println("월요일 입니다.");
				 break;
			 case 2 :
				 System.out.println("화요일 입니다.");
				 break;
			 case 3 :
				 System.out.println("수요일 입니다.");
				 break;
			 case 4 :
				 System.out.println("목요일 입니다.");
				 break;
			 case 5 :
				 System.out.println("금요일 입니다.");
				 break;
			 case 6 :
				 System.out.println("토요일 입니다.");
				 break;
		 }
	}	
}	