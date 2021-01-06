package Trees;

import java.util.*;


class Node{
    Node left;
    Node right;
    int data;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class LevelOrderTrav {
    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node currentNode = q.poll();
            System.out.print(currentNode.data+" ");
            if(currentNode.left != null){
                q.add(currentNode.left);
            }
            if(currentNode.right != null){
                q.add(currentNode.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }
}
