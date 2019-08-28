package designPattern.template;

public abstract class AbstractSort {
	
	public final void absSort(int[] array){
		sort(array);
	}
	
	protected abstract void sort(int[] array);
}
