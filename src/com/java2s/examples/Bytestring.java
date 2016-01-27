package com.java2s.examples;

public class Bytestring {
	  public static void main(String[] argv) throws Exception {

	    byte[] buf = new byte[] { 0x12, 0x23 };
	    String s = new sun.misc.BASE64Encoder().encode(buf);
	    System.out.println(s);

	    buf = new sun.misc.BASE64Decoder().decodeBuffer(s);
	    System.out.println(buf);
	  }
	}
