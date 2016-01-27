package Statements;

	public class Arraycopy {

    
  public static byte[] int2byte(int[]src) {
    int srcLength = src.length;
    byte[]dst = new byte[srcLength << 2];
    
    for (int i=0; i<srcLength; i++) {
        int x = src[i];
        int j = i << 2;
        dst[j++] = (byte) ((x >>> 0) & 0xff);           
        dst[j++] = (byte) ((x >>> 8) & 0xff);
        dst[j++] = (byte) ((x >>> 16) & 0xff);
        dst[j++] = (byte) ((x >>> 24) & 0xff);
    }
    return dst;
}
   public static void main(String[] args) {
	   int[] i = {1,2,3,4}; 
	   byte[] b;
	  b= Arraycopy.int2byte(i);
	  System.out.println(b);
	   
	   
}
}
