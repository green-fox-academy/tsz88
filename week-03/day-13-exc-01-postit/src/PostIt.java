public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  void PostIt(){
    backgroundColor = "white";
    text = "";
    textColor = "black";
  }

  void PostIt(String bg, String txt, String txtclr){
    this.backgroundColor = bg;
    this.text = txt;
    this.textColor = txtclr;
  }
}
