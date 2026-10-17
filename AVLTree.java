class Node {
    int data;
    int height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 0; 
    }
}

class AVLTree {

    Node root;

    int height(Node node) {
        if (node == null)
            return -1; 
        return node.height;
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;


        x.right = y;
        y.left = T2;

    
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x;
    }

    
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;


        y.left = x;
        x.right = T2;

        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y;
    }

    Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; 
        root.height = 1 + Math.max(height(root.left), height(root.right));


        int balance = height(root.left) - height(root.right);

      
        if (balance > 1 && key < root.left.data)
            return rightRotate(root);


        if (balance < -1 && key > root.right.data)
            return leftRotate(root);

        
        if (balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

    
        if (balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    void inorder(Node root) {
    if (root != null) {
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

        public Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public Node delete(Node root, int key){
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = delete(root.left, key);
        }
        else if(key > root.data){
            root.right = delete(root.right, key);
        }
        else{
            // case-1 Having 0 child
            if(root.left == null && root.right == null){
                return null;
            }
            // case-2 Having 1 child
            if(root.left == null ){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            // case-3 Having 2 child
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right,successor.data);
        }
         // if tree had only one node
        if (root == null)
            return root;

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = height(root.left) - height(root.right);

         if (balance > 1 && (height(root.left.left) - height(root.left.right)) >= 0)
            return rightRotate(root);

        // LR
        if (balance > 1 && (height(root.left.left) - height(root.left.right)) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR
        if (balance < -1 && (height(root.right.left) - height(root.right.right)) <= 0)
            return leftRotate(root);

        // RL
        if (balance < -1 && (height(root.right.left) - height(root.right.right)) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }


     
        return root;
    }
    public static void main(String[] args){
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10);
    tree.root = tree.insert(tree.root, 20);
    tree.root = tree.insert(tree.root, 30);
    tree.root = tree.insert(tree.root, 40);
    tree.root = tree.insert(tree.root, 50);
    tree.root = tree.insert(tree.root, 25);

    System.out.println("Inorder traversal after insertion:");
    tree.inorder(tree.root);

    tree.root = tree.delete(tree.root, 40);

    System.out.println("\nInorder traversal after deletion:");
    tree.inorder(tree.root);
}
    }
  
