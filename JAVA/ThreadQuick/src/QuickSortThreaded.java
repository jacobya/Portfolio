/*
 * Threaded quicksort
 * @Author Adam Jacoby
 */
public class QuickSortThreaded <T extends Comparable<T>> extends Thread{

	public T[] table;
	public int first;
	public int last;
	public static int countT=0;
	/*
	 * Constructor
	 * Partitions the object array to different threads, should only happen twice.
	 */
	public QuickSortThreaded (T[] in_table, int in_first, int in_last){
		table = in_table;
		first = in_first;
		last = in_last;
		
	}
	/*
	 * QuickSortThreaded
	 */
	private void quickSort(T[] table, int first, int last){
		if(first < last){
			if(countT < 2){
				countT++;
				int pivIndex = partition(table, first, last);
				QuickSortThreaded<T> thread1 = new QuickSortThreaded<T>(table, first, pivIndex - 1); thread1.run(); 
				try {
					thread1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
			else{
				int pivIndex = partition(table, first, last);
				quickSort(table, first, pivIndex - 1);
				quickSort(table, pivIndex+1, last);
			}
		}
		
	}
	private int partition(T[] table, int first, int last){
		T pivot = table[first];
		int up = first;
		int down = last;
		do{
			while((up < last)&&(pivot.compareTo(table[up]) >= 0)){
				up++;
			}
			while(pivot.compareTo(table[down]) < 0){
				down--;
			}
			if(up < down){
				swap(table, up, down);
			}
		}
		while (up < down);
		swap(table, first, down);
		return down;
	}
	private void swap(T[] table2, int x, int y){
		T temp = table2[x];
		table2[x] = table2[y];
		table2[y] = temp;
	}
	public void run(){
		quickSort(table, first, last);
		countT--;
	}
	
	
}
