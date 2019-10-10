public class Point {
    double x;
    double y;
    Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    boolean inFirstQuarter(){
        return (x>0 && y>0);
    }
    boolean inSecondQuarter(){
        return (x>0 && y<0);
    }
    boolean inThirdQuarter(){
        return !inFirstQuarter();
    }
    boolean inFourthQuarter(){
        return !inSecondQuarter();
    }
    boolean onOx(){
       return y==0;
    }
    boolean onOy(){
        return x==0;
    }
    boolean in0Point(){
        return (x==0 && y==0);
    }
}
