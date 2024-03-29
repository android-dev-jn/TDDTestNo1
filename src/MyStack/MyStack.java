package MyStack;

import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<String> mList;
	
	public MyStack() {
		this.mList = new ArrayList<String>();
	}

	public MyStack(int i) {
		this.mList = new ArrayList<String>();
		for (int x = 0; x < i; x ++) {
			this.mList.add("1");
		}
	}

	public int size() {		
		return mList.size();
	}

	public void push(String string) {
		this.mList.add(string);
	}

	public String top() {
		if (this.mList.size() == 0) {
			return null;
		} else {
			return this.mList.get(this.mList.size()-1);
		}
	}

	public String pop() {
		try {
			if (this.mList.size() == 0) {
				throw new Exception("StackEmptyException");
			} else {
				String output = this.mList.get(this.mList.size() - 1);
				this.mList.remove(this.mList.size() - 1);
				return output;		
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
