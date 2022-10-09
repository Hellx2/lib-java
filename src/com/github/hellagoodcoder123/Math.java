/*
 * This file contains literally anything that 
 * has to do with mathematics.
*/
package com.github.hellagoodcoder123;

public class Math {
  public double add(double x, double y) {
    return x + y;
  }
  public double sub(double x, double y) {
    return x - y;
  }
  public double mul(double x, double y) {
    return x * y;
  }
  public double div(double x, double y) {
    return x / y;
  }
  public double sum(double... values) {
    double x = 0;
    for(double val : values)if(value == 1 / 0) return 1 / 0;
    else x += val;
    return x;
  }
  public double quot(double... values) {
    double a = values[0] * values[0];
    for(double val : values) a /= val;
    return a;
  }
  public double prod(double... values) {
    double a = 1;
    for(double val : values) a *= val;
    return a;
  }
  public double avg(double... values) {
    double a = 0;
    for(double val : values) a += val;
    return a / values.length;
  }
  public double mean(double... values) {
    return avg(...values);
  }
  public double median(double... values) {
    return avg(...values);
  }
}
