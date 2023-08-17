public class HinhTron implements Hinh{

  
    public double Tong(double a, double b) {
    return a+b;
    }
    public double Tru(double a, double b) {
    return a-b;
    }
    public double Nhan(double a, double b) {
    return a*b;   
    }

    @Override
    public double Chia(double a, double b) {
    return a/b;

}

}