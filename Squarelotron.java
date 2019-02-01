package week_2.classes;

public class Squarelotron {
    short len;
    short[][] arr;

    public Squarelotron(short len) {
	this.len = len;
	arr = new short[len][len];
	short counter = 1;

	for(short i = 0; i < len; i++) {
	    for(short j = 0; j < len; j++, counter++) {
		arr[i][j] = counter;
	    }
	}
    }

    @Override
    public boolean equals(Object obj) {
	Squarelotron matrix = (Squarelotron) (obj);
	try {
	    for(short i = 0; i < len; i++) {
		for(short j = 0; j < len; j++) {
		    if(arr[i][j] != matrix.arr[i][j]) {
			return false;
		    };
		}
	    }
	} catch(Exception ArrayIndexOutOfBoundsException) {
	    return false;
	}
	return true;
    }

}
