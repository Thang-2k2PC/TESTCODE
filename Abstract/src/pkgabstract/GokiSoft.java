package pkgabstract;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class GokiSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<iRunning> sc = new ArrayList<>();
        
        sc.add(new Student());
        sc.add(new Student());
        sc.add(new Animal());
        sc.add(new Animal());
        sc.add(new Animal());
        for (int i = 0; i < sc.size(); i++) {
            sc.get(i).running();
        }
        
    }
    
}
