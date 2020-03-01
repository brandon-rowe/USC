public class BinarySearchTree {

    private BstNode root;

    public boolean isEmpty() {

        return (this.root == null);

    }

    public void insert(Integer data) {

        System.out.print("[input: "+data+"]");

        if(root == null) {

            this.root = new BstNode(data);

            System.out.println(" -> inserted: "+data);

            return;

        }

        insertNode(this.root, data);

        System.out.print(" -> inserted: "+data);

        System.out.println();

    }

    private BstNode insertNode(BstNode root, Integer data) {

        BstNode tmpNode = null;

        System.out.print(" ->"+root.getData());

        if(root.getData() >= data) {

            System.out.print(" [L]");

            if(root.getLeft() == null) {

                root.setLeft(new BstNode(data));

                return root.getLeft();

            } else {

                tmpNode = root.getLeft();

            }

        } else {

            System.out.print(" [R]");

            if(root.getRight() == null) {

                root.setRight(new BstNode(data));

                return root.getRight();

            } else {

                tmpNode = root.getRight();

            }

        }

        return insertNode(tmpNode, data);

    }

    public static void main(String a[]) {

        BinarySearchTreeImpl bst = new BinarySearchTreeImpl();

        bst.insert(30);

        bst.insert(40);

        bst.insert(24);

        bst.insert(58);

        bst.insert(48);

        bst.insert(26);

        bst.insert(11);

bst.insert(13);

    }

}