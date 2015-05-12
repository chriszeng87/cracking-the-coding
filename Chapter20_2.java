

public static void randomMize(int[] array) {
	if(array == null) {
		return;
	}
	
	int index,temp;
	for (int i = 0; i < array.length; i++) {
	    //get a random number range from i to array.length
		index = (int)(Math.random() * (array.length -i)) + i;
		//swap array[i] with array[index]
		temp = array[i];
		array[i] = array[index];
		array[index] = temp;
	}
}