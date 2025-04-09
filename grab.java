import java.util.Scanner;
class grab{
  public static void main(String[] args){
    Scanner get=new Scanner(System.in);
    int[] orders=new int[7];
    int n;
    for(n=0;n<orders.length;n++){
        System.out.print("Enter orders day "+(n+1)+":");
        orders[n]=get.nextInt();}
    display(orders);}
  public static void display(int[] k){
      int total=0;
      int high=0;
      int low=999999;
      int i;
      for(i=0;i<k.length;i++){
          total=total+k[i];}
      for(i=0;i<k.length;i++){
          if(high<k[i]){
              high=k[i];}
          if(low>k[i]){
              low=k[i];}}
      double average;
      average=(double)total/i;
      System.out.println("Total order this week is "+total);
      System.out.println("Highest order this weeks is "+high);
      System.out.println("Lowest order this weeks is "+low);
      System.out.println("Average order this week is "+average);
      if(total>=450){
          System.out.println("Rider is eligible for bonus");}
      else{
          System.out.println("Rider is not eligible for bonus");}}}
