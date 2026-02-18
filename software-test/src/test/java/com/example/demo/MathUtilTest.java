package com.example.demo;

//JUnitのアサーション(期待値と実際の値を比較するメソッド)を使用するためのインポート
//JUnitを使用するときはstaticインポートを使用する
import static org.junit.jupiter.api.Assertions.*;

//JUnitで使うアノテーションをインポート
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//クラス名はテスト対象の後ろにtestをつけたものにする
//テスト対象と(src/testの下に、テスト対象と同じパッケージ構造にする）
//テスト対象　　src/main/java/com/example/softwarer_test/MathUtil.java
//テストプログラム   src/test/java/com/example/software_test/MathUtilTesto.java
public class MathUtilTest {

    //全テスト実⾏前に１度だけ実⾏されるメソッド
    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    //全テスト実⾏後に１度だけ実⾏されるメソッド
    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    //各テスト実⾏前に毎回実⾏されるメソッド
    @BeforeEach
    public void setUp() throws Exception {
    }

    //各テスト実⾏後に毎回実⾏されるメソッド
    @AfterEach
    public void tearDown() throws Exception {
    }

    //実際にテストを記述していくメソッド
    //一つのテストケースにつき1メソッド用意する
    // fail()メソッドはテストを失敗させるメソッド
    @Test
    public void test() {
    //fail("Not yet implemented");    


    //期待値と実際の値を比較する。
    //assertEquals("期待値", "実際の結果", "テスト失敗時のエラーメッセージ");
    double result =MathUtil.power(0, -2);
    assertEquals(Double.POSITIVE_INFINITY,result, "TC1 期待値と実際の結果が異なります。");

    }

    @Test
    public void test2() {
    double result =MathUtil.power(0, -1);
    assertEquals(Double.POSITIVE_INFINITY,result, "TC2 期待値と実際の結果が異なります。");
    }
    
   @Test
public void test3() {
    double result = MathUtil.power(0, 0);
    assertEquals(1.0, result, "TC3 期待値と実際の結果が異なります。");
}

@Test
public void test4() {
    double result = MathUtil.power(0, 1);
    assertEquals(0.0, result, "TC4 期待値と実際の結果が異なります。");
}

@Test
public void test5() {
    double result = MathUtil.power(0, 2);
    assertEquals(0.0, result, "TC5 期待値と実際の結果が異なります。");
}

@Test
public void test6() {
    double result = MathUtil.power(1, -2);
    assertEquals(1.0, result, "TC6 期待値と実際の結果が異なります。");
}

@Test
public void test7() {
    double result = MathUtil.power(1, -1);
    assertEquals(1.0, result, "TC7 期待値と実際の結果が異なります。");
}

@Test
public void test8() {
    double result = MathUtil.power(1, 0);
    assertEquals(1.0, result, "TC8 期待値と実際の結果が異なります。");
}

@Test
public void test9() {
    double result = MathUtil.power(1, 1);
    assertEquals(1.0, result, "TC9 期待値と実際の結果が異なります。");
}

@Test
public void test10() {
    double result = MathUtil.power(1, 2);
    assertEquals(1.0, result, "TC10 期待値と実際の結果が異なります。");
}

@Test
public void test11() {
    double result = MathUtil.power(-1, -2);
    assertEquals(1.0, result, "TC11 期待値と実際の結果が異なります。");
}

@Test
public void test12() {
    double result = MathUtil.power(-1, -1);
    assertEquals(-1.0, result, "TC12 期待値と実際の結果が異なります。");
}

@Test
public void test13() {
    double result = MathUtil.power(-1, 0);
    assertEquals(1.0, result, "TC13 期待値と実際の結果が異なります。");
}

@Test
public void test14() {
    double result = MathUtil.power(-1, 1);
    assertEquals(-1.0, result, "TC14 期待値と実際の結果が異なります。");
}

@Test
public void test15() {
    double result = MathUtil.power(-1, 2);
    assertEquals(1.0, result, "TC15 期待値と実際の結果が異なります。");
}

}
