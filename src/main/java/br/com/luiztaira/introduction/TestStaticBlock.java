package br.com.luiztaira.introduction;

import java.util.Scanner;

public class TestStaticBlock {

    static Scanner input = new Scanner(System.in);
    static boolean flag = true;
    static int B = input.nextInt();
    static int H = input.nextInt();

    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
                //System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if(flag)
            System.out.println(B*H);
    }
}
