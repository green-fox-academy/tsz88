public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt(){
    backgroundColor = "white";
    text = "";
    textColor = "black";
  }

  public PostIt(String bg, String txt, String txtclr){
    this.backgroundColor = bg;
    this.text = txt;
    this.textColor = txtclr;
  }
}
