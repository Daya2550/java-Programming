 class st{
    public static void main(String[] args) {
        String s="aaabccdeeeff";
        int c=1;
         String arr[]=s.split("");
         String r="";

         for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals(arr[i+1])){
                c++;
            }
            else{
                if(c==1){
                        r=r+arr[i];
                }
                else{
                    r=r+arr[i]+c;
                }
                c=1;
            }
         }
         if(c==1){
            r=r+arr[arr.length-1];
         }
         else{
            r=r+arr[arr.length-1]+c;
         }
         System.out.println(r);
    }
}