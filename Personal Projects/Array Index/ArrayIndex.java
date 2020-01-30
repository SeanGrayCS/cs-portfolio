/**
 * ArrayIndex.java
 *
 * @author Sean Gray
 * 
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
		
    public ArrayIndex(int[] arr) {
    	arrInt = arr;
    }
    public ArrayIndex(long[] arr) {
    	arrLong = arr;
    }
    public ArrayIndex(short[] arr) {
    	arrShort = arr;
    }
    public ArrayIndex(double[] arr) {
    	arrDouble = arr;
    }
    public ArrayIndex(float[] arr) {
    	arrFloat = arr;
    }
    public ArrayIndex(byte[] arr) {
    	arrByte = arr;
    }
    public ArrayIndex(boolean[] arr) {
    	arrBoolean = arr;
    }
    public ArrayIndex(char[] arr) {
    	arrChar = arr;
    }
    public ArrayIndex(String[] arr) {
    	arrString = arr;
    }
    
    public int indexOf(int in) {
		for(int i = 0; i<arrInt.length; i++)
    	{
    		if(arrInt[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(long in) {
		for(int i = 0; i<arrLong.length; i++)
    	{
    		if(arrLong[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(short in) {
		for(int i = 0; i<arrShort.length; i++)
    	{
    		if(arrShort[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(double in) {
		for(int i = 0; i<arrDouble.length; i++)
    	{
    		if(arrDouble[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(float in) {
		for(int i = 0; i<arrFloat.length; i++)
    	{
    		if(arrFloat[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(byte in) {
		for(int i = 0; i<arrByte.length; i++)
    	{
    		if(arrByte[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(boolean in) {
		for(int i = 0; i<arrBoolean.length; i++)
    	{
    		if(arrBoolean[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
	public int indexOf(char in) {
		for(int i = 0; i<arrChar.length; i++)
    	{
    		if(arrChar[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
    public int indexOf(String in) {
		for(int i = 0; i<arrString.length; i++)
    	{
    		if(arrString[i] == in)
    		{
    			return i;
    		}
    	}
    	return -1;
	}
    
}