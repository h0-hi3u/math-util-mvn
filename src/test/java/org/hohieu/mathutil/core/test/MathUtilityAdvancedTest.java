/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.hohieu.mathutil.core.test;

import org.hohieu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Ho Trong Hieu
 */
public class MathUtilityAdvancedTest {

// chuẩn bị sẵn riêng test data, lát hồi fill vào hàm
// DDT    
    // hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    // mảng chứa các cặp n -> expected, ví dụ: 0! -> 1; 1! -> 1
    public static Object[][] initTestDate() {
        Object[][] testData = {
                               {0, 1},
                               {1, 1},
                               {2, 2},
                               {5, 120},
                               {6, 720}
                                };
        return testData;
    }
    
@ParameterizedTest
@MethodSource(value = "initTestDate")
public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
    //tham số hóa việc test data vào hàm assertEquals()
    // biến đổi dữ liệu thành tham số tổng quát
    // PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
}

// TDD vs. DDT
// TDD -Test driven development
// là kĩ thuật viết code chính đan xen cùng với viết Test Case, Test script
// tức là quá trình viết app làm app ta viết luôn những đoạn test code như 
// (dùng thư viện như Unit Test như JUnit, TestNG, xUnit)


// Viết code và viết code test cùng với nhau thì gọi là
// kĩ thuật lập trình hướng về kiểm thử - TDD

// DDT - Data driven testing
// là kĩ thuật bổ trợ thêm cho kĩ thuật TDD
// là kĩ thuật viết test code mà ta tách riêng những bộ data test ra 1 chỗ
// câu lệnh so sánh ra 1 chỗ 
// kết nối, map/fill test data vào hàm test thông qua tham số
// (6,720) -> fill vào 2 biến n, expected và lát hồi 2 biến này dc fill vào tiếp cái hàm
// assertEquals (expected, getF(n))

// Data được tách riêng ra, biến thành tham số cho hàm kiểm thử
// kĩ thuật này dc gọi là tách data hướng cho việc kiểm thử

// DDT
// Còn gọi là 1 yên khác là PARAMETERIZED TESTING
// Kĩ thuật kiểm thử code mà hướng về tham số hóa các DATA TEST

