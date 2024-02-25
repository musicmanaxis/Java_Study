import java.util.*;

public class Ex4_15 {

	public static void main(String[] args) {
		int answer=0;
		int input=0;
		
		Scanner scan=new Scanner(System.in);
		answer=(int)(Math.random()*100+1);
		
		System.out.println(answer);
		
		do {  //do문장은 무조건 한번은 실행할것을 적는다. 
			System.out.println("1이상 100이하의 맞는 값을 입력하세");
			input=scan.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은값을 입력하세요 ");
			}else if(input<answer) {
				System.out.println("더 큰값을 입력하세요 ");
			}
			
		}while(input !=answer);{   //do 문장에서 마지막 while();  세미콜론을 적어야 한다.
			System.out.println("정답 ");
		}
		
//		for(int i=0; i< 100;i++) {
//			answer=(int)(Math.random()*100+1);   0이상 100이하 범위의 랜덤 값처리  
//			System.out.printf("%d,", answer);
//			if(answer==100) {
//				System.out.println();
//				System.out.printf("value is 100");
//				System.out.println();
//			}
//		}
		

	}

}
