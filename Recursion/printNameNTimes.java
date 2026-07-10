package Recursion;
public class printNameNTimes{
    public void main(String[] args){
        print(5);

    }

    void print(int n){
        if(n < 1)
            return;
        System.out.println("Mudasir");
        print(n-1);
    }
}