/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01_11;

/**
 *
 * @author user
 */
public class Ejercicio01_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Proyeccion de la poblacion");
	System.out.println("Población actual: 312032486");
	System.out.println("Un parto cada 7 segundos.");
        System.out.println("Una muerte cada 13 segundos.");
	System.out.println("Un nuevo inmigrante cada 45 segundos.");
	System.out.println("Fórmula anual de proyección de la población: ");
	System.out.println("Población actual + ((nacimientos por año)");
	System.out.println("                   - (muertes por año)");
	System.out.println("                   + (nuevos inmigrantes por año))");
	System.out.println("                   * año.");
	System.out.println("Proyección del año 1: ");
	System.out.println(312032486 + (((31536000 / 7)
                                                             - (31536000 / 13)
                                                             + (31536000 / 45)) * 1));
	System.out.println("Proyeccion del año 2: ");
	System.out.println(312032486 + (((31536000 / 7)
                                                               - (31536000 / 13)
                                                                + (31536000 / 45)) * 2));
	System.out.println("Proyeccion del año 3: ");
	System.out.println(312032486 + (((31536000 / 7)
								- (31536000 / 13)
								+ (31536000 / 45)) * 3));
	System.out.println("Proyeccion del año 4: ");
	System.out.println(312032486 + (((31536000 / 7)
								- (31536000 / 13)
								+ (31536000 / 45)) * 4));
	System.out.println("Proyeccion del año 5: ");
	System.out.println(312032486 + (((31536000 / 7)
								- (31536000 / 13)
								+ (31536000 / 45)) * 5));
    }
    
}
