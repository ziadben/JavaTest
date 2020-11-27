import java.util.BitSet;

public class WrappData {

	public static void main(String[] args) {
	Integer intObj = Integer.valueOf(123);
	double myByte = intObj.doubleValue();
	System.out.println(myByte);
	   String str = "01111111";
    int radix = 2;
    Integer intObject = Integer.valueOf(str, radix);
    int intValue = Integer.parseInt(str, 2);
    System.out.println("str = " + str);
    System.out.println("intObject = " + intObject);
    System.out.println("intValue = " + intValue);
	
    BitSet bitSet = new BitSet();
    long[] array = { 1, 2, 3 };
    bitSet = BitSet.valueOf(array);
    System.out.println(bitSet);
    long[] tmp = bitSet.toLongArray();
    for (long number : tmp) {
      System.out.println(number);
    }
    System.out.println(bitSet.previousSetBit(1));
    System.out.println(bitSet.previousClearBit(66));
	}

}
