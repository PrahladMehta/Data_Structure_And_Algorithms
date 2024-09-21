class p6 {
      
      public static int binary_search(int arr[]){    
            int st=0;
            int end=arr.length-1;
            int n=arr.length;

         
            while(st<=end){

                  int mid=st+(end-st)/2;                  
                  
                  if(arr[(mid+1)%n]>arr[mid]&&arr[(mid-1+n)%n]>arr[mid]){

                        return arr[mid];
                  }

                  if(arr[end]>arr[mid]){
                        end=mid-1;
                  }else{
                        st=mid+1;
                  }

            }
            return -1;        
      }


      public static void main(String args[]){


            int arr[]={3,3,4,5,6,7,8,1,2,3,3};

            System.out.println(binary_search(arr));


      }


}
