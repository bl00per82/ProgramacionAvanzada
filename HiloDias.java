/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadolibre;

import javax.swing.JLabel;

/**
 *
 * @author Viveros
 */
public class HiloDias implements Runnable {
    String[] dias= {"lunes","martes","miércoles","jueves", "viernes","sábado","domingo"};
    int dia;
    JLabel edias= new JLabel();
    public HiloDias(JLabel lbldias,int i){
        edias=lbldias;
        dia=i;
    }
    @Override
    public void run(){
        try{
            final String diasemana="Día: "+dias[dia];
            edias.setText (diasemana);
            System.out.print(diasemana);
            Thread.sleep(500);
        }catch (InterruptedException e){ }
    }
}
