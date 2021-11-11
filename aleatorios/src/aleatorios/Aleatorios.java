
package aleatorios;

public class Aleatorios {
    public static void main(String[] args) {
      int[] n= new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i]= (int)(Math.random()*10);
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
    
}
