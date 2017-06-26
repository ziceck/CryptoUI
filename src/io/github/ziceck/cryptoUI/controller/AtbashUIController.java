/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ziceck.cryptoUI.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * This class is a controller for AtbashUI
 * @author Ziceck
 */
public class AtbashUIController implements MenuListener,ActionListener{
    private int code;
    
    public AtbashUIController() {
        
    }
    
    public AtbashUIController(int code) {
        this.code = code;
    }
    
    @Override
    public void menuSelected(MenuEvent e) {
        JOptionPane.showMessageDialog(null, "Created by ziceck \n"
                + " 2017");
    }

    @Override
    public void menuDeselected(MenuEvent e) {
    
    }

    @Override
    public void menuCanceled(MenuEvent e) {
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser chooser=new JFileChooser();
            chooser.setFileFilter(
                    new FileNameExtensionFilter("*.TXT", "txt"));
        chooser.showOpenDialog(chooser);
        File file = chooser.getSelectedFile();
        if ( code == 0 ) {
            ReadFiles.readFile(file.getAbsolutePath(),0);
        } else {
            ReadFiles.readFile(file.getAbsolutePath(),1);
        }
    }

}