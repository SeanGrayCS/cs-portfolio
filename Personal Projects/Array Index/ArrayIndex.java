/**
 * @(#)ArrayIndex.java
 *
 *
 * @author Sean Gray
 * @version 1.00 2020/1/13
 */


public class ArrayIndex {

	private int[] arrInt;
	private long[] arrLong;
	private short[] arrShort;
	private double[] arrDouble;
	private float[] arrFloat;
	private byte[] arrByte;
	private boolean[] arrBoolean;
	private char[] arrChar;
	private String[] arrString;
	
	private int dataType;
	
	public ArrayIndex() {
		dataType = -1;
	}
    public ArrayIndex(int[] arr) {
    	arrInt = arr;
    	dataType = 0;
    }
    public ArrayIndex(long[] arr) {
    	arrLong = arr;
    	dataType =  1;
    }
    public ArrayIndex(short[] arr) {
    	arrShort = arr;
    	dataType = 2;
    }
    public ArrayIndex(double[] arr) {
    	arrDouble = arr;
    	dataType = 3;
    }
    public ArrayIndex(float[] arr) {
    	arrFloat = arr;
    	dataType = 4;
    }
    public ArrayIndex(byte[] arr) {
    	arrByte = arr;
    	dataType = 5;
    }
    public ArrayIndex(boolean[] arr) {
    	arrBoolean = arr;
    	dataType = 6;
    }
    public ArrayIndex(char[] arr) {
    	arrChar = arr;
    	dataType = 7;
    }
    public ArrayIndex(String[] arr) {
    	arrString = arr;
    	dataType = 8;
    }
    
    public int indexOf(Object in)
    {
    	if(dataType == -1)
    	{
    		return -1;
    	}
		if(dataType == 0)
		{
			for(int i = 0; i<arrInt.length; i++)
    		{
    			if(arrInt[i] == (int) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 1)
		{
			for(int i = 0; i<arrLong.length; i++)
    		{
    			if(arrLong[i] == (long) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 2)
		{
			for(int i = 0; i<arrShort.length; i++)
    		{
    			if(arrShort[i] == (short) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 3)
		{
			for(int i = 0; i<arrDouble.length; i++)
    		{
    			if(arrDouble[i] == (double) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 4)
		{
			for(int i = 0; i<arrFloat.length; i++)
    		{
    			if(arrFloat[i] == (float) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 5)
		{
			for(int i = 0; i<arrByte.length; i++)
    		{
    			if(arrByte[i] == (byte) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 6)
		{
			for(int i = 0; i<arrBoolean.length; i++)
    		{
    			if(arrBoolean[i] == (boolean) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 7)
		{
			for(int i = 0; i<arrChar.length; i++)
    		{
    			if(arrChar[i] == (char) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		if(dataType == 8)
		{
			for(int i = 0; i<arrString.length; i++)
    		{
    			if(arrString[i] == (String) in)
    			{
    				return i;
    			}
    		}
    		return -1;
		}
		return -1;
			
    }
    
    
}