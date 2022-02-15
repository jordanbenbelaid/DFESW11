public class TestingIteration {

	public static int playCount = 0;
    public static boolean playing = true;
    

    public static void main(String[] args) {
//        do {
//            System.out.println("Playing");
//            playCount++;
//
//            if(playCount > 10) {
//                playing = false;
//            }
//        } while(playing);
//
//        System.out.println("Game Over!");
    	
        int i;
    	
         for(i = 0; i <= 10; i++) {
        	 System.out.println(i);
        	 if(i == 8) {
        		 continue;
        	 }
        	 if(i == 8) {
        		 break;
        	 }
        	 System.out.println("This is here");
         }
    	
    }

}
