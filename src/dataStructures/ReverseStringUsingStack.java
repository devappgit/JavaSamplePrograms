package dataStructures;

public class ReverseStringUsingStack {

	public String reverseString(String aString){
		StringBuilder stringBuilder = new StringBuilder();
		Stack<Character> stringStack = new Stack<Character>(aString.length());
		
		for(int i=0; i<aString.length(); i++){
			try{
				stringStack.push(aString.charAt(i));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		while(!stringStack.isStackEmpty()){
			try {
				stringBuilder.append(stringStack.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return stringBuilder.toString();
	}
}
