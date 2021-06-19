/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Softlogic
 */
public class TestJava {

    

    public static void main(String[] args) {
        
        TestJava myone= new TestJava();
        int numbers[]={22,112,2,134,46,678,23,11};
       
        int x=myone.FindMax(numbers);
        int n=myone.FindMin(numbers);
        int f[]=myone.Ascending(numbers);
        int m[]=myone.Decending(numbers);
        System.out.println(x);
        System.out.println(n);
        
       //pham ge moments
        System.out.print("Ascending Order:  ");
      for (int i=0; i<f.length; i++){
          
          System.out.print(f[i]+".");
   
       }
//      System.out.println("decending Order:  ");
//      for (int i=0; i<m.length; i++){
//          
//          System.out.print(m[i]+".");
//   
//       }
        
        
        
   
        
    }
     int FindMax(int numbers[]){
         
        int max=numbers[0];
        
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        //System.out.print(max);
        return max;
     }
     
     int FindMin(int numbers[]){
         
        int min=numbers[0];
        
        for(int i=0;i<numbers.length;i++){
            if(min>numbers[i]){
                min=numbers[i];
            }
        }
        //System.out.print(max);
        return min;
     }
    int[] Ascending(int numbers[]){
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j]){
                    int large=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=large;
                }
            
            }
        
        }
    return numbers;
    }
    
    int[] Decending(int numbers[]){
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]<numbers[j]){
                    int minor=numbers[j];
                    numbers[j]=numbers[i];
                    numbers[i]=minor;
                }
            
            }
        
        }
    return numbers;
    }
     
    
}
