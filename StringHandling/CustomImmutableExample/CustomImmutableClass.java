public class CustomImmutableClass {
    int x;

    CustomImmutableClass(int x){
        this.x=x;
    }

    public CustomImmutableClass ImmutableChange(int x){
        if(this.x==x)
            return this;
        else 
            return new CustomImmutableClass(x);
    
        
    }
}
