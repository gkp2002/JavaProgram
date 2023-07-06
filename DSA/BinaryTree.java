public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
       public Node(int data){
           this.data = data;
           this.left=this.right=null;

        }
    }
         public static Node root;
        static class Tree{
            public static Node addNode(Node node,int data){
                if(node==null){
                    return new Node(data);
                    
                }
                  if(node.data<data){
                    node.right=addNode(node.right,data);
                  }else {
                    node.left=addNode(node.left,data);
                  }
                  return node;

            }
            public static void add(int data){
                root = addNode(root,data);
            }
            public static void postOrder(Node node){
                if(node!=null){
                  
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data+" ");
                }
            }


            public static void Leaf (Node node){
                if(node==null){
                    return;
                }
                if(node.left!=null && node.right!=null){
                    Leaf(node.left);
                    Leaf(node.right);
                }else if(node.right!=null){
                    System.out.print(node.right.data+" ");
                    Leaf(node.right);
                }
                else if(node.left!=null){
                    System.out.print(node.left.data+" ");
                    Leaf(node.left);
                }
            }

        }
        public static void main(String[] args) {
            Tree T = new Tree();
            T.add(30);
            T.add(19);
            T.add(36);
            T.add(18);
            T.add(25);
            T.add(35);
            T.add(30);
            T.add(24);
            T.add(26);
            T.add(16);
            T.add(24);
            T.add(38);
            T.add(37);

            T.postOrder(root);
            System.out.println("\nsiblings are: ");
            T.Leaf(root);
        }
    
}
