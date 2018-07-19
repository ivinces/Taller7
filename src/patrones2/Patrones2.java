/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones2;

import ConPatrones2.Articulo;
import ConPatrones2.Combo;
import ConPatrones2.EsquinaDeAles;
import ConPatrones2.PollosGus;

/**
 *
 * @author Invitado-PC
 */
public class Patrones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Articulo a1 = new Articulo();
       a1.setNombre("Arroz con menestra y pollo");
       Articulo a2 = new Articulo();
       a2.setNombre("Cola Sprite");
       EsquinaDeAles pedido = new EsquinaDeAles();
       pedido.armarCombo(a1, a2);
       PollosGus pedidoGus = new PollosGus();
       pedidoGus.armarCombo(a1, a2);
    }
    
}
