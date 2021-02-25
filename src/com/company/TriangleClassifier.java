package com.company;

public class TriangleClassifier {
    public static String check(double a, double b, double c){
    if((a+b)>c && (a+c)>b && (b+c)>a&& a>0 &&b>0 && c>0){
        if (a==b){
            if (a ==c)return "tam giac deu";
            return "tam giac can";
        }
        return "tam giac thuong";
    }
    else{
        return "ko phai tam giac";
    }
}
}
