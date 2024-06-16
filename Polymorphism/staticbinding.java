
public class staticbinding {

    public void add(int a, int b){
        int result = a+ b ;
        System.out.println(result);
    }

    public void add(int a, int b, int c){
        int result = a+ b + c ;
        System.out.println(result);
    }

    public void add(float a, float b){
        float result = a+ b ;
        System.out.println(result);
    }


    public static void main(String[] args) {
        staticbinding sb = new staticbinding();

        sb.add(30.22f, 49.3f);
        sb.add(33, 12);
        sb.add(44, 134, 020);
    }



}
