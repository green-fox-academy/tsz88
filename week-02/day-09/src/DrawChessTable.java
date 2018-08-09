public class DrawChessTable {
  public static void main(String[] args){
    //make an 8x8 chesstable with % and " " as colors

    for (int i=0; i<8; i++){

        if  (i % 2 == 1){
          for (int j=0; j<8; j++){
          System.out.print("%");
          System.out.print(" ");
          }
          System.out.println();
        }
        else {
          for (int j=0; j<8; j++){
          System.out.print(" ");
          System.out.print("%");
        }
          System.out.println();
      }
    }
  }
}
