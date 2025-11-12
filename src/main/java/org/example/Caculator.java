package org.example;

public class Caculator {
    public int add(int firstNum, int secondNum)
     {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to the Integer.MAX_VALUE");
        int result = firstNum + secondNum;
         return result;
     }

    public int sub(int firstNum, int secondNum)
    {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to the Integer.MAX_VALUE");
        int result = firstNum - secondNum;
        return result;
    }

    public int multi(int firstNum, int secondNum)
    {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to the Integer.MAX_VALUE");
        int result = firstNum * secondNum;
        return result;
    }

    public int div(int firstNum, int secondNum)
    {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to the Integer.MAX_VALUE");
        int result = firstNum / secondNum;
        return result;
    }
}
