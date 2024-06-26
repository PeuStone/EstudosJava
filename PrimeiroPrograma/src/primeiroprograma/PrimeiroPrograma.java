/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprograma;

import java.awt.Toolkit;



/**
 *
 * @author pedro
 */
public class PrimeiroPrograma {

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int width = toolkit.getScreenSize().width;
        int height = toolkit.getScreenSize().height;
        System.out.println("Sua resolução é:" + width + "x" + height);
    }
    
}
