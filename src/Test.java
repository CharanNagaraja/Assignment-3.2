/*
 * 
 * This program is to demonstrate errors in code (if any) and debugging. 
 *
 */


public class Test {

	/*
	 * Output must be one of the following: a. Compiler error. b. Will throw a
	 * NoSuchMethod error at runtime. c. It will compile and run printing out
	 * "10“ d. It will run with no output. e. It will run and print "10" and
	 * then crash with an error
	 * 
	 * 
	 * Answer is : c) It will compile and run printing out
	 * "10“
	 */
	static {
		print(10);
	}
/*Reason:- 
 * This will run, print a message and terminate gracefully.
The runtime system needs to load the class before it can look
for the main method. So the static initializer will run first
and print "10". Immediately after that System.exit(0) will be called
terminating the program before an error can be thrown.
 * 
 * 
 */
	static void print(int x) {
		System.out.println(x);
		System.exit(0);

	}

}
