import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 5){
			System.out.println("1. 정사각형 벌찍기");
			System.out.println("2. 직각삼각 별찍기");
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
				case 5:
					System.exit(0);
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
	
		  System.out.println("1번메뉴 클래스 :RectagleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("정사각형 크기입력 :");
		  int a = in.nextInt();

		  for(int i = 0; i < 5; i++)  
		   {    
		     for(int j = 0 ; j < a; j++)
		       System.out.print("*");     
		     System.out.println();
		   } 
		  System.out.println();	  
		 }
		}

class TriangleStars{
	static void TS() {
		Scanner in = new Scanner(System.in); 
		
		  System.out.println("2번메뉴 클래스 :TriangleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("직각삼각형의 왼쪽여백과 높이입력 :");
		  int a = in.nextInt();
  
		  for(int i = 0; i < 6;i++){
			   for(int j = 1; j <= a-i; j++){
			    System.out.print(" ");
			   }
			   for(int j = 1; j <= i; j++){
			    System.out.print("*");
			   }
			  System.out.println();
			  }
	}
}


class IsoscelesTriangleStars{
	static void ITS() {
		Scanner in = new Scanner(System.in); 
		

		  System.out.println("3번메뉴 클래스 :IsoscelesTriangleStars");
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
		  System.out.println("4번메뉴 클래스 :DiamondStars");
		  System.out.println("=======================================");
		  System.out.println();
		  
		  System.out.print("다이아몬드의 크기입력  : ");   
		  int num = in.nextInt();
		  int i, j, k, l;
		  for(i = 0; i < num; i++) 
		  {
		   for(j = num-1; j > i; j--) 
		    System.out.print(" ");   
		   for(k = 0; k <= i; k++) 
		    System.out.print("*");
		   for(l = 0; l < i; l++)  
		    System.out.print("*");
		   System.out.println(); 
		  }
		  
		  for(i = 0; i < num-1; i++)  
		  {
		   for(j = 0; j <= i; j++) 
		    System.out.print(" ");   
		   for(k = num-1; k > i; k--) 
		        System.out.print("*");
		   for(l = num-2; l > i; l--) 
		        System.out.print("*");
		   System.out.println(); 
		  }
		  
		  }
		}
