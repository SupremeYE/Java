package practice;

public class Array파라미터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcul4 cal= new Calcul4();//참조변수를 사용하여 참조
		int [] randomNum= {1,2,3,4,5,6,7};//배열
		int result;
		result=cal.calculateSum(randomNum);//함수호출
		
		System.out.println("result :"+result);

	}

}
