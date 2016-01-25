/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysalumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class MetodosMatriz {
  int[][] notas = new int[3][4];//primeiro tamaño filas=3 e despois columnas=4
    float[] notasMedias = new float[3];
    float[] mediaModulos = new float[4];
    String[] nomes = {"aa", "bb", "cc"};
    String[] modulos = {"progra", "C.D", "B.D", "L.M"};
    // a matriz podese cargar asi---->int [][]notaM={{7,9,5,4},{5,5,5,5},{6,7,8,9,}};

    public void cargarMatriz() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[f].length; c++) {
                notas[f][c] = pedirNota();
            }
        }

    }

    public void amosarMatriz() {

        for (int f = 0; f < notas.length; f++) {

            for (int c = 0; c < notas[f].length; c++) {
                System.out.print("           " + notas[f][c] + "      ");
            }
            System.out.print("\n");
        }

    }

    public int pedirNota() {
        int resultado;
        do {
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));

            if (resultado < 1 || resultado > 10) {
                JOptionPane.showMessageDialog(null, "Introduce la nota correcta");
            }

        } while (resultado < 1 || resultado > 10);

        return resultado;

    }

    public void calcularMediaNotas() {
        float acumulador;
        for (int f = 0; f < notas.length; f++) {
            acumulador = 0;
            for (int c = 0; c < notas[f].length; c++) {
                //notasMedias[f]=;
                acumulador = acumulador + notas[f][c];
            }
            notasMedias[f] = acumulador / notas[f].length;
        }

    }

    public void amosarmediaMatriz() {
        calcularMediaNotas();
        for (int f = 0; f < notas.length; f++) {

            for (int c = 0; c < notas[f].length; c++) {
                System.out.print(notas[f][c] + "    ");
            }

            System.out.println(notasMedias[f] + "\n");
        }
    }

    public void calcularMediaModulos() {

        for (int f = 0; f < notas.length; f++) {

            for (int c = 0; c < notas[f].length; c++) {

                mediaModulos[c] = mediaModulos[c] + notas[f][c];
            }
        }
        for (int c = 0; c < mediaModulos.length; c++) {

            mediaModulos[c] = mediaModulos[c] / notas.length;

            System.out.println(mediaModulos[c]);
        }
    }

    public void amosarTodo() {
        for (int f = 0; f < modulos.length; f++) {

            System.out.print("         " + modulos[f] + "    ");

        }
        System.out.print("\n");
        amosarMatriz();
        amosarNomes();

    }

    public String amosarNomes() {
        String res = "";
        for (int c = 0; c < nomes.length; c++) {
            System.out.print(nomes[c] + "\n");
        }
        return res;

    }
           
            
            
            }
            