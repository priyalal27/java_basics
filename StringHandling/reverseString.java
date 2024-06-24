public class reverseString {



    public static void main(String[] args) {
    

        String s= "Priya";
        char s1[]=s.toCharArray();
        int len = s1.length;
        for(int i = len-1;i>=0; i--){
                System.out.print(s1[i]);
        }
    }
}
