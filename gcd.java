class gcd{
  public static void main(String[] args){
    int gcd=1;
    int a = 12;
    int b= 9;
    for(int i=1;i<=a&&i<=b;i++){
      if(a%i==0&&b%i==0){
        gcd = i;
      }
    }
    System.out.println(gcd);
  }
}