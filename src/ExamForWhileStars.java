import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 5){
			System.out.println("1. ���簢�� �����");
			System.out.println("2. �����ﰢ �����");
			System.out.println("3. �̵�ﰢ�� �����");
			System.out.println("4. ���̾Ƹ�� �����");
			System.out.println("5. �����ϱ�");
			
			System.out.print("���ϴ� �޴� : ");
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
	
		  System.out.println("1���޴� Ŭ���� :RectagleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("���簢�� ũ���Է� :");
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
		
		  System.out.println("2���޴� Ŭ���� :TriangleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("�����ﰢ���� ���ʿ���� �����Է� :");
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
		

		  System.out.println("3���޴� Ŭ���� :IsoscelesTriangleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("�Ƶպ��ﰢ�� �����Է� :");
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
		  System.out.println("4���޴� Ŭ���� :DiamondStars");
		  System.out.println("=======================================");
		  System.out.println();
		  
		  System.out.print("���̾Ƹ���� ũ���Է�  : ");   
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
