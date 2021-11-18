//random OTP Generator
//random() is used to return a pseudorandom double type number greater than or equal to 0.0 and less than 1.0
import java.util.*;
public class Otp_Generator
{
    static char[] OTP(int len){
        System.out.println("Welcome to random OTP Generator using random():");
        System.out.println("You OTP is:");
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp=new char[len];
        for(int i =0;i<len;i++)
        {
            otp[i]=numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args)
    {
        int length = 4;
        System.out.println(OTP(length));
    }}
