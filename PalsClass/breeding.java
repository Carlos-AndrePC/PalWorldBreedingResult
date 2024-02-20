package PalsClass;

public class breeding {
  String rank;
  String order;
  String child_eligble;
  @Override
  public String toString() {
    return "\n"+rank;
  }
  public int getRank(){
    return Integer.parseInt(rank);
  }
}
