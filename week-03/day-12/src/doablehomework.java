import java.util.ArrayList;
import java.util.Arrays;

public class doablehomework {
  public static void main(String[] args){
//template: type, leaf color, age, sex

    ArrayList<ArrayList<String> treeData = new ArrayList<>();
    treeData.add(0,new ArrayList<>(Arrays.asList("pine","green","50","M")));
    treeData.add(1,new ArrayList<>(Arrays.asList("birch","green","30","F")));
    treeData.add(2,new ArrayList<>(Arrays.asList("cherry","green","22","F")));
    treeData.add(3,new ArrayList<>(Arrays.asList("bonsai","green","100","M")));
    treeData.add(4,new ArrayList<>(Arrays.asList("baobab","green","500","F")));
  }
}
