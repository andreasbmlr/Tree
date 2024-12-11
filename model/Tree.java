package model;

public class Tree {
    //Attributes
    int value;
    Tree left;
    Tree right;
    
    public Tree (int value) {
        this.value = value;
    }

    //Getter
    public int getValue() {
        return value;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    //Setter
    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    //Tree to String
    public String str() {
        String treeStrWhole = "";
        String treeStrLeft = "";
        String treeStrRight = "";

        if (value != 0) {
            if (left != null) {
                treeStrLeft = left.str();
            }
            if (right != null) {
                treeStrRight = right.str();
            }
            treeStrWhole += treeStrLeft;
            treeStrWhole += "<" + value + ">";
            treeStrWhole += treeStrRight;
        }
        return treeStrWhole; 
    }

    //New value insertion
    public void insertValue(int value) {
        if (this.value == 0) {
            this.value = value;
        } else if (this.value == value) {
            this.value = value;
        } else if (value < this.value) {
            if (left == null) {
                Tree left = new Tree(value);
                setLeft(left);
            } else {
                this.left.insertValue(value);
            }
        } else {
            if (right == null) {
                Tree right = new Tree(value);
                setRight(right);
            } else {
                right.insertValue(value);
            }
        }
    }

    //Contains
    public boolean contains(int value) {
        if (this.value == value) {
            return true;
        } else if (value < this.value && this.left != null) {
            return this.left.contains(value);
        } else if (value > this.value && this.right != null) {
            return this.right.contains(value);
        } else {
            return false; 
        }
    }

    //Two trees same values
    public boolean hasSameValues(Tree other) {
        if (this.value == other.value) {
            if (value < this.value) {
                left.hasSameValues(other);
            }
            if (value > this.value && this.right != null) {
                right.hasSameValues(other);
            }
        } else {
            return false;
        }
        return true;
    }

}





