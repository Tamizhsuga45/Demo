package javaprogram;

public class Vote {
public static void main (String[] args)
{
	int age = 18;
    if(age>=16 && age<18)
    {
       System.out.println("He is Not Eligible for voting"); 
    }
    else if(age<=15)
    {
        System.out.println("He is Not eligible for voting");
    }
    else if(age>=18)
    {
        System.out.println("He is  eligible for voting");
    }
}
}
