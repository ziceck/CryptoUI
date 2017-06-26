/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ziceck.cryptoUI.controller;

import io.github.ziceck.cryptoUI.view.AtbashUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.github.ziceck.crypto.Atbash;
/**
 *
 * @author Ziceck
 */
public class ReadFiles {
    private static Atbash atbash=new Atbash();
    /**
     * 
     * @param path Is a path to save the file.
     */
    public static void readFile(String path, int code){
        try {
            File file = new File (path);
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader(fr); 
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                if ( code == 0 ) {
                    AtbashUI.jTextArea1.append(atbash.encrypt(line)+"\n");
                    AtbashUI.jTextArea2.append(line+"\n");
                } else{
                    AtbashUI.jTextArea1.append(line+"\n");
                    AtbashUI.jTextArea2.append(atbash.encrypt(line)+"\n");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
