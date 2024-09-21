class p5 {

      public static int first_occurience(int arr[],int target){    
            int st=0;
            int end=arr.length-1;
            int idx=-1;
            while(st<=end){
                  int mid=st+(end-st)/2;                  
                  if(arr[mid]==target){
                        idx=mid;
                  }
                  if(arr[mid]>=target){
                        end=mid-1;
                  }else{
                        st=mid+1;
                  }
            }
            return idx;        
      }

      public static int second_occurience(int arr[],int target){    
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


      public static void main(String[] args) { 
            int arr[]={1,2,3,3,3,3,4,4,4,5,5,6,7,9};
            int first=first_occurience(arr, 3);
            int second=second_occurience(arr, 3);
            System.out.println(second-first+1);  //occurience of element 
      }
      
}
