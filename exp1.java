/**
 * @(#)exp1.java
 *
 *
 * @author Sérgio Roriz
 * @version 1.00 2020/9/15
 *
 *	O array eventos contém dados de contagem.
 *  Cada contagem foi executada durante um minuto.
 *  Portanto a taxa de cada contagem é NUMERICAMENTE igual à contagem.
 *
 *
 */


public class exp1 {

    public exp1() {
    }
    
    private static int[] evento = {185,195,184,175,165,190,170,223,187,179,166,209,170,214,171,190,186,192,209,211,181,211,223,219,182,163,189,199,196,183,194,221,220,219,219,169,227,172,183,163,229,181,168,166,219,220,172,174,194,215,211,226,200,203,218,207,221,212,164,202,220,177,198,217,224,160,200,191,162,204,208,162,190,191,181,187,168,186,220,177,186,223,165,183,183,228,230,222,185,189,218,194,173,173,182,229,169,177,226,191};
    private static int[] erro = {14,14,14,13,13,14,13,15,14,13,13,14,13,15,13,14,14,14,14,15,13,15,15,15,13,13,14,14,14,14,14,15,15,15,15,13,15,13,14,13,15,13,13,13,15,15,13,13,14,15,15,15,14,14,15,14,15,15,13,14,15,13,14,15,15,13,14,14,13,14,14,13,14,14,13,14,13,14,15,13,14,15,13,14,14,15,15,15,14,14,15,14,13,13,13,15,13,13,15,14};
    
    public static void main(String[] args) {
    	media(100);
    	media(81);
    	quiquadrado81();
    	desvioP(100);
    	mediaDesvios(100);
    	contaIntervalos();
    }
    
    public static double media(int n) {
    	double soma = 0d;
    	double media = 0d;
    	if (n > evento.length) {
    		System.out.println("Parâmetro maior que o número de dados. A média será calculada para todos os " + evento.length + " dados.");
    		n = evento.length;
    	}
    	for (int i = 0; i < n; i++) {
    		soma = soma + evento[i];
    	}
    	media = soma / n;
    	System.out.println("A média dos " + n + " primeiros eventos é: " + media);
    	return media;
    }
    
    public static void quiquadrado81() {
    	double soma = 0d;
    	double numerador = 0d;
    	double media = 194;
    	for (int i = 0; i < 81; i++) {
    		numerador = ((double) evento[i]) - media;
    		numerador = numerador*numerador;
    		soma = soma + (numerador / media);    		
    	}
    	System.out.println("O qui quadrado \"81\" é: " + soma);
    }
    
    public static void desvioP(int n) {
    	double soma = 0d;
    	double numerador = 0d;
    	double media = media(n);
    	for (int i = 0; i < n; i++) {
    		numerador = ((double) evento[i]) - media;
    		numerador = numerador*numerador;
    		soma = soma + numerador;    		
    	}
    	double desvio = soma / (n - 1);
    	desvio = Math.sqrt(desvio);
    	System.out.println("O desvio padrão dos " + n + " primeiros eventos é: " + desvio);
    }
    
    public static void mediaDesvios(int n) {
    	double soma = 0d;
    	double numerador = 0d;
    	double media = media(n);
    	for (int i = 0; i < n; i++) {
    		numerador = ((double) evento[i]) - media;
    		soma = soma + Math.abs(numerador);
    	}
    	double mediaDesvio = soma / n;
    	System.out.println("A média dos desvios dos " + n + " primeiros eventos é: " + mediaDesvio);
    }
    
    public static void contaIntervalos() {
    	float intv1 = 0f;
    	float intv2 = 0f;
    	float intv3 = 0f;
    	float intv4 = 0f;
    	for (int i = 0; i < evento.length; i++) {
    		if (evento[i] < 181) {
    			intv1 = intv1 + 1f;
    		} else {
    			if (evento[i] == 181) {
    				intv1 = intv1 + 0.5f;
    				intv2 = intv2 + 0.5f;
    			} else {
    				if (evento[i] > 181 && evento[i] < 195) {
    					intv2 = intv2 + 1f;
    				} else {
    					if (evento[i] == 195) {
    						intv2 = intv2 + 0.5f;
    						intv3 = intv3 + 0.5f;
    					} else {
    						if (evento[i] > 195 && evento[i] < 209) {
    							intv3 = intv3 + 1f;
    						} else {
    							if (evento[i] == 209) {
    								intv3 = intv3 + 0.5f;
    								intv4 = intv4 + 0.5f;
    							} else {
    								if (evento[i] > 209) {
    									intv4 = intv4 + 1;
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	System.out.println("Intervalo 1: " + intv1);
    	System.out.println("Intervalo 2: " + intv2);
    	System.out.println("Intervalo 3: " + intv3);
    	System.out.println("Intervalo 4: " + intv4);
    }
    
}