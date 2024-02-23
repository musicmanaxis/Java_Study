
//switch문 연
import java.util.*;

public class Ex4_6 {

	public static void main(String[] args) {
		int month;
		Scanner scan=new Scanner(System.in);
		
		month=scan.nextInt();
		if( month ==0  || 13 < month) {
			System.out.println("Not Calendar, Try it Argin! Correct Write Month");
			
		}else { 
			switch (month){
				case 3 :   //case 문을 이렇게 세로로 쓸수도 있
				case 4 :
				case 5 :
					System.out.println(month+" Month is Spring");
					break ;
			
				case 6 : case 7: case 8:  //case문을 가로로 쓸수 있다.
					System.out.println(month+" Month is Summer");
					break;
			
				case 9: case 10: case 11:
					System.out.println(month+" Month is Autumn");
					break;
			
				default :
					System.out.println(month+" Month is Winter");
					break;
				
				}//switch
			}//else
		}//main()
}//class
