package Pattern;

public class Main {
    public void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.square(5);
    }
}