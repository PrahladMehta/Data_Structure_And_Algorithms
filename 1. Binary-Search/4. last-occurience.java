class p4{

      public static int binary_search(int arr[],int target){    
            int st=0;
            int end=arr.length-1;

            int idx=-1;
            while(st<=end){

                  int mid=st+(end-st)/2;                  
                  if(arr[mid]==target){
                        idx=mid;
                  }
                  if(arr[mid]>target){
                        end=mid-1;
                  }else{
                        st=mid+1;
                  }
            }
            return idx;        
      }

      public static void main(String args[]){

            int arr[]={1,2,3,3,3,6,6,8,9,9};
            System.out.println(binary_search(arr,3));


      }
}

