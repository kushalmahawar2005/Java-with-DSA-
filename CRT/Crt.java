
import java.util.*;


public class Crt {

    public static float getSortestPath(String path) {
        int x = 0, y = 0; 
        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            //South 
            if(dir == 'S') {
                y--;
            }
            else if (dir == 'N') {
                y++;
            } 
            else if (dir == 'W') {
                x--;
            } 
            else if (dir == 'E') {
                x++;
            }
        }
            int x2 = (x*x);
            int y2 = (y * y);
            
            return (float)Math.sqrt(x2 + y2);
    }

    public static void unit() {
       
    int no = 321;
    int result = 0;

    if (no <= 100) {
        result = no * 2;
    } else if (no <= 200) {
        result = (100 * 2) + (no - 100) * 3;
    } else if (no <= 300) {
        result = (100 * 2) + (100 * 3) + (no - 200) * 4;
    } else {
        result = (100 * 2) + (100 * 3) + (100 * 4) + (no - 300) * 5;
    }

    System.out.println(result);
}

  

    
     public static void main(String args[]) {
    //    String path = "SNEESSWSWWNNS";
    //    System.out.println(getSortestPath(path));
        
       unit();
    }
}
