 


public class ShortCalculator {
    public short sum(short num1, short num2){
        short ans = (short)(num1+num2);
        if (ans<0) ans *= (short)(-1);
        return ans;
    }
        public short difference(short num1, short num2){
        short ans = (short)(num1 - num2);
        if (ans<0) ans *= (short)(-1);
        return ans;
    }
        public short product(short num1, short num2){
        short ans = (short)(num1*num2);
        if (ans<0) ans *= (short)(-1);
        return ans;
    }
        public short quotient(short num1, short num2){
        short ans = (short)(num1/num2);
        if (ans<0) ans *= (short)(-1);
        return ans;
    }
        public short remainder(short num1, short num2){
        short ans = (short)(num1%num2);
        if (ans<0) ans *= (short)(-1);
        return ans;
    }

}
