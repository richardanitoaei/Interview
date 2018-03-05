public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
        // TODO complete this code
        int height = screen.length * 8 / width;
        int byteIndex = y * (width / 8) + (x / 8);

        if(x % 8 == 0) screen[byteIndex] += 0x80;
        else if(x % 8 == 1) screen[byteIndex] += 0x40;
       	else if(x % 8 == 2) screen[byteIndex] += 0x20;
        else if(x % 8 == 3) screen[byteIndex] += 0x10;
        else if(x % 8 == 4) screen[byteIndex] += 0x8;
        else if(x % 8 == 5) screen[byteIndex] += 0x4;
        else if(x % 8 == 6) screen[byteIndex] += 0x2;
        else if(x % 8 == 7) screen[byteIndex] += 0x1;
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
        // TODO complete this code
        for(int i = startX; i <= endX; i++) {
        	setPixel(screen, width, i, y);
        }
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
        // TODO complete this code
        for(int i = startY; i <= endY; i++) {
    		setPixel(screen, width, x, i);
    	}
    }


}
