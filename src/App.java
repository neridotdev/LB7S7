

public class App {

   
    public static void main(String[] args) {
        int A[] = {24, 39, 19, 36, 22, 57, 91, 16, 73, 45};
//                  0   1   2   3   4   5   6   7   8   9
        Ejercicio1(A);
        Ejercicio2(A);
        Ejercicio3(A);
        Ejercicio4(A);
        Ejercicio5(A);
        Ejercicio6(A);
        Ejercicio7(A);
        Ejercicio8(A);
        Ejercicio9(A);
        Ejercicio10(A);
        Ejercicio11(A);
        Ejercicio12(A);
        Ejercicio28();

        int s = 0;
        for(int k=1; k<=100; k++){
            s=s+k;

        }
        System.out.println("La suma de 1 a 100: " + s);
    }

    public static void ImprimeArreglo(int X[]){
        int n = X.length;
        for(int k=0; k<=n-1; k++){
            System.out.println(X[k]+"\t");

        }//Fin del ciclo for

    }//Fin del metodo ImprimeArreglo

    public static void EscribeLinea(){
        String Linea = "========================";
        Linea =  Linea+Linea+Linea;
        System.out.println(Linea);
    }//Fin del metodo EscribeLinea

    public static void Ejercicio1(int M[]){
        System.out.println("****** Ejercicio 1 ******");
        System.out.println("1. Imprima los numeros del arreglo.");
        ImprimeArreglo(M);
        EscribeLinea();
         }//Fin del metodo Ejercicio1

    public static void Ejercicio2(int R[]){
        System.out.println("****** Ejercicio 2 ******");
        System.out.println("2. Suma de los numeros pares del arreglo.");
        int s=0;
        int n=R.length;
        for(int k=0; k<=n-1; k++){
            s = s + R[k];

        }//Fin del for
        System.out.println("La suma es: " + s);
            EscribeLinea();

    }//Fin del metodo Ejercicio2

    public static void Ejercicio3(int X[]){
        System.out.println("****** Ejercicio 3 ******");
        System.out.println("3. Imprima los numeros pares del arreglo.");
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2==0){
            System.out.println(X[k]+ "\t");
           }//Fin del if

        }//Fin del metodo for
        System.out.println("");
        EscribeLinea();
    }//Fin del metodo Ejercicio3

    public static void Ejercicio4(int X[]){
        System.out.println("****** Ejercicio 4 ******");
        System.out.println("4. Imprima los numeros impares del arreglo.");
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2!=0){
            System.out.println(X[k]+ "\t");
           }//Fin del if

        }//Fin del metodo for
        System.out.println("");
        EscribeLinea();
    }//Fin del metodo Ejercicio3

    public static void Ejercicio5(int X[]){
        System.out.println("****** Ejercicio 5 ******");
        System.out.println("5. Cuente los numeros pares del arreglo.");
        int c=0;//contador
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2==0){
                c=c+1;
           }//Fin del if
        }//Fin del metodo for
        System.out.println("La cantidad de pares es: " + c);
        EscribeLinea();
    }//Fin del metodo Ejercicio5

    public static void Ejercicio6(int X[]){
        System.out.println("****** Ejercicio 6 ******");
        System.out.println("6. Cuente los numeros impares del arreglo.");
        int c=0;//contador
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2!=0){
                c=c+1;
           }//Fin del if
        }//Fin del metodo for
        System.out.println("La cantidad de impares es: " + c);
        EscribeLinea();
    }//Fin del metodo Ejercicio6

    public static void Ejercicio7(int X[]){
        System.out.println("****** Ejercicio 7 ******");
        System.out.println("7. Suma de los numeros pares del arreglo.");
        int s=0;//sumador
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2==0){
                s=s+X[k];
           }//Fin del if
        }//Fin del metodo for
        System.out.println("La suma de los pares es: " + s);
        EscribeLinea();
    }//Fin del metodo Ejercicio7

    public static void Ejercicio8(int X[]){
        System.out.println("****** Ejercicio 8 ******");
        System.out.println("8. Suma de los numeros impares del arreglo.");
        int s=0;//sumador
        int n=X.length;
        for(int k=0; k<=n-1; k++){
           if(X[k]%2!=0){
                s=s+X[k];
           }//Fin del if
        }//Fin del metodo for
        System.out.println("La suma de los impares es: " + s);
        EscribeLinea();
    }//Fin del metodo Ejercicio8

    public static void Ejercicio9(int X[]){
        System.out.println("****** Ejercicio 9 ******");
        System.out.println("9. Imprima los numeros del arreglo en forma inversa.");
        int y = 0;
        int n=X.length;
        for(int k=0; k<=n-1; k++){
            y = n-1-k;
            System.out.println(X[y]+"\t");
        }//Fin del metodo for
        EscribeLinea();
    }//Fin del metodo Ejercicio9

    public static void Ejercicio10(int X[]){
        System.out.println("****** Ejercicio 10 ******");
        System.out.println("10. Imprima los numeros divisibles de 3.");
        
        for(int i=0 ; i< X.length ;i++){
            if(X[i] % 3 == 0){
                System.out.println(X[i] + "\t");
            }
        }



    }//Fin del metodo Ejercicio10

    public static void Ejercicio11(int X[]){
        System.out.println("****** Ejercicio 11 ******");
        System.out.println("11. Cuente los numeros divisibles de 3.");
        int cont = 0;
        for(int i=0 ; i< X.length ;i++){
            if(X[i] % 3 == 0){
                cont++;
            }
        }
        
        System.out.println("La cantidad de elementos divisibles entre 3 en el arreglo es: "+cont);

    }//Fin del metodo Ejercicio11

    public static void Ejercicio12(int X[]){
        System.out.println("****** Ejercicio 12 ******");
        System.out.println("12. Sume los numeros divisibles de 3.");

        int sum = 0;

        for(int i=0 ; i< X.length ;i++){
            if(X[i] % 3 == 0){

                sum+=X[i];

            }
        }

        System.out.println("La suma de los numeros divisibles entre 3 del arreglo es: "+sum);

    }//Fin del metodo Ejercicio12


    public static void Ejercicio28(){

        System.out.println("****** Ejercicio 28 *******");
        System.out.println("a) En cuanto tiempo llegara un automovil"+ 
        " de Tegucigalpa a San Pedro Sula a una velocidad de 80km/h?");
        double v = 80/60.0; //v=1.333333 km/min
        double d = 0;
        for(int t=0; t<=250; t++){
            d = d + v;
            System.out.println(t+"\t"+d);
        }//Fin del ciclo t
        System.out.println("");
        EscribeLinea();
    }//Fin del metodo Ejercicio28


}//Fin de la clase GuiaArreglos1255
