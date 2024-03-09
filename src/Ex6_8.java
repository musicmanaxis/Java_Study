class Data3{int x=22;}

public class Ex6_8 {

	public static void main(String[] args) {
		Data3 d=new Data3();
		d.x=10;
		Data3 d1=copy(d);  //1. copy(d)의 d는 main()에서 생성된 객체의 주소값을 copy()에게 넘긴다.
		                   //5.d1에는 메모리에 생성된 tmp주소값을 넘겨받는다.
		
		System.out.println(d.x);
		System.out.println(d1.x);
	}

	
	static Data3 copy(Data3 d2) {   //2.copy() 메모리 영역에 d2가 생성되며 d의 주소값을 넘겨받는다.
		Data3 tmp= new Data3();   //3. tmp 객체를 생성하
		tmp.x=d2.x;     //4. d2와d가 가진 공통 주소값의 x값을 tmp에게 넘겨준다.
		return tmp;		// 객체 주소를 반환한다.(중요)   
	}
	
}