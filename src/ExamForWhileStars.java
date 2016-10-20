import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. 1부터 입력한 수 더하기.");
			System.out.println("2. 최대값/최소값구하기");
			System.out.println("3. 입력받은숫자의 합계와 평균구하기");
			System.out.println("4. 원하는 구구단 출력하기 ");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 종료하기.");
			
			System.out.print("원하는 메뉴 : ");
			flag = in.nextInt();
			
			switch(flag){
				case 1:
					RectagleStars.RS();
					break;
				case 2:
					TriangleStars.TS();
					break;
				case 3:
					IsoscelesTriangleStars.ITS();
					break;
				case 4:
					DiamondStars.DS();
					break;
				default:
					System.out.println("다시 입력 하시오.");
					break;
			}
		}
		
		RectagleStars.RS();
		RectagleStars RS = new RectagleStars();
		
		TriangleStars.TS();
		TriangleStars TS = new TriangleStars();
		
		IsoscelesTriangleStars.ITS();
		IsoscelesTriangleStars ITS = new IsoscelesTriangleStars();
		
		DiamondStars.DS();
		DiamondStars DS = new DiamondStars();
		
		
		
	}
}

class RectagleStars{
	static void RS() 
	{
		Scanner in = new Scanner(System.in); 
	    System.out.print("1부터 입력한 수까지 더하기 마지막 수를 입력(Q:종료) : "); 
	
	    String input = in.nextLine();
	    if(input.equals("Q")){
	    	return;
	    }
	    int numbers = Integer.parseInt(input);
	    int result =0; 
	    for(int i = 1; i <= numbers; i++){ 
	        result = result + i;
	    }
	    System.out.print("총 합은 "+result+"입니다.\n"); 
	    return;
}
}

class TriangleStars{
	static void TS() {
		Scanner in = new Scanner(System.in); 
		
	    int i, j, max, min;
	    int array[] = new int[6];
	    String str; 
	    
	    for(i = 0; i < 6; i++)
	    {
	    	System.out.print("0~100사이의 숫자를  입력(Q:종료) : "); 
	    	 array[i] = in.nextInt(); 
	    }
	   
	    max = array[0];
	    min = array[0];
	    
	    for (j=0; j<6; j++){
	    	if(max < array[j]){
	    		max = array[j];
	    	}
	    }
	    for (j=0; j<6; j++){
	    	if(min > array[j]){
	    	   min = array[j];
	    	}
	    }
	    System.out.println("가장 큰 수는  "+max+"이고, 가장 작은 수는 "+min+"입니다."  );   
	    return;
	}
}

class IsoscelesTriangleStars{
	static void ITS() {
		Scanner in = new Scanner(System.in); 
		
		int i, sum = 0;
		double avg = 0;
	    int array[] = new int[5];
	    for(i = 0; i < 5; i++)
	    {
	    	System.out.print("숫자를  입력(Q:종료) : ");
	        array[i] = in.nextInt();
	        sum += array[i]; 
	    }
	   
	    avg = (double) sum / array.length;
	    
	    System.out.printf("합계는  %d 이고, 평균은  %.2f 입니다.\n", sum,avg );
	    return;	    
	    }
	}

class DiamondStars{
	static void DS() {
		Scanner in = new Scanner(System.in);
		System.out.printf("출력하고 싶은 단(Q:종료)" );
		int i = in.nextInt();
		
		if(i < 1 && i > 10){
			System.out.printf("잘못입력");	
			return;
		}	
		for(int j = 1; j < 10; j++){			
			System.out.println(i + " * " + j + " = " + i*j);
		}
	

		    	System.out.println("");
		    	   
	}

}
