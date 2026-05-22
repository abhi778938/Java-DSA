class pairsArrary {
       public static void pairsArr(int num[]){
   for (int i=0; i<num.length;i++){
    int curr=num[i];
    for(int j=i+1;j<num.length;j++){
       System.err.print("(" + curr + "," + num[j] + ") ");
    }
    System.err.println();
   }
   
       }
       public static void main (String[]args){
              int number []={2,4,6,8,10};
              pairsArr(number);
       }
}