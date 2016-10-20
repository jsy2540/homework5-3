import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. 정사각형 벌찍기");
			System.out.println("2. 직각삼각 별찎기");
			System.out.println("3. 이등변삼각형 별찍기");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			
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
	
		  System.out.println("1번메뉴 클래스 :RectagleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("정서각형 크기입력 :");
		  int a = in.nextInt();

		  
		  for(int i = 0; i<a; i++)  
		   {    
		     for(int j = 1; j<=i; j++)    
		       System.out.print("*");     
		     System.out.println();
		   } 
		  System.out.println();	  
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
		

		  System.out.println("3.3번메뉴 클래스 :IsoscelesTriangleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("아둥변삼각형 높이입력 :");
		  int a = in.nextInt();

		  
		  for(int i = 0; i<a; i++)  
		   {
		     for(int j = a; j>i; j--)     
		       System.out.print(" ");          
		   for(int j = i; j>=0; j--)     
		       System.out.print("*");     
		     for(int j = 1; j<=i; j++)    
		       System.out.print("*");     
		     System.out.println();
		   }
		  
		  System.out.println();	  
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
