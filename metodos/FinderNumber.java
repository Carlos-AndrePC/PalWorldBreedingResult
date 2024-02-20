package metodos;

import PalsClass.Pals;

public class FinderNumber {
  Pals[] array;
  public FinderNumber(Pals[] vetor){
    array = vetor;
  }
  public int findRank(int pocurado){
    int inicio = 0;
    int fim = array.length-1;
    int meio;
    while (inicio<=fim) {
      meio = (inicio+fim)/2;
      int meioRank = array[meio].getBreeding().getRank();
      if(meioRank<pocurado){
        inicio = meio +1;
      }
      else if (meioRank>pocurado){
        fim = meio - 1;
      }
      else{
        return meio;
      }
    }
    return -1;
  }
  public int findId(int pocurado){
    int inicio = 0;
    int fim = array.length-1;
    int meio;
    while (inicio<=fim) {
      meio = (inicio+fim)/2;
      int meioRank = Integer.parseInt(array[meio].getId());
      if(meioRank<pocurado){
        inicio = meio +1;
      }
      else if (meioRank>pocurado){
        fim = meio +1;
      }
      else{
        return meio;
      }
    }
    return -1;    
  }
}
