class p2{

      public static int binary_search(int arr[],int target){    
            int st=0;
            int end=arr.length-1;
            while(st<=end){

                  int mid=st+(end-st)/2;

                  if(arr[mid]==target){
                        return mid;
                  }

                  if(arr[mid]>target){
                        st=mid+1;
                  }else{
                        end=mid-1;
                  }
            
            }

            return -1;


              
      }

      public static void main(String args[]){


            int arr[]={9,8,7,6,5,4,3,2,1};

            System.out.println(binary_search(arr,3));


      }
}
