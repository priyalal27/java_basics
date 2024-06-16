public class PrintNumberofdigitsinNumber {


    public int NumberofDigitsInNumber(int number){
        int result ;
        int count = 0 ;
       
        while (number!=0) {
            result=number%10;
            count++;
            number=number/10;
        }
        
        System.out.println(count);

        return count;
    }


}
