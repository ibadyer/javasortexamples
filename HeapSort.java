public class HeapSort{
	
public static final int max = 11;

public static void main(String[] args){
	int[] toSortArray = new int[max];


	for (int i=1;i<max;i++){
		toSortArray[i]= (int) (Math.random()*100);
		int index=i;
		toSortArray[0]++;
		while(toSortArray[index/2] < toSortArray[index] && (index/2) !=0 ){
			int temp=  toSortArray[ index/2];
			toSortArray[index/2]= toSortArray[index];
			toSortArray[index]=temp;
			index=index/2;
		}
	}
	System.out.println("The Array to be sorted is");
	for (int i=0;i<max;i++){
		System.out.println(toSortArray[i]);
	}

	//Start
	while(toSortArray[0] >0){
		int tmp=toSortArray[1];
		toSortArray[1]= toSortArray[toSortArray[0]] ;
		toSortArray[toSortArray[0]]=tmp;
//
		for (int i=1;i<toSortArray[0];i++){ 
			int index=i;
			//toSortArray[0]++;
			while(toSortArray[index/2] < toSortArray[index] && (index/2) !=0 ){
				int temp2=  toSortArray[ index/2];
				toSortArray[index/2]= toSortArray[index];
				toSortArray[index]=temp2;
				index=index/2;
			} 
		}
		toSortArray[0]--;
 	}
 	System.out.println("Sorted heap");
 	for (int i=0;i<max;i++){
 		System.out.println(toSortArray[i]);
 	}

	}

}