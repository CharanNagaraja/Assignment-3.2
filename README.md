/*
 * knowledge on Variables and their initialization.
 */

/*
 * Ans d. The program prints pnt is null 0 0.
 * 
Instance variable of type int and String are initialized to 0 and null respectively
*/
class example {
	   int x;
	   int y;
	   String name;
	   public static void main(String args[]) {
	      example pnt = new example();
	      System.out.println("pnt is " + pnt.name + 
	         " " + pnt.x + " " + pnt.y);		
	   }
	}
