import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int opcion;
        do{
            opcion = menu();
            switch (opcion){
                case 1:
                    ejemplo1();
                    break;

                case 2:
                    ejemplo2();
                    break;

                case 0:
                    Consola.escribir("Gracias por su visita 👋");
                    break;
                default:
                    Consola.escribir("Opción incorrecta!");
            }
        } while (opcion!=0);


    }

    public static int menu (){

        Consola.escribir("1. Acierte el nro entero");
        Consola.escribir("2. Pruebas Math");
        Consola.escribir("Elige una opción 👆 o 0 para salir!");
        int opcion = Consola.leerInt("Qué opción? 😁\n");
        return opcion;
    }

    ///region Ejemplo1
    /* Crea un programa que genere un número aleatorio entre 1 y 100 y le pida al
        usuario que adivine el número. El programa debe indicar si el número del
        usuario es mayor o menor que el número generado y seguir pidiendo al
        usuario que adivine hasta que acierte. El usuario tiene oportunidades
        limitadas (a libre elección).*/
    public static void ejemplo1 (){
        /*double aleatorio = Math.random()*100; /// entre 1 y 100 real
        aleatorio = Math.ceil(aleatorio); /// lo redondea para arriba-
        Consola.escribir(aleatorio);
        */
        /// un random entre 0 y 100
        Random auxRandom = new Random();
        double aleatorio = auxRandom.nextInt(100);
        Consola.escribir(aleatorio);

        double nroUsuario;
        boolean acerto = false;
        do {
            nroUsuario = Consola.leerInt("Ingrese un nro entero entre 1 y 100");
            if (aleatorio == nroUsuario) {
                acerto = true;
                Consola.escribir("Felicidades acerto 🥳");
            } else {
                Consola.escribir("Lo siento, intente de nuevo 💪");
            }
        } while (!acerto);
        Consola.escribir("\n\nFIN DEL JUEVO. Volvemos al menú principal!!\n\n");
        Consola.leerString("Precione ENTER tecla para continuar....");
    }
    ///endregion

    ///region Ejemplo2
    /*Algunos Metodos Math con menú*/

    public static void ejemplo2 (){

        int opcion, nro;
        float nro1, nro2;
        DecimalFormat df = new DecimalFormat("#.##");
        do{
            opcion = menuMetodosMath();
            switch (opcion){
                case 1:
                    nro = Consola.leerInt("Ingrese un nro entero para saber su valor absoluto");
                    Consola.escribir(Math.abs(nro));
                    Consola.escribir("El mismo método puede tener otros tipo de parámetros.");
                    break;

                case 2:
                    nro1 = Consola.leerFloat("Ingrese un nro");
                    nro2 = Consola.leerFloat("Ingrese otro nro");
                    Consola.escribir("El mayor de los nros es: " + Math.max(nro1, nro2));
                    break;

                case 3:
                    nro1 = Consola.leerFloat("Ingrese un nro");
                    nro2 = Consola.leerFloat("Ingrese otro nro");
                    Consola.escribir("El menor de los nros es: " + Math.min(nro1, nro2));
                    break;

                case 4:
                    nro1 = Consola.leerFloat("Ingrese un nro");
                    Consola.escribir("El nro entero mayor más cercano es: " + Math.ceil(nro1));
                    break;

                case 5:
                    nro1 = Consola.leerFloat("Ingrese un nro");
                    Consola.escribir("El nro entero menor más cercano es: " + Math.floor(nro1));
                    break;

                case 6:
                    nro1 = Consola.leerFloat("Ingrese un nro");
                    Consola.escribir("Redonde en: " + Math.round(nro1));
                    break;

                case 7:
                    Consola.escribir("Un nro aleatorio: " + df.format(Math.random()));
                    break;

                case 8:
                    nro = Consola.leerInt("Ingrese hasta que nro x puede ir el entero aletorio. (nro<x)");
                    Random aleatorio = new Random();
                    Consola.escribir("El nro " + aleatorio.nextInt(nro) + "<" + nro);
                    break;

                case 9:
                    Consola.escribir("Se mostrará un nro Real w / x<w<y");
                    nro1 = Consola.leerFloat("Ingrese x: ");
                    nro2 = Consola.leerFloat("Ingrese y: ");
                    Random aleatorio2 = new Random();
                    Float nroW = (nro1 + aleatorio2.nextFloat(nro2-nro1));
                    Consola.escribir("Salió el nro w = " + df.format(nroW) + ",  y resulta que "
                            + nro1 + "<" + df.format(nroW) + "<" + nro2);
                    break;

                case 0:
                    Consola.escribir("Gracias por su visita 👋");
                    break;

                default:
                    Consola.escribir("Opción incorrecta!");
            }
            Consola.leerString("Precione cualquier ENTER para continuar....");
        } while (opcion!=0);


    }

    public static int menuMetodosMath (){

        Consola.escribir("1. Valor absoluto");
        Consola.escribir("2. Max entre dos números");
        Consola.escribir("3. Min entre dos números");
        Consola.escribir("4. Retorna el entero mayor más cercano");
        Consola.escribir("5. Retorna el entero menor más cercano");
        Consola.escribir("6. Redondea a entero");
        Consola.escribir("7. Aleatorio entre 0 y 1");
        Consola.escribir("8. Aleatorio Entero usando clase Random y hasta...");
        Consola.escribir("9. Aleatorio Real usando clase Random y, entre x e y");
        Consola.escribir("Elige una opción 👆 o 0 para salir!");
        int opcion = Consola.leerInt("Qué opción? 😁\n");
        return opcion;
    }
    ///endregion



}