package PalsClass;

public class Pals {
  String id;
  String key;
  String name;
  breeding breeding;
  @Override
  public String toString() {
    return" Nome: "+ name +" ID: " + id;
  }
  public breeding getBreeding() {
    return breeding;
  }
  public String getId() {
    return id;
  }
  public String getName() {
    return name;
  }
}
