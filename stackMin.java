
public class StackMin{
	
	private class StackNode{
		int val;
		int minVal;
		StackNode next;
		
		public StackNode(int val){
			this.val = val;
		}
	}
	private StackNode top;
	
	public void push(int newVal){
		StackNode toPush = new StackNode(new);
		toPush.minVal = Math.min(newVal,top.minVal);
		toPush.next = top;
		top = toPush;
	}
	
	public int peek(){
		if(top == null) throw EmptyStackException();
		return top.val;
	}
	
	public int min(){
		if(top == null) throw EmptyStackException();
		return top.minVal;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int pop(){
		if(top == null) throw EmptyStackException();
		
		int toReturn = top.val;
		top = top.next;
		return toReturn;
	}
}