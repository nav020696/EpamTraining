package TestSorting;

import SortingTest.LazySortingImpl;

public class LazySortingTestExtension extends SortingTest{

    public LazySortingTestExtension() {
        sorting = new LazySortingImpl();
    }
}

