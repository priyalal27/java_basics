import java.util.ArrayList;

public class NumbersLogic {


    public String evenodd_number(int numb){
       String result = "";

        if(numb%2 == 0)
            result="Even";
        else 
            result="Odd";
        
        return  result;
    }


    public String LeapYearChecker(int number){
        if(number == 366)
          return "Leap Year";

        else if(number!=366 | number!=365)
          return  "Invalid number of days";

        else 
         return "not a leap year";
    }

    public int sumofdigits(int number){

        int result;
        int sum = 0;
        while (number!=0) {
            result=number%10;
            sum= sum + result;
            number=number/10;
        }
        return sum;

    }



    public ArrayList sumofevenodd(int number){
        int result ;
        int sum_odd=0;
        int sum_even=0;

        while (number!=0) {
            result=number%10;
            if (result%2==0) {
                sum_even=result+sum_even;
            }
            else
               sum_odd=result+sum_odd;
            
            number=number/10;
        }

        System.out.println("Even"+sum_even);
        System.out.println("Even"+sum_odd);    

        ArrayList<String> myList = new ArrayList<>();
        mylist.add(sum_even);
        mylist.add(sum_odd);
        return myList;
        
    }

}
  