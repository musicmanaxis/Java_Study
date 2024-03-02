//로또번호 뽑기


public class Ex5_5 {

	public static void main(String[] args) {
			int[] ball =new int[45]; 
			
			for(int i=0 ; i<ball.length ; i++) {
				 ball[i]=i+1;
			}
			
			int tmp=0, j=0;
			
			for(int i=0 ; i<ball.length ;i++) {
				j=(int)(Math.random()*45);
				tmp=ball[i];
				ball[i]=ball[j];
				ball[j]=tmp;
			//	System.out.print(i+",");
			}
			
			for(int i=0 ; i<6 ;i++) {
				System.out.println("ball["+i+"]="+ball[i]);
			}
	}

}
