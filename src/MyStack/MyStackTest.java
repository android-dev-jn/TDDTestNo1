package MyStack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStackTest {
	@Test
	public void handleZeroSize() {
		MyStack mStack = new MyStack();
		assertEquals(0, mStack.size());
	}
	
	@Test
	public void handlePushNewOne() {
		MyStack mStack = new MyStack();
		mStack.push("1");
		assertEquals(1, mStack.size());
	}
	
	@Test
	public void handleKOneElements() {
		MyStack mStack = new MyStack(5);
		mStack.push("k+1");
		assertEquals(6, mStack.size());
	}
	
	@Test
	public void handleTopWithEmptyStack() {
		MyStack mStack = new MyStack();
		assertEquals(null, mStack.top());
	}
	
	@Test
	public void handleTopNewPushed() {
		MyStack mStack = new MyStack();
		mStack.push("new");
		assertEquals("new", mStack.top());
	}
	
	@Test
	public void handlePopStackEmpty() {
		MyStack mStack = new MyStack();
		Exception ex = new Exception("StackEmptyException");
		try{
			mStack.pop();
		} catch (Exception e) {
			assertEquals(ex, e);
		}
	}
	
	@Test
	public void handlePopKElementsStack() {
		MyStack mStack = new MyStack(6);
		mStack.pop();
		assertEquals(5, mStack.size());
	}
	
	@Test
	public void handlePopOneElementStack() {
		MyStack mStack = new MyStack(1);
		mStack.pop();
		assertEquals(0, mStack.size());
	}
	
	@Test
	public void handleTopVsPop() {
		MyStack mStack = new MyStack(5);
		String p = new String("temp");
		mStack.push(p);
		assertEquals("temp", mStack.top());
		assertEquals(p, mStack.pop());
	}

}
