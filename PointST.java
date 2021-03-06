import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.RedBlackBST;

public class PointST<Value> {
   int n;
   private Node root;

   // BST helper node data type
   private class Node {
      private Point2D key;           // key
      private Value val;         // associated data
      private Node left, right;  // links to left and right subtrees
      private boolean color;     // color of parent link
      private int size;          // subtree count

      public Node(Point2D key, Value val, boolean color, int size) {
         this.key = key;
         this.val = val;
         this.color = color;
         this.size = size;
        }
    }

   // construct an empty symbol table of points
   public PointST() {
      RedBlackBST();
   }

   // is the symbol table empty?  
   public boolean isEmpty() {
      return isEmpty();
   }

   // number of points
   public int size() {
      return size();
   }
   
   // associate the value val with point p
   public void put(Point2D p, Value val) {

   }
   
   // value associated with point p
   public Value get(Point2D p) {
      
   } 
   
   // does the symbol table contain point p?
   public boolean contains(Point2D p) {

   }
   
   // all points in the symbol table
   public Iterable<Point2D> points() {

   }
   
   // all points that are inside the rectangle
   public Iterable<Point2D> range(RectHV rect) {

   } 
   
   // a nearest neighbor to point p; null if the symbol table is empty
   public Point2D nearest(Point2D p) {

   } 
   
   // unit testing (required)
   public static void main(String[] args) {

   }
}
