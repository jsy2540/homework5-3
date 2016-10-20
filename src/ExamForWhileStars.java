import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. 1���� �Է��� �� ���ϱ�.");
			System.out.println("2. �ִ밪/�ּҰ����ϱ�");
			System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
			System.out.println("4. ���ϴ� ������ ����ϱ� ");
			System.out.println("5. ¦����/Ȧ���� ����ϱ�");
			System.out.println("6. �����ϱ�.");
			
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
	
	    String input = in.nextLine();
	    if(input.equals("Q")){
	    	return;
	    }
	    int numbers = Integer.parseInt(input);
	    int result =0; 
	    for(int i = 1; i <= numbers; i++){ 
	        result = result + i;
	    }
	    System.out.print("�� ���� "+result+"�Դϴ�.\n"); 
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
		
		int i, sum = 0;
		double avg = 0;
	    int array[] = new int[5];
	    for(i = 0; i < 5; i++)
	    {
	    	System.out.print("���ڸ�  �Է�(Q:����) : ");
	        array[i] = in.nextInt();
	        sum += array[i]; 
	    }
	   
	    avg = (double) sum / array.length;
	    
	    System.out.printf("�հ��  %d �̰�, �����  %.2f �Դϴ�.\n", sum,avg );
	    return;	    
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
