package Pattern;

public class Main {
    public void squarePattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void RightAnglePattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void RightAngleNumberPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void RightAngleNumberPatternII(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public void invertedRightAnglePattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void invertedRightAngleNumberPattern(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void startPyramid(int n){
        for(int i=0;i<n;i++){
            // printing space before star in each row
            for(int j=0;j<n-i;j++){
                System.out.print("-");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            // printing space after star in each row
            for(int j=0;j<n-i;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public void invertedStartPyramid(int n){
        for(int i=n-1;i>=0;i--){
            // printing space before star in each row
            for(int j=0;j<n-i;j++){
                System.out.print("-");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            // printing space after star in each row
            for(int j=0;j<n-i;j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Main mn = new Main();
        mn.squarePattern(5);
        mn.RightAnglePattern(5);
        mn.RightAngleNumberPattern(5);
        mn.RightAngleNumberPatternII(5);
        mn.invertedRightAnglePattern(5);
        mn.invertedRightAngleNumberPattern(5);
//        mn.startPyramid(5);
        mn.invertedStartPyramid(5);

    }
}
