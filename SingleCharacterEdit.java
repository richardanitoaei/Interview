public class SingleCharacterEdit {

	public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
		
		int nr = 0, mem = 0;
		
		if(a.length() == b.length()) {
			
			for( int i = 0; i < a.length() && nr <= 1; i++) {
				
				if(a.charAt(i) != b.charAt(i)) {
					
					nr++;
					mem = i;
				}
			}
			
			if(nr == 1) return("replace," + String.valueOf(mem) + "," + b.charAt(mem));
			else return null;
		}
		
		else if(a.length() == b.length() + 1) {
			
			for(int i = 0; i < b.length() && nr <= 1; i++) {
				
				if(a.charAt(i) != b.charAt(i)) {
					
					nr++;
					mem = i;
				}	
			}
			
			if(nr > 2) return null;
			else if(nr == 0)return("remove," + String.valueOf(a.length() - 1));
			else {
				
				if(nr == 2) mem = mem - 1;
				return("remove," + Integer.toString(mem));
			}
		}
		
		else if(b.length() == a.length() + 1) {
			
			for(int i = 0; i <= (b.length() - 2); i++) {
				
				if(b.charAt(i) != a.charAt(i)) nr = 1;
			}
			
			if(nr == 0) return("insert," + String.valueOf(b.length() - 1) + "," + b.charAt(b.length() - 1));
			else{
				
				nr = 0;
				
				for(int i = 0; i <= (b.length() - 2); i++){
					
					if(a.charAt(i) != b.charAt(i + 1)) nr = 1;
				}
				
				if(nr == 0) return("insert,0," + b.charAt(0));
				else{
					
					for(int i = 1; i <= (b.length() - 2); i++){
						
						if(a.charAt(i) != b.charAt(i)){
							
							mem = i;
							nr = 0;
							
							for( int j = 0; j <= (b.length() - 2); j++){
								
								if(j >= mem){
									
									
									if(a.charAt(j) != b.charAt(j + 1)) return null;
								}
								else{
									
									if(a.charAt(j) != b.charAt(j)) return null;
								}
							}
							
							return("insert," + String.valueOf(mem) + "," + b.charAt(mem));
							
							
							
						}
							
					}
				}
				return null;
				
			}
		}
		
		else return null;
	}
}