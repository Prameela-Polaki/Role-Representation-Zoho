 class Roles {  
  
    //Represent a node of binary tree  
    public static class Node{  
        String data;  
        Node left;  
        Node right;  
  
        public Node(String data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }  
  
      //Represent the root of binary tree  
      public Node root;  
  
      public Roles(){  
          root = null;  
      }  
  
      //insert() will add new node to the binary search tree  
      public void insert(String data) {  
          //Create a new node  
          Node newNode = new Node(data);  
  
          //Check whether tree is empty  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              //current node point to root of the tree  
              Node current = root, parent = null;  
  
              while(true) {  
                  //parent keep track of the parent node of current node.  
                  parent = current;  
  
                  //If data is less than current's data, node will be inserted to the left of tree  
                  if(data.length() > current.data.length() ) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                  //If data is greater than current's data, node will be inserted to the right of tree  
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
      //minNode() will find out the minimum node  
      public Node minNode(Node root) {  
          if (root.left != null)  
              return minNode(root.left);  
          else  
              return root;  
      }  
  
      //deleteNode() will delete the given node from the binary search tree  
  
      //inorder() will perform inorder traversal on binary search tree  
      public void inorderTraversal(Node node) {  
  
          //Check whether tree is empty  
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }  
  
      public static void main(String[] args) {  
  
       Roles bt = new Roles();  
        bt.insert("CEO");
        bt.insert("COO");
        bt.insert("CTO");;
  
          System.out.println("Roles:");  
          //Displays the binary tree  
          bt.inorderTraversal(bt.root);  
  
}  
}