/* Este codigo ha sido generado por el modulo psexport 20180802-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJEMPLO_SUPER_CON_MAS_DE_UN_ARTICULOS_TIPOSS_A_COBRAR_CON_DOS_CANTIDADES_Y_CON_MONTO_A_ESCOGER.java."

import java.io.*;

public class ejemplo_super_con_mas_de_un_articulos_tiposs_a_cobrar_con_dos_cantidades_y_con_monto_a_escoger {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String articulo;
		String articulo2;
		String articulo3;
		String articulo4;
		String articulo5;
		int cantidad;
		int cantidad2;
		int monto;
		int n;
		int s;
		int t;
		double total;
		double total2;
		int u;
		int v;
		int w;
		System.out.println(" Hola Buenos dias bienvenido al Super");
		System.out.println(" Por favor ingrese un articulo a cobrar");
		System.out.println("1 = Camisa Tipo S $196");
		System.out.println("2 = Sueter Tipo MS $250");
		System.out.println("3 = Bluson Tipo Jl $50");
		System.out.println("4 = Zapatos Tipo ss $196");
		System.out.println(" 5 = Si son mas de dos articulos");
		n = Integer.parseInt(bufEntrada.readLine());
		if (n>0 && n<6) {
			System.out.println(" Ingresa la cantidad del articulo");
			cantidad = Integer.parseInt(bufEntrada.readLine());
			System.out.println("Ingrese el monto a cobrar $");
			monto = Integer.parseInt(bufEntrada.readLine());
			if (n==1) {
				articulo = " Camisa Tipo S";
				total = cantidad*100-monto;
			} else {
				if (n==2) {
					articulo = " Sueter Tipo MS";
					total = cantidad*250-monto;
				} else {
					if (n==3) {
						articulo = " Bluson Tipo JL";
						total = cantidad*50-monto;
					} else {
						if (n==4) {
							articulo = " Zapatos Tipo ss";
							total = cantidad*250-monto;
						} else {
							if (n==5) {
								System.out.println(" Hola de nuevo cual es el primer articulo a cobrar?");
								System.out.println("1 = Camisa Tipo S $196");
								System.out.println("2 = Sueter Tipo MS $250");
								System.out.println("3 = Bluson Tipo Jl $50");
								System.out.println("4 = Zapatos Tipo ss $196");
								s = Integer.parseInt(bufEntrada.readLine());
								if (s>0 && s<2) {
									if (s==1) {
										System.out.println("Por favor ingresa la segunda cantidad del articulo");
										cantidad2 = Integer.parseInt(bufEntrada.readLine());
										System.out.println(" Y cual  es el segundo articulo a cobrar?");
										System.out.println("2 = Camisa Tipo S $196");
										System.out.println("3 = Sueter Tipo MS $250");
										System.out.println("4 = Bluson Tipo Jl $50");
										System.out.println("5 = Zapatos Tipo ss $196");
										if (s==1) {
											t = Integer.parseInt(bufEntrada.readLine());
											if (t>0 && t<6) {
												if (t==2) {
													articulo2 = " Camisa Tipo S";
													total = cantidad*100+cantidad2*100-monto;
												} else {
													if (t==3) {
														articulo2 = " Sueter Tipo MS";
														total = cantidad*250+cantidad2*100-monto;
													} else {
														if (t==4) {
															articulo2 = " Bluson Tipo JL";
															total = cantidad*50+cantidad2*100-monto;
														} else {
															if (t==5) {
																articulo2 = " Zapatos Tipo ss";
																total = cantidad*196+cantidad2*196-monto;
															}
														}
													}
												}
											}
											System.out.println(" Articulo comprado S "+articulo2+"cantidad"+cantidad);
											System.out.println(" Tenga buen dia aqui esta su cambio gracias ;) : $"+total);
											System.out.println(" Dueño de la maquina Gonzalez Piñon Oscar Zair N.L!/");
											System.out.println(" Con pantente de creacion de EXPLOSIV017");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (n>0 && n<5) {
			System.out.println(" Articulo comprado"+articulo+"cantidad"+cantidad);
			System.out.println(" Tenga buen dia aqui esta su cambio gracias ;) : $"+total);
		} else {
			System.out.println("Ingresa el producto nuevamente por favor");
		}
	}


}

