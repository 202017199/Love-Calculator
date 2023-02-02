import java.util.Scanner;

public class lovecal {

    private static int findSum(int num){
        int sum = 0;
        while (num >0) {

            sum += num % 10 ;
            num /=10 ;
            
        }
        return sum ;  //returning the sum 
    }
    public static void main(String[] args) {

        String firstName ;
        String secondName ;
        final String LOVE = "love" ;

        int firstSum ;
        int secondSum ;
        int loveSum ;
        int totaltSum ;

        Scanner scan = new Scanner(System.in);

     
            System.out.println("Enter the first name :");
            firstName = scan.nextLine();

          
            System.out.println("Enter the second name :");
            secondName = scan.nextLine();

            //initialize the sums 

            firstSum = 0;
            secondSum = 0;
            loveSum = 0;

            //converting the names to lower cases

            firstName = firstName.toLowerCase();
            secondName = secondName.toLowerCase();

            //finding the sum of the characters of the first string using ASCII table

            for(var i =0;i<firstName.length() ; i++){

                firstSum += firstName.charAt(i);
            }

            //finding the sum of the characters of the second string using ASCII table

            for(var i =0;i<secondName.length() ; i++){
                
                secondSum += secondName.charAt(i);
            }

            for(var i = 0 ; i< LOVE.length() ; i++){

                loveSum += LOVE.charAt(i) ;
           }

           totaltSum = findSum(firstSum + secondSum);
           loveSum = findSum(loveSum);

           if (totaltSum > loveSum) {

                totaltSum =loveSum - (totaltSum - loveSum) ;
               
           }

           scan.close();

           double x = (totaltSum*100)/loveSum ;

           System.out.println("Love % :"+ x);

   
        
    }
    
}
