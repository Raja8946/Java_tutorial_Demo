package file_handling_core_java;

import java.io.Serializable;

public class String_Serializable implements Serializable {

	
	private String str;

	/**
	 * @param str
	 */
	public String_Serializable(String str) {
		
		this.str = str;
	}

	@Override
	public String toString() {
		return "[" + str + "]";
	}
	
	
}
