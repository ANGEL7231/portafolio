package datos.practicos.ejercicio1;

public class AuditoriaLogistica {

    public static void main(String[] args) {
        
        // --- FASE 1 ---
        // X = 4
        int[] temperaturas = {12, -3, 4, 8, -1, 4, 15, 2};
        double suma = 0;
        int pos = 0;

        System.out.print("Posiciones bajo cero: ");
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 0) {
                System.out.print(i + " ");
            }
            if (temperaturas[i] > 0) {
                suma += temperaturas[i];
                pos++;
            }
        }
        System.out.println();
        System.out.println("Promedio positivos: " + (suma / pos));

        /*
         * Tarea 1.2:
         * 1. No cambia de tamaño porque cuando se crea en Java se le asigna un bloque fijo de memoria.
         *    No se puede estirar porque podrias encimarte en otra memoria que ya este ocupada.
         * 2. Si entras a temperaturas[8] te marca error java.lang.ArrayIndexOutOfBoundsException 
         *    porque el arreglo llega hasta la posicion 7 (son 8 elementos contando desde el 0).
         */


        // --- FASE 2 ---
        // 4 + 5 = 9
        int[][] inventario = {
            {10, 20, 15, 5},
            {8, 9, 12, 30},
            {25, 14, 0, 18},
            {2, 9, 11, 40}
        };

        for (int i = 0; i < inventario.length; i++) {
            int total = 0;
            for (int j = 0; j < inventario[i].length; j++) {
                total += inventario[i][j];
            }
            System.out.println("Sucursal " + i + ": " + total);
        }

        System.out.print("Diagonal: ");
        for (int i = 0; i < inventario.length; i++) {
            System.out.print(inventario[i][i] + " ");
        }
        System.out.println();

        /*
         * Tarea 2.2:
         * Una matriz regular tiene el mismo numero de columnas en cada fila (por ejemplo 4x4).
         * Un arreglo dentado es cuando cada fila puede tener diferente tamaño, unas filas mas largas que otras.
         */


        // --- FASE 3 ---
        int[][][] ocupacion = new int[2][3][3];

        // Llenar
        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                for (int pa = 0; pa < 3; pa++) {
                    ocupacion[e][p][pa] = e + p + pa + 4;
                }
            }
        }

        // Imprimir pares [e][p][p]
        for (int e = 0; e < 2; e++) {
            for (int p = 0; p < 3; p++) {
                int val = ocupacion[e][p][p];
                if (val % 2 == 0) {
                    System.out.println("Coordenada [" + e + "][" + p + "][" + p + "] = " + val);
                }
            }
        }

        /*
         * Tarea 3.3:
         * Si crece a 100x50x50 son 250,000 espacios y si estan vacios se gasta mucha RAM sin usar.
         * Aparte es muy confuso saber qué significa cada numero en matriz[99][49][49].
         * Con POO es mejor porque usas objetos como Edificio o Piso y listas que solo ocupan lo que necesitas.
         */
    }
}