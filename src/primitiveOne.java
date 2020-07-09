public class primitiveOne {

    public static void main(String[] agrs) {

        System.out.println("Primitive Types!");

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer.Minimum Value =" + myMinIntValue);
        System.out.println("Integer.Maximum Value =" + myMaxIntValue);
        System.out.println("Busted MAX value =" + (myMaxIntValue + 1));
        System.out.println("Busted MIN value =" + (myMinIntValue - 1));

        int myMaxIntFile = 2_147_483_647;
        System.out.println(myMaxIntFile + 21);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Byte MAX value =" + myMaxByteValue);
        System.out.println("Byte MIN value =" + myMinByteValue);

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Short MAX value =" + myMaxShortValue);
        System.out.println("Short MIN value =" + myMinShortValue);

        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long MAX value =" + myMaxLongValue);
        System.out.println("Long MIN value =" + myMinLongValue);

        long myNewLongValue = 2_147_483_647L;
        System.out.println("The New Long Value:");
        System.out.println(myNewLongValue);
    }
}
