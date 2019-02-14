
package recorridocaracol;

 public class Matriz { 
     private int n;
     private String matriz[][];
     private String numeros[]; 
     private int limites;
     private int m=0;
     private int i=0;
     private int j=0;
     private int filas=0;
     private int columnas=0;
     private int ejecucionesLiBi=0;
     private int ejecucionesCol=0;
     private String arraylist=" "; 
     private int h=0;
      
     public Matriz(int tamaño, String[][] string){  
         this.n=tamaño;
         this.matriz=string;
         this.numeros=new String[n*n];
         this.limites=n; 
     } 
     public void CargarMatriz(){
         for(i=0;i<n;i++){ 
             for(j=0;j<n;j++){ 
                 numeros[m]=matriz[i][j];
                 m++;     
             } 
         } 
         m=0; 
     } 
     public void Lineabien(){
         if(ejecucionesLiBi==0){
             m=n*ejecucionesLiBi; 
         } 
         else{ 
             m=n*ejecucionesLiBi;
             m+=ejecucionesLiBi;
              
         } 
         for(h=0;h<limites;h++){
             arraylist+=numeros[m]+" "; 
             m++; 
         } 
         m--;
         ejecucionesLiBi++;
     } 
      
     public void ColumnaAbajo(){
         m+=n;
         for(h=limites;h<limites*limites;h+=limites){
             arraylist+=numeros[m]+" "; 
             m+=n; 
         } 
         limites--;
         m-=n;
     } 
      
     public void InversaFila(){
        filas=limites;
         while(filas>0){
             arraylist+=numeros[m]+" "; 
             m--; 
          filas--; 
         } 
         m++;
          
     } 
     public void ArribaColumna(){ 
         m-=n;
         limites--;
       columnas=limites;
         while(columnas>0){
             arraylist+=numeros[m]+" "; 
             m-=n; 
             columnas--; 
         } 
        m+=n; 
     } 
      
     public String getarray(){ 
         return arraylist; 
     } 
 } 
