import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;

public class KdTreeST<Value> {
   int n;

   private class Node {
      private Point2D p;      // the point
      private Value value;    // the symbol table maps the point to this value
      private RectHV rect;    // the axis-aligned rectangle corresponding to this node
      private Node lb;        // the left/bottom subtree
      private Node rt;        // the right/top subtree
}

   // construct an empty symbol table of points
   public KdTreeST() {

   }

   // is the symbol table empty?  
   public boolean isEmpty() {

   }

   // number of points
   public int size() {
      return n;
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

   //Return the k points that are closest to the query point (in any order);
   //return all N points in the data structure if N ≤ k.
   public Iterable<Point2D> nearest(Point2D p, int k) {

   }
}
