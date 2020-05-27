package sub1;

public class Example {
	public static void main(String[] args) {
		
		int arr [] = {10, 9, 7, 5, 25, 15};
		int divisor = 5;
		int[] answer = new int[arr.length-1];
	    int count = 0;
	    
	    for(int i=0; i<arr.length; i++){
	    	if(arr[i] % divisor == 0){
	               answer[count] = arr[i];
	               count++;
	        }
	    }
	    
	    if(count==0) {
	    	answer[count] = -1;
	    }else {
	    
		    for(int i=0; i<answer.length; i++) {
		    	for(int j=i+1; j<=answer.length; j++) {
		    		if(answer[i] > answer[j]) {
		    			int temp = answer[j];
		    			answer[j] = answer[i];
		    			answer[i] = temp;
		    		}
		    	}
		    }
	    }
	    
	    for(int i=0; i<answer.length;i++) {
	    	System.out.print(answer[i]+", ");
	    }
	 
	}
}
