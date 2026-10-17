// recursive version of code of the BinarySearchTree 
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }                                                     

}
public class BinarySearchTree{
    Node root;
    public Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    public boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(key == root.data){
            return true;
        }
        else if(key < root.data){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
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
        return root;
    }
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 20);
		bst.root = bst.insert(bst.root, 50);
		bst.root = bst.insert(bst.root, 15);
		bst.root = bst.insert(bst.root, 25);
		System.out.println(bst.search(bst.root, 500));
		bst.delete(bst.root, 20);
		bst.inOrder(bst.root);
    }
}