public class App {
    public static void main(String[] args) throws Exception {
        


        int ika = 20;


    if (ika > 0 && ika < 18) {
        System.out.println("Olet alaikäinen");

     } else if (ika == 15) {
         System.out.println("Olet alaikäinen");
         System.out.println("Saat ajaa mopoa");

     }
     else if (ika >= 16 && ika <= 17) 
     {
        System.out.println("Voit ajaa kevaria");
     }

     else if (ika  == 18) {
        System.out.println("Olet täysi-ikäinen, voit ajaa autoa");
     }
     else if (ika > 58) {
        System.out.println("Olet aikuinen");
        System.out.println("Voit mennä varhaiseläkkeelle");

     }
     else if (ika >= 65) {
        System.out.println("Olet eläkeläinen");


     }
     else if (ika == 65) {
        System.out.println("Hyvä eläkepäiviä");
    }
     else if (ika >= 40 && ika <=50) {
        System.out.println("Hyvää keski-ikää");

     }
      else { 
        System.out.println("Olet aikuinen");
     }
 
    

    }
}
