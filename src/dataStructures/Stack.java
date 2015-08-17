package dataStructures;

public class Stack<T extends Object> {

	private int top;
	private int mSize;
	private T[] stackArr;
	
	public Stack(int size){
		top=-1;
		mSize = size > 0 ? size : 10;
		stackArr = (T[]) new Object[mSize];
	}
	
	public void push(T entry) throws Exception{
		if(!isStackFull()){
			stackArr[++top] = entry;
			
		}else throw new Exception("Stack is full, cannot push "+ entry);
	}
	
	
	public T pop() throws Exception{
		if(!isStackEmpty()){
			return stackArr[top--];
		}else throw new Exception("Stack is empty, cannot pop entry");
	}
	
	public boolean isStackFull(){
		if(top == mSize - 1){
			return true;
		}
		return false;
	}
	
	public boolean isStackEmpty(){
		if(top == -1){
			return true;
		}
		return false;
	}
	
}
