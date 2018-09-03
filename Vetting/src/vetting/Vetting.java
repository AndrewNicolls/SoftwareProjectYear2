//Rowan Humphreys BVKL1HCG3
//Question 2
package vetting;

import java.sql.SQLException;
import java.util.Scanner;



public class Vetting {
    
   static public int numStudents;
    int studentCounter=1;
    static int[][] rates;
    int[] total;
    Scanner scan = new Scanner(System.in);    
    
    

    public Vetting(String n, int[][] x ){
        
        
    
    }
    
    
    public int getTotal(){
        int totals=0;
        
         for (int i = 0; i < rates.length; i++){
        for (int j = 0; j < rates[i].length; j++){
            total[j] += rates[i][j];  
        }
    }
        
        return totals;
    }
    
    public int getMax(){
        // creating total array
        int size = rates[0].length;
        total = new int[size];
        int max=0;
        
        
       for (int i = 0; i < rates.length; i++){
        for (int j = 0; j < rates[i].length; j++){
            total[j] += rates[i][j];  
        }
    }
       
        for (int i = 0; i < total.length; i++) {
            for (int j = 1; j < total.length; j++) {
                
                if(total[i]>=total[j]&&total[i]>=max){
                
                   max= total[i];     
                }
                
                
                
            }
            
        }
        
        
        
        return max ;
    
    }
    
    public int getMin(){
        // init min to high number for comparision
        int min=100000000;
        
        for (int i = 0; i < total.length; i++) {
            for (int j = 1; j < total.length; j++) {
                
                if(total[i]<=total[j]&&total[i]<=min){
                
                   min= total[i];     
                }
                
                
                
            }
            
        }
    
        return min;
    }
    
    public void processRates(){
      
        getMax();
        getMin();
        getTotal();
        rateFrequency();
    
    }
    public void rateFrequency(){
        
        int f0 =0;
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;
        int f4 = 0;
        int f5 = 0;
        int f6 = 0;
        int f7 = 0;
        int f8 = 0;
        int f9 = 0;
        int f10 = 0;
        
        for (int i = 0; i < rates.length; i++) {
            for (int j = 0; j<rates[i].length; j++) {
                   
                    
                switch(rates[i][j]){
                    case 0:
                        f0++;
                        break;        
                    case 1:
                        f1++;
                        break;
                    case 2:
                        f2++;
                        break;
                    case 3:
                        f3++;
                        break;
                    case 4:
                        f4++;
                        break;
                    case 5:
                        f5++;
                        break;
                    case 6:
                        f6++;
                        break;
                    case 7:
                        f7++;
                        break;
                    case 8:
                        f8++;
                        break;
                    case 9:
                        f9++;
                        break;
                    case 10:
                        f10++;
                        break;    
                                
                
                }
            }
           }
        System.out.println("Overall rate distribution:");
        
        
        int i=0;
        int x=0;
        
        while(i<=10){
        
            System.out.print(i+":");
            
            while(x!=f0){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f1){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f2){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f3){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f4){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f5){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f6){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f7){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f8){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f9){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
            System.out.println("");
            System.out.print(i+":");
            
            while(x!=f10){
            
                System.out.print("*");
                x++;
            }
            i++;
            x=0;
                    
        
        }
        
    
    }
  
    
    public void outputRates(){
        
        //headings
        System.out.println("The rates are:");
        System.out.println("\t"+"\t"+"Assessment 1 Assessment 2 Assessment 3 Assessment 4 Assessment 5 ");
       
        
        //body
        for (int i = 0; i < rates.length; i++) {
            System.out.print("Student  "+studentCounter+"\t");
            for (int j = 0; j<rates[i].length; j++) {
                
                System.out.print(rates[i][j]+"\t\t");
            }
            System.out.println("");
            studentCounter++;
           }
        // intit total array
        getMax();
        
        //display total array
        System.out.print("[");
        for (int i = 0; i < total.length; i++) {
            System.out.print(total[i]);
            
            if(i!=total.length-1){
                System.out.print(",");
            }
            
            
        }
        System.out.print("]");
        System.out.println("\n\n");
        System.out.println("The last number in the total array is "+ total[total.length-1]);
        System.out.println("Good job on a high score of "+getMax());
        System.out.println("You could improve on the score of "+getMin());
        System.out.println("");
       
    
    }
    
    
    
    
   
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        
        TestVetting tv = new TestVetting("Shaun",rates);
        tv.dbConnection();
        tv.insertToDatabase();
        tv.show();
    }
    
}
