/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.entidades;

/**
 *
 * @author indira
 */
public class UniversidadUCI {

//    static File universidadLocation = new File("universidad.uci");
    Universidad universidad;

    private UniversidadUCI() {
        universidad = new Universidad();
    }

    public static Universidad getInstanceClone() {
        return (Universidad) UniversidadUCIHolder.INSTANCE.getUniversidad().clone();
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    private static class UniversidadUCIHolder {

        private static final UniversidadUCI INSTANCE = new UniversidadUCI();
//        public UniversidadUCIHolder() {
//            try {
//                INSTANCE = (UniversidadUCI) new ObjectInputStream(new BufferedInputStream(new FileInputStream(universidadLocation))).readObject();
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(UniversidadUCI.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(UniversidadUCI.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(UniversidadUCI.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }

    @Override
    public String toString() {
        return "Universidad"; //To change body of generated methods, choose Tools | Templates.
    }
}
