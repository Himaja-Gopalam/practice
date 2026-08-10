
//reverse of an array

static void rev(int i,int[] arr,int n)
    {
        if(i>=n/2)
            return;
       swap(arr,i,n-i-1);
       rev(i+1,arr,n); 
    }
  static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();}
        // Reverse the array 
        rev1(0,arr,n);
        // Print the reversed array
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
    }
