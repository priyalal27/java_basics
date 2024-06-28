public class MapLogic1 {

    public static void main(String[] args) {
        MapLogic1 l= new MapLogic1();
        l.secondhighestnumber();
    }

public void secondhighestnumber(){
    int[] numbers = {-99, 928, 0202, 6626, 50, 1, 0303};
    int max=0;
    int[] new_array =  new int[5];;

    for(int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
        if(max>numbers[i])
            {
                new_array[i]=numbers[i];
            }
    }

    for (int j = 0; j < new_array.length; j++) {
        
    System.out.println(new_array[i]);
   
    }

}

}
