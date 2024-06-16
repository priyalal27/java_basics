import java.util.ArrayList;

public class TestLogic_Numbers {



    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        NumbersLogic eo = new NumbersLogic();
        System.out.println(eo.evenodd_number(45));

        System.out.println(eo.LeapYearChecker(877));

        System.out.println(eo.sumofdigits(123456789));

        System.out.println(eo.sumofevenodd(123456789));

        PrintNumberofdigitsinNumber pnd = new PrintNumberofdigitsinNumber();
        System.out.println(pnd.NumberofDigitsInNumber(332212));
    }
}
