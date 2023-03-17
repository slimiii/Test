import javax.swing.JFrame;
import javax.swing.JButton;

public class Window {

   public static void main(String[] args) {

      // Erstelle ein neues JFrame-Objekt
      JFrame meinFenster = new JFrame("Menu");

      // Setze die Größe des Fensters
      meinFenster.setSize(500, 500);

      JButton theButton = new JButton("Button Test");

      meinFenster.add(theButton);
      // Setze die Position des Fensters auf dem Bildschirm
      meinFenster.setLocationRelativeTo(null);

      // Beende das Programm, wenn das Fenster geschlossen wird
      meinFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Zeige das Fenster an
      meinFenster.setVisible(true);
   }
}
