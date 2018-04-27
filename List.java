public class List{
  private int[] list;
  private int p;
  public List(){
    this.list = new int[5];
    this.p = 0;
  }
  public void add(int a){
    if(list.length > p){
      list[p] = a;
      p += 1;
    }else{
      int [] list2 = new int[list.length * 2];
      for(int x = 0;x < list.length;x++)
        list2[x] = list[x];
      list = list2;
      
      list[p] = a;
      p += 1;
      
    }
  }
  public String toString(){
    String l = "";
    for(int x = 0; x < p; x++){
      l += list[x] + "\n ";
    }
    return l;
  }
}