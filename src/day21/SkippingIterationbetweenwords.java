package day21;

public class SkippingIterationbetweenwords {
    // contiue is the skipper
    public static void main(String[] args) {
        for(int x=1; x<=10; x++){
            if(x%2==1){
                continue;
            }
            System.out.println(x);
        }
    }
}
