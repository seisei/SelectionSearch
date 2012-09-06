class SelectionSort{

static void selectionSort(int[] a){
  int[] min = new int[a.length];
  int number = 0;
  int count = 0;
  for(int i = 0; i < a.length; i++){
    min[i] = a[i];
    for(int j = i+1; j < a.length; j++){
	  if(min[i] > a[j]){
	    min[i] = a[j];
		number = j;
		count++;
	  }
	}
	if(count !=0){
	  int tmp = a[i];
	  a[i] = a[number];
	  a[number] = tmp;
	  count = 0;
	}
  }
}
    
    public static void main(String args[]){
		int[] a = {10,4,6,45,68,30,61,5,21,11};
		
		
		
		selectionSort(a);
		
		for(int i = 0; i < a.length; i++){
		  System.out.println(a[i]);
	    }
    }
}