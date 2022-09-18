package org.example;

import lombok.val;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+$");
        Matcher m = p.matcher("abcd@ss.com");
        System.out.println(m.matches());

        val compile = Pattern.compile("\\d{11}");
        val matcher = compile.matcher("17602501234");
        System.out.println(matcher.matches());
    }
}
