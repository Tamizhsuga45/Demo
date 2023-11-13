package javaprogram;

public class Armstrong{
	  
public static void main(String args[]){
    int n=151,r,sum=0,temp;
   
    temp=n;
    while(n!=0)
    
    {
        r=n%10;
        sum=sum+(r*r*r);
        n=n/10;
    }
    if(temp==sum)
    System.out.println("armstrong number"+temp);
        
    else
   System.out.println("not armstrong number"+temp);
      
  }

}
