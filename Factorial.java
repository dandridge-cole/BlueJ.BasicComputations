 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
            BigInteger myBigInt = new BigInteger("1");
            for(Integer i=2; i<=value;i++) 
                myBigInt=myBigInt.multiply(BigInteger.valueOf(i));
        return myBigInt;
    }

}
