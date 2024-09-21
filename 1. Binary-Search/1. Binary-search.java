
class p1{

      public static int binary_search(int arr[],int target){

             
            int st=0;
            int end=arr.length-1;
            while(st<=end){

                  int mid=st+(end-st)/2;

                  if(arr[mid]==target){
                        return mid;
                  }

                  if(arr[mid]<target){
                        st=mid+1;
                  }else{
                        end=mid-1;
                  }
            
            }

            return -1;


              
      }

      public static void main(String args[]){


            int arr[]={1,2,3,4,5,6,7,8,9,10,24};

            System.out.println(binary_search(arr,3));



      }
}