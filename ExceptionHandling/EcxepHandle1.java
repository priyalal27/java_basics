public class EcxepHandle1 {


  public void handleArrayIndexException(){
    int arr[] = {2,5,7,8,8} ; 
    int result = 0;
    try{
        for (int i = 0; i < arr.length+1; i++) {
        System.out.println(arr[i]);
        result = arr[i]/0;    
    }}
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
}

    




  public static void main(String[] args) {
    EcxepHandle1 ec1= new EcxepHandle1();
    ec1.handleArrayIndexException();
  }

}
