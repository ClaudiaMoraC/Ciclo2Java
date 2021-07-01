//Ciclo do While
//En este ciclo primero se van a ejecutar las
//instrucciones al menos una vez
//y despues de eso se va a comprobar si la consicion
//es verdadera
//Entra la menos una vez 
//Se pueden utilizar en la creacion de menus por que este menu se 
//debera mostrar al menos una sola vez

// do{

//     instrucciones;
// }while(condicion);

public class CicloDoWhile {
    public static void main(String[] args) {

        int i = 11;// 11

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
