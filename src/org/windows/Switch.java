package org.windows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Switch extends Alerts{
	
	public static void main(String[]args) {
		
		String day = "Tuesday";
		
		switch(day) {
		case "Monday":
			monday();
			break;
			
		case "Tuesday":
			tuesday();
			break;
			
		case "Wednesday":
			wednesday();
			break;
		}
}
}
