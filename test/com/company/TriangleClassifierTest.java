package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
@Test
void TriangleClassifierTest1(){
    double a = 2;
    double b = 2;
    double c = 2;
    String expect = "tam giac deu";
    String result = TriangleClassifier.check(a,b,c);
    assertEquals(expect,result);
}
    @Test
    void TriangleClassifierTest2(){
        double a = 2;
        double b = 2;
        double c = 3;
        String expect = "tam giac can";
        String result = TriangleClassifier.check(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void TriangleClassifierTest3(){
        double a = 3;
        double b = 4;
        double c = 5;
        String expect = "tam giac thuong";
        String result = TriangleClassifier.check(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void TriangleClassifierTest4(){
        double a = 8;
        double b = 2;
        double c = 3;
        String expect = "ko phai tam giac";
        String result = TriangleClassifier.check(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void TriangleClassifierTest5(){
        double a = -1;
        double b = 2;
        double c = 1;
        String expect = "ko phai tam giac";
        String result = TriangleClassifier.check(a,b,c);
        assertEquals(expect,result);
    }
    @Test
    void TriangleClassifierTest6(){
        double a = 0;
        double b = 2;
        double c = 3;
        String expect = "ko phai tam giac";
        String result = TriangleClassifier.check(a,b,c);
        assertEquals(expect,result);
    }
}