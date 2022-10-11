/**
 * 
 */
package mystack;

/**
 * @author Anthony Testani, Joe Rios
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T pop = theStack.val;  //ant
		theStack = theStack.next;  //ant
		return null; 		   //return null;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> stackint = new MyStack<Integer>();
		// Push 1 and 2
		stackint.push(1);
		stackint.push(2);
		// Pop
		stackint.pop();
		// Push 5
		stackint.push(5);
		
		
		
		// TODO To complete
		// Create a stack of Person
		//MyStack<Person> stkprsn = MyStack<Person>(this.fname, this.lname);	
		//super(this.fname, this.lname);
		Person p1 = new Person("Anthony" , "Testani" );
		Person p2 = new Person("Christelle","Scharff");
		MyStack<Person> stkprsn = new MyStack<Person>(); //this.fname, this.lname
		//MyStack<Person> stkprsn = MyStack<Person>(v , theStack);		
		
		// Push a person p1 with your name
		
		stkprsn.push(p1);
		stkprsn.push(p2);
		// Push a person p2 with my name
	
	}

}
