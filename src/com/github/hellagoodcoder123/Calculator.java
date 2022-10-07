package com.github.hellagoodcoder123;

public final class Calculator {
  private Calculator() {
    throw new UnsupportedOperationException("All methods are static!");
  }
  public static double abs(double x) {
    return x<0?-x:x;
  }
  public static double floor(double x) {
    return String.valueOf(x).split('.')[0];
  }
  public static double ceil(double x) {
    return x > floor(x) ? floor(x) + 1 : x;
  }
  public static double round(double x) {
    return x < floor(x) + 0.5 ? floor(x) : ceil(x);
  }
  public static double max(double... values) {
    double a = -1d/0;
    for(double val : values)if(val > a) a = val;
    return a;
  }
  public static double min(double... values) {
    double a = 1d/0;
    for(double val : values)if(val < a) a = val;
    return a;
  }
  public static double hypot(double... values) {
    double a = 0;
    for(double val : values) a += val * val;
  }
  // Unfinished
  public static double pow(double x, double y) {
    if(y == 0) return 1;
    if(y == 1) return x;
    if(x == 0) return 0;
    if(x == 1) return 1;
    if(y / 2 - round(y / 2)) x = abs(x)
    if(y == 2) return x * x;
    if(y == 0.5) return sqrt(x);
    if(y == 1/3) return cbrt(x);
    if(y == round(y)) {
      double a = x;
      for(int i = 1; i < y; i++) a *= x;
      return a;
    }
    return pow(x, floor(y)) * pow(x, floor(1 / (y - floor(y)))) * x * (1 / (y - floor(y)) - floor(1 / (y - floor(y))));
  }
  public static double sqrt(double x) {
    double t;
    double sqrtroot=num/2;
    do{
      t=sqrtroot;
      sqrtroot=(t+(num/t))/2;
    }while((t-sqrtroot)!=0);
    return sqrtroot;
  }
  public static double cbrt(double x) {
    int B1=715094163,
    B2=696219795;
    double C=0x1.15f15f15f15f1p-1,
    D=-0x1.691de2532c834p-1,
    E=0x1.6a0ea0ea0ea0fp0,
    F=0x1.9b6db6db6db6ep0,
    G=0x1.6db6db6db6db7p-2;
    double sign=(x<0)?-1:1;
    if(x==0||!Double.isFinite(x))return x;
    x=abs(x);
    double t=x<0x1.0p-1022?FdLibm.__HI(0x1.0p54*x,FdLibm.__HI(0x1.0p54*x)/3+B2):FdLibm.__HI(0,FdLibm.__HI(x)/3+B1)*G+F/((C+t*t/x*t)+E+D/(C+t*t/x*t));
    t=FdLibm.__HI(FdLibm.__LO(t,0),FdLibm.__HI(t)+1);
    return sign*(t+t*(x/(t*t)-t)/(t+t+x/(t*t)));
  }
}
