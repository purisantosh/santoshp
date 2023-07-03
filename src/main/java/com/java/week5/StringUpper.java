package com.java.week5;

import java.util.Locale;
import java.util.Optional;

public class StringUpper {
    public static void main(String[] args)
    {
        StringConverter stringConverter=new StringConverter();

        Optional<String> inp1=Optional.of("Santosh Kumar");
        Optional<String> out=stringConverter.inpToUppercase(inp1);
        System.out.println("Uppercase input: "+out.orElse("Empty"));


        Optional<String> inp2=Optional.empty();
        Optional<String> out1=stringConverter.inpToUppercase(inp2);
        System.out.println("Uppercase input: "+out1.orElse("Empty"));
    }
}
class StringConverter
{
    public Optional<String> inpToUppercase(Optional<String> input)
    {
        if(input.isPresent())
        {
            String inp=input.get();
            String Uppercase=inp.toUpperCase();
            return Optional.of(Uppercase);
        }
        else
        {
            return Optional.empty();
        }

    }
}