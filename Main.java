import model.Tree;

public class Main {
    public static void main(String[] args) {
        
        //insert Test
        Tree tree1 = new Tree(69);
        tree1.insertValue(420);
        tree1.insertValue(1337);
        tree1.insertValue(80082);
        tree1.insertValue(1);

        Tree tree2 = new Tree(1);
        tree2.insertValue(2);
        tree2.insertValue(3);
        tree2.insertValue(4);
        tree2.insertValue(5);
        tree2.insertValue(7);
        tree2.insertValue(6);
        tree2.insertValue(6);

        Tree tree3 = new Tree(69);
        tree1.insertValue(420);
        tree1.insertValue(1337);
        tree1.insertValue(80082);
        tree1.insertValue(1);

        //str() Test
        System.out.println("str() Test:");

        String expectedStr1 = "<1><69><420><1337><80082>";
        String actualString1 = tree1.str();
        System.out.println("Expected = " + expectedStr1);
        System.out.println("Actual = " + actualString1);
        System.out.println();

        String expectedStr2 = "<1><2><3><4><5><6><7>";
        String actualString2 = tree2.str();
        System.out.println("Expected = " + expectedStr2);
        System.out.println("Actual = " + actualString2);
        System.out.println();

        //contains Test
        System.out.println("contains() Test:");

        System.out.println("Expected: true / Actual: " + tree1.contains(1337));
        System.out.println();

        System.out.println("Expected: false / Actual: " + tree1.contains(5));
        System.out.println();

        //same tree test
        System.out.println("hasSameValues() Test:");
        System.out.println("Expected: true / Actual: " + tree1.hasSameValues(tree3));
        System.out.println();

        System.out.println("Expected: false / Actual: " + tree1.hasSameValues(tree2));
        System.out.println();
    }

}
