package main;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorTests extends TestCase {
    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<>();

        for (int i : ints) {
            list.add(i);
        }

        return list;
    }

    public void test1() {
        assertEquals(list(), PrimeFactor.generate(1));
    }

    public void test2() {
            assertEquals(list(2), PrimeFactor.generate(2));
    }

    public void test3() {
        assertEquals(list(3), PrimeFactor.generate(3));
    }

    public void test4() {
        assertEquals(list(2,2), PrimeFactor.generate(4));
    }

    public void test5() {
        assertEquals(list(7), PrimeFactor.generate(7));
    }

    public void test6() {
        assertEquals(list(2,3), PrimeFactor.generate(6));
    }

    public void test7() {
        assertEquals(list(7), PrimeFactor.generate(7));
    }

    public void test8() {
        assertEquals(list(2,2,2), PrimeFactor.generate(8));
    }

    public void test9() {
        assertEquals(list(3,3), PrimeFactor.generate(9));
    }

    public void test60060() {
        assertEquals(list(2,2,3,5,7,11,13), PrimeFactor.generate(60060));
    }
}
