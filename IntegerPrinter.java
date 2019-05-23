 //import java.util.Scanner;


public class IntegerPrinter {

    public String printIntegerAsBinary(Integer value){
        return value.toBinaryString(value);
    }

    public String printIntegerAsOctal(Integer value){
        String output = new String();
        return output.format("%o",value);
    }

    public String printIntegerAsHexadecimal(Integer value){
        String output = new String();
        return output.format("%x",value);
    }

    public static void main(String[] args){

    }
}
