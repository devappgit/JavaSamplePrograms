package sortTypes;

public class MyBubbleSort extends BaseSort{

	
	@Override
	public void sort(int[] aArray) {
		for(int i=0; i<aArray.length; i++){
					
			for(int j=0; j<aArray.length-1; j++){
				if(aArray[j+1] < aArray[j]){
					swapNumbers(j, j+1, aArray);
				} 
			}
		}
		printNumbers(aArray);
	}
	
	
	
	
}
