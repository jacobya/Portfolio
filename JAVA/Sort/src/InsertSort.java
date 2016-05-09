
public class InsertSort {
	public static void sort(int[] table) {
		for(int nextPos = 1; nextPos < table.length; nextPos++){
			insert(table, nextPos);
		}
	}
	
	private static void insert(int[] table, int nextPos){
		int nextValue = table[nextPos];
		while(nextPos > 0 && nextValue > table[nextPos - 1]){
			table[nextPos] = table[nextPos - 1]; 
			nextPos--;
		}
		table[nextPos] = nextValue;
	}
	

}
