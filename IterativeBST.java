class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class IterativeBST {


    public static Node insert(Node root, int key) {
        Node newNode = new Node(key);

        if (root == null) return newNode;

        Node current = root, parent = null;

        while (current != null) {
            parent = current;
            if (key < current.data)
                current = current.left;
            else
                current = current.right;
        }

        if (key < parent.data)
            parent.left = newNode;
        else
            parent.right = newNode;

        return root;
    }


    public static Node search(Node root, int key) {
        Node current = root;

        while (current != null) {
            if (key == current.data)
                return current;
            else if (key < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return null;
    }


    public static Node delete(Node root, int key) {
        Node current = root;
        Node parent = null;

        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data)
                current = current.left;
            else
                current = current.right;
        }

        if (current == null) return root; 

        if (current.left == null || current.right == null) {
            Node newCurr;

            if (current.left == null)
                newCurr = current.right;
            else
                newCurr = current.left;

        
            if (parent == null)
                return newCurr;

            if (current == parent.left)
                parent.left = newCurr;
            else
                parent.right = newCurr;
        }

    
        else {
            Node p = null;
            Node temp = current.right;

            
            while (temp.left != null) {
                p = temp;
                temp = temp.left;
            }


            current.data = temp.data;

    
            if (p != null)
                p.left = temp.right;
            else
                current.right = temp.right;
        }

        return root;
    }

    
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    
    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.print("Before Deletion: ");
        inorder(root);

        root = delete(root, 50); 

        System.out.print("\nAfter Deletion: ");
        inorder(root);
    }
}