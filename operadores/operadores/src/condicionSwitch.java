import javax.swing.JOptionPane;

//Switch son condicionales multiples

// switch(dato){ Este dato va a tener diferentes casos 

//     case 1:instruccion1;
//           break;

//     case 2:instruccion2;
//           break;  
//     ...
//     case n:instruccionN;
//           break;
//     default: CasoContrario;
//           break;        

// }

public class condicionSwitch {
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5:"));

        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "Es el numero 1 ");
                break;// Salimos del switch en caso de que ya se haya cumplido una condicion

            case 2:
                JOptionPane.showMessageDialog(null, "Es el numero 2 ");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Es el numero 3 ");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Es el numero 4 ");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Es el numero 5 ");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El numero no esta en el rango de inicio ");
                break;// Es opcional pero es recomendable
        }

    }
}
