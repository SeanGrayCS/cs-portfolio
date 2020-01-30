/**
 * ClientCode.java
 *
 * @author Sean Gray
 * 
 * @version 1.00 2020/01/13
 */

//client code used to test ArrayIndex class

public class ClientCode {

    public static void main(String[] args) {
    	
    	int[] testI = {1, 2, 3, 4, 5};
    	long[] testL = {1, 2, 3, 4, 5};
    	short[] testS = {1, 2, 3, 4, 5};
    	double[] testD = {1.0, 2.0, 3.0, 4.0, 5.0};
    	float[] testF = {(float) 1.0,(float)  2.0,(float)  3.0,(float)  4.0,(float)  5.0};
    	byte[] testB = {1, 2, 3, 4, 5};
    	boolean[] testBo = {true, false};
    	char[] testC = {'a', 'b', 'c', 'd', 'e'};
    	String[] testSt = {"abc", "def", "ghi"};
    	
    	ArrayIndex i = new ArrayIndex(testI);
    	ArrayIndex l = new ArrayIndex(testL);
    	ArrayIndex s = new ArrayIndex(testS);
    	ArrayIndex d = new ArrayIndex(testD);
    	ArrayIndex f = new ArrayIndex(testF);
    	ArrayIndex b = new ArrayIndex(testB);
    	ArrayIndex bo = new ArrayIndex(testBo);
    	ArrayIndex c = new ArrayIndex(testC);
    	ArrayIndex st = new ArrayIndex(testSt);
    	
    	System.out.println("Int index of 3: " + i.indexOf(3));
    	System.out.println("Long index of 2: " + l.indexOf((long) 2));
    	System.out.println("Short index of 4: " + s.indexOf((short) 4));
    	System.out.println("Double index of 5.0: " + d.indexOf(5.0));
    	System.out.println("Float index of 3.0: " + f.indexOf((float) 3.0));
    	System.out.println("Byte index of 7: " + b.indexOf((byte)7));
    	System.out.println("Boolean index of true: " + bo.indexOf(true));
    	System.out.println("Char index of d: " + c.indexOf('d'));
    	System.out.println("String index of abc: " + st.indexOf("abc"));
    	
    }
    
    
}