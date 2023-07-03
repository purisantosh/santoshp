package com.java.week3;
class toYoungException extends RuntimeException
{
    toYoungException(String s)
    {
        super(s);
    }
}
class toOldException extends RuntimeException
{
    toOldException(String s)
    {
        super(s);
    }
}
class CustomException {
    public static void main(String[] args)
    {
        int age=Integer.parseInt("29");
        if(age<60)
        {
           throw new toOldException("your age is already crossed marriage age..no chance of getting marriage");
        } else if (age>16) {
            throw new toYoungException("please wait some more time..you will get best match soon");
        }
        else
        {
            System.out.println("you will get match details soon by email..!!");
        }
    }
}
