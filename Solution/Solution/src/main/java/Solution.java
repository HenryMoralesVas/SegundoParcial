import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum (int n);
}

class MyCalculator implements  AdvancedArithmetic{
    public MyCalculator() {
    }
 
    @Override
    public int divisor_sum(int n) {
        int result=0;
        for ( int i =1 ; i<=n; i++){
            
            if (n%i ==0){
                System.out.println(i+" Es divisor de "+n);
                result=result+i;
            }else {
                System.out.println(i+" No divisor de "+n);
            }                      
        } 
        return result;
      }   
};

public class Solution {
        
    static void ImplementedInterfaseNames (Object o){
            Class[] theInterfaces =o.getClass().getClasses();
            for (int i=0 ; i < theInterfaces.length ; i++ ){
                String interfaceName =theInterfaces[i].getName();
                System.out.println(interfaceName);
                 }     
             }  
    
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator ();
        System.out.print("I implemented:");
        ImplementedInterfaseNames (my_calculator);
        Scanner sc =new Scanner (System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }            
}     
        
        
    
    
    
