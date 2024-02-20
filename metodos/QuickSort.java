package metodos;

import PalsClass.Pals;

public class QuickSort {
  private Pals[] array;

  public QuickSort(Pals[] vetor){
    this.array = vetor;
  }
  public Pals[] quickSortRank(int inicio,int fim){
    if(inicio<fim){
      int arrayPosision = separarRank(inicio,fim);
      quickSortRank(inicio, arrayPosision-1);
      quickSortRank(arrayPosision+1, fim); 
    }
    return array;
  }
  public int separarRank(int inicio,int fim){
    Pals pivo = array[inicio];
    int pivoRank = pivo.getBreeding().getRank();
    int i = inicio + 1;
    while (i<=fim) {
      int iRank = array[i].getBreeding().getRank();
      int fRank = array[fim].getBreeding().getRank();
      if(iRank<=pivoRank){
        i++;
      }
      else if(pivoRank<fRank){
        fim--;
      }
      else{
        Pals troca = array[i];
        array[i] = array[fim];
        array[fim] = troca;
        i++;
        fim--;
      }
    }
    array[inicio] = array[fim];
    array[fim] = pivo;
    return fim;
  }
  public Pals[] getArray() {
    return array;
  }
}
