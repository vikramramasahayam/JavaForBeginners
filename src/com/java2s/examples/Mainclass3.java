package com.java2s.examples;



public final class Mainclass3 {
 
  public static Boolean valueOf(boolean value) {
    if (value)
      return Boolean.TRUE;
    else
      return Boolean.FALSE;
  }

 
  public static boolean equals(final double a, final double b) {
    return Double.doubleToLongBits(a) == Double.doubleToLongBits(b);
  }

 
  public static boolean equals(final float a, final float b) {
    return Float.floatToIntBits(a) == Float.floatToIntBits(b);
  }

  
  public static boolean equals(final byte a[], final int abegin, final byte b[], final int bbegin,
      final int length) {
    try {
      int i = length;
      while (--i >= 0) {
        if (a[abegin + i] != b[bbegin + i]) {
          return false;
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }

    return true;
  }
 
 
  public static boolean equals(final byte a[], final byte b[]) {
    if (a == b)
      return true;
    if (a == null || b == null)
      return false;
    if (a.length != b.length)
      return false;

    try {
      for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }

    return true;
  }
  public static void main(String args[]){
	  boolean b=true;
	 Boolean v= Mainclass3.valueOf(b);
	 System.out.println(v);
	 
	 double d1=10d;
	 double d2=20d;
	boolean c= Mainclass3.equals(d1,d2);
	System.out.println(c);
	
	
	
	
	 
	 
	 
  }

}
