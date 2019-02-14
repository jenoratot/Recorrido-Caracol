
package recorridocaracol;

 
 import java.io.File; 
 import java.io.FileNotFoundException; 
 import java.util.Scanner; 
 import java.util.logging.Level; 
 import java.util.logging.Logger; 


 public class RecorridoCaracol { 
 public static void main(String[] args) 
     {     
     String sel = null; 
     File file = new File("C:\\Users\\hpacac\\Desktop\\POO\\Matriz1.txt"); 
     int a=0,b=0; 
     String array=" "; 
     String[][] leer; 
        
         try { 
             Scanner sc = new Scanner(file); 
             sel = sc.nextLine(); 
             while (sc.hasNextLine()) {                 
                 
                 sel=sel + " " + sc.nextLine(); 
                 a++; 
             } 
         } catch (FileNotFoundException ex) { 
             Logger.getLogger(RecorridoCaracol.class.getName()).log(Level.SEVERE, null, ex); 
         } 
             String part[]=sel.split(" "); 
             leer = new String[a+1][a+1]; 
              
             for (int i = 0; i <= a; i++) { 
                 for (int j = 0; j <= a; j++) { 
                     leer[i][j] = part[b]; 
                     array+=leer[i][j]+" "; 
                     b++; 
                 } 
                 array+="\n"; 
         } 
             Matriz o = new Matriz(a+1,leer); 
             o.CargarMatriz(); 
             for(int i=0;i<=a;i++){     
             o.Lineabien(); 
             o.ColumnaAbajo(); 
             o.InversaFila(); 
             o.ArribaColumna(); 
             i++; 
            
         } 
           
     } 
 } 
