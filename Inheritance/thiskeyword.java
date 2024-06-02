public class thiskeyword {

    int a=10;
    int b=20;

    public void check(){
       
        int a = 30 , b = 40;
        System.out.println("local a variable"+a);
        System.out.println("local b variable"+b);
        System.out.println("class a variable"+this.a);
        System.out.println("class b variable"+this.b);
        
    }

    thiskeyword(int a, int b){
        System.out.println("Invoke constructor" + a);
    }

    public static void main(String[] args) {
        thiskeyword tt = new thiskeyword();
        tt.check();
    }

}
