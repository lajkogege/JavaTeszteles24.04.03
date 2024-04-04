/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teszt;

import beugrok.Szamolas;

public class TesztSzamolas {
    public static void main(String[] args) {
        TesztSzamolas.tesztEsetek();
    }

    private static void tesztEsetek() {
        osszadas2pozitivTeszt();
        osszeadas1neg1pozTeszt();
        osszeadas1poz1negTeszt();
        //osszeadasKet0lal();
        OsszeadasHatszmjeggyel();
        OsszeadasMaxMinValue();
    }

    private static void osszadas2pozitivTeszt() {
        System.out.println("2 db pozitiv");
        int kapott= Szamolas.osszegzes(1, 2);
        int vart=3;
        
        assert kapott==vart:"NEM jó a teszt"; 
        /*assert nélkül
        if(kapott==vart){
            System.out.println("Jó a teszt");
        }
        else{
            System.out.println("Nem jó a teszt");
        }
        */
    }
    
     private static void osszeadas1neg1pozTeszt() {
        System.out.println("1 db -, 1 db +");
        int kapott= Szamolas.osszegzes(-1, 2);
        int vart=1;
        
        assert kapott==vart:"NEM jó a teszt"; 
        
    }
      private static void osszeadas1poz1negTeszt() {
        System.out.println("1 db +, 1 db -");
        int kapott= Szamolas.osszegzes(1, -2);
        int vart=-1;
        assert kapott==vart:"NEM jó a teszt"; 
        
    }
      /*
      private static void osszeadasKet0lal() {
        System.out.println("1 db 0, 1 db 0");
        int kapott= Szamolas.osszegzes(0, 0);
        int vart=0;
        
        assert kapott==vart:"NEM jó a teszt"; 
        
    }*/
      
       private static void OsszeadasHatszmjeggyel() {
        System.out.println("555555 + 666666");
        int kapott= Szamolas.osszegzes(555555, 666666);
        int vart=1222221;
        
        assert kapott==vart:"NEM jó a teszt"; 
        
    }
       
      private static void OsszeadasMaxMinValue() {
        System.out.println("2147483647 + -2147483647 - 1");
        int kapott= Szamolas.osszegzes(2147483647, -2147483647 - 1);
        int vart=1;
        
        assert kapott==vart:"NEM jó a teszt"; 
        
    }
}

