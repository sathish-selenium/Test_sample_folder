package org.design;

import java.util.ArrayList;
import java.util.List;

public class Design {

    
		public static void main(String[] args) {
			
			String s = "Sathish is a good boy";
			String[] split = s.split(" ");
			
			for (String x : split) {
				
				//System.out.println(x);
				
				List li = new ArrayList();
				
				System.out.println(li + x);
			}

			
			
		}
}