import java.io.File;
import java.util.Scanner;

import com.google.gson.Gson;

import PalsClass.*;
import metodos.FinderNumber;
import metodos.QuickSort;


public class Principal {
  Gson gson = new Gson();
  Pals[] pals;
  int idPal;
  int rankPal;
  FinderNumber find;
  public static void main(String[] args){
    Principal programa = new Principal();
    programa.echerDex();
    programa.pegarPal();
    programa.ordenarRankDex();
    programa.acharPais();
  }
  private void acharPais() {
    find = new FinderNumber(pals);
    int rankPal2 = 2*rankPal;
    for(int i=0;i<(pals.length/2);i++){
      int rankPai1 = pals[i].getBreeding().getRank();
      int rankPai2 = rankPal2 - rankPai1;
      int indexPai2 = find.findRank(rankPai2);
      if(indexPai2 != -1){
        System.out.println(pals[i]);
        System.out.println(pals[indexPai2]);
        System.out.println("--------------------------------------------------------------------------");
      }
    }
  }
  private void ordenarRankDex() {
    QuickSort sort = new QuickSort(pals);
    sort.quickSortRank(0, pals.length-1);
    pals = sort.getArray(); 
  }
  public void echerDex(){
    try {
      gson = new Gson();
      File file = new File("pals.json");
      Scanner scan = new Scanner(file);
      String frase ="";
      while (scan.hasNextLine()) {
        frase += scan.nextLine();
      }
      pals = gson.fromJson(frase, Pals[].class);
      scan.close();
    } catch (Exception e) {
      System.out.println(e);
    } 
  }
  public String printPals(){
    String frase = "";
    for(int i=0;i<pals.length;i++){
      frase += pals[i];
    }
    return frase;
  }
  public void pegarPal(){
    try {
      Scanner indata = new Scanner(System.in);
      System.out.println("Digite o numero do Pal:");
      String numero = indata.nextLine();
      idPal = Integer.parseInt(numero);
      indata.close();
      rankPal = pals[idPal-1].getBreeding().getRank();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
