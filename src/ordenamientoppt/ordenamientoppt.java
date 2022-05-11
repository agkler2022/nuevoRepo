package ordenamientoppt;

public class ordenamientoppt {

	public static void main(String[] args){
		//ORDEN DESCENDENTE NUM
//			final int TOPE =5;
//	         int i=0,j=0,auxiliar=0;
//	         int vector[] ={ 11, 8, 33, 14, 5};	
//	
//	         for(i=1;i<=TOPE;i++){
//					for (j = 0; j < TOPE - 1; j++) {
//						if (vector[j] < vector[j + 1]) { // si v[j] > v[j+1] intercambio
//							auxiliar = vector[j + 1];
//							vector[j + 1] = vector[j];
//							vector[j] = auxiliar;
//						}
//					}
//				}
//	         for (int k = 0; k < vector.length; k++) {
//	             System.out.print(vector[k]+"-");
//			}

		
//		String nombres [] = { "Juan", "Ana", "Eze","Ova"};
//		for (int i = 0; i < nombres.length; i++) {
//			for (int j = 0; j < nombres.length-1; j++) {
//				if(nombres[])
//				
//			}		
//		}
		
		
		//ORDEN ASCENDENTE STRING PRIMER LETRA
//		String nombres [] = { "Juan", "Ana", "Eze","Ova"};
//        
//        String aux;
//
//        for (int i=0;i<nombres.length;i++) {
//            for(int j=0;j<nombres.length-1;j++) {
//                if(nombres[j].charAt(0)>nombres[j+1].charAt(0)) {
//                    aux=nombres[j];
//                    nombres[j]=nombres[j+1];
//                    nombres[j+1]=aux;            
//                }
//            }
//        }
//            
//        
//        System.out.print("Orden Ascendente: ");
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.print(nombres[i] + "-");
//        }
		
		
		//ORDEN ASCENDENTE STRING COMPARE.TO
		String valor;
        String []nombres = {"juan","ana", "eze", "ale", "Adalberto"};
        for (int i = 1; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length-1; j++) {
                if (nombres[j].compareTo(nombres[j+1])>0) {
                    valor = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = valor;
                }
            }
        }
        System.out.print("Orden Ascendente: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i]+"-");
        }
		
		
		}
}