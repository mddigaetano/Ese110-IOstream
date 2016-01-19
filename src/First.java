/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Amedeo Di Gaetano <digaetano.amedeo@gmail.com>
 */
public class First {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        StringReader sr = null;
        FileWriter fw = new FileWriter("output.txt");
        int c;
        
        System.out.println("Aperti correttamente tutti i file");
        
        while((line = br.readLine()) != null){
            System.out.println("La riga letta e': "+line);
            sr = new StringReader(line);
            while((c = sr.read()) != -1){
                System.out.println("ho letto il carattere: "+(char)c);
                fw.write(c);
            }
            fw.write("\r\n");
        }
        
        fw.close();
        br.close();
        sr.close();
        
        System.out.println("Finito!");
    }
    
}
