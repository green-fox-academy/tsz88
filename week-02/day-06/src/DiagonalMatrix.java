import java.util.Arrays;

public class DiagonalMatrix {
  public static void main(String[] args){
    int matrix[][]= new int[4][4];

    for (int i=0;i<4;i++){
      for (int j=0;j<4;j++){
        if(i==j){
          matrix[i][j]=1;
        } else {
          matrix[i][j]=0;
        }
      }
    }
    for (int i=0;i<4;i++){
      System.out.println(Arrays.toString(matrix[i]));
    };

  }
}
