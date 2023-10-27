package REPASOprogramacion.Matrices;

public class Matrices1 {
    private int [][] matrix;   // el primer corchete para filas y el segundo para columnas

    public Matrices1(int f, int c){
        matrix = new int[f][c];
    }


    public void rellenar(){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                matrix [i][j] = (int) (Math.random()*100-10)+10;
            }
        }
    }
    public String mostrar(){
        String s = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                s += matrix[i][j] + " ";

            }
            s += "\n";
        }
        return s;
    }
    public int sumaDiagonal(){
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result += matrix[i][i];

        }
        return result;
    }

    public static void main(String[] args) {
        Matrices1 m = new Matrices1(3,3);
        m.rellenar();
        System.out.println(m.mostrar());
        System.out.println(m.sumaDiagonal());
    }
}
