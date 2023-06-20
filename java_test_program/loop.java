
import java.util.Scanner;

class Loop{
    public static void main(String[] args){
        System.out.println("please entered your desired number");
        Scanner input=new Scanner(System.in);
        int number,sum=0;
    for(int i=0; i<5; i++){
        number=input.nextInt();
        if(number>5&&number<20){
            continue;
        }
        sum+=number;
       
    }  
     System.out.println("your entered qty sumession"+sum);
     input.close();  
    
    }
}