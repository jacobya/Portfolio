
public class BubbleSort {
	
	public static void sort (int[] table){
		int pass = 1;
		boolean exchange = false;
		do{
			exchange = false;
			for(int i = 0; i < table.length - pass; i++){
				if(table[i] < table[i-1]){
					int temp = table[i];
					table[i] = table[i+1];
					table[i+1] = temp;
					exchange = true;
				}
			}
		pass++;
	}
	while (exchange);
	
	}
	
	
	
}
