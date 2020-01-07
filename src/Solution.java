/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream fileReader = new FileInputStream(fileName1);
        FileOutputStream fileWriter = new FileOutputStream(fileName2);
        byte[] buffer = new byte[fileReader.available()];
        byte[] reversedBuffer = new byte[fileReader.available()];
        while (fileReader.available() > 0) {
            int count = fileReader.read(buffer);
            for (int i = buffer.length - 1; i >= 0; ) {

                for (int j = 0; j < reversedBuffer.length; j++) {
                    reversedBuffer[j] = buffer[i];
                    i--;
                }
            }
            fileWriter.write(reversedBuffer, 0, count);

        }

        /*for (byte b : buffer) {
            System.out.print(b + " ");
        }
        System.out.println(" ");

        for (byte b : reversedBuffer) {
            System.out.print(b + " ");
        }
        
         */


        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}