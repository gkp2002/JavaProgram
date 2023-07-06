public class Binary {
    static class Node{
          int data;
          Node left;
          Node right;
          public Node(int data){
            this.data = data;
            this.left = this.right =null;
          }
    }
         public static Node root;
   static class BinaryTree{
       public static Node Tree(Node node,int data){
        if(node == null){
            return new Node(data);
        }
         if(node.data < data){
            node.right = Tree(node.right,data);
         }else{
            node.left = Tree(node.left,data);
         }
        return node;
          
       }
       public static void add(int data){
        root = Tree(root,data);

       }
       public static void inorder(Node node){
          if(node!=null){
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
          }
       }
        public static void preOrder(Node node){
          if(node!=null){
              System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
          }
       }
   }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.add(5);
        tree.add(22);
        tree.add(24);
        tree.add(25);
        tree.add(2);
        tree.add(1);
    System.out.print("Inorder-> ");
        tree.inorder(root);
        System.out.println();
         System.out.print("Preorder-> ");
        tree.preOrder(root);

        
    }
}
