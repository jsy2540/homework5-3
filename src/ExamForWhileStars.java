import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. ���簢�� �����");
			System.out.println("2. �����ﰢ ������");
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
				default:
					System.out.println("�ٽ� �Է� �Ͻÿ�.");
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
	    System.out.print("1���� �Է��� ������ ���ϱ� ������ ���� �Է�(Q:����) : "); 
	
		  System.out.println("1���޴� Ŭ���� :RectagleStars");
		  System.out.println("=======================================");

		  System.out.println();
		  System.out.print("�������� ũ���Է� :");
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
	    	System.out.print("0~100������ ���ڸ�  �Է�(Q:����) : "); 
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
	    System.out.println("���� ū ����  "+max+"�̰�, ���� ���� ���� "+min+"�Դϴ�."  );   
	    return;
	}
}

class IsoscelesTriangleStars{
	static void ITS() {
		Scanner in = new Scanner(System.in); 
		

		  System.out.println("3.3���޴� Ŭ���� :IsoscelesTriangleStars");
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
		System.out.printf("����ϰ� ���� ��(Q:����)" );
		int i = in.nextInt();
		
		if(i < 1 && i > 10){
			System.out.printf("�߸��Է�");	
			return;
		}	
		for(int j = 1; j < 10; j++){			
			System.out.println(i + " * " + j + " = " + i*j);
		}
	

		    	System.out.println("");
		    	   
	}

}
