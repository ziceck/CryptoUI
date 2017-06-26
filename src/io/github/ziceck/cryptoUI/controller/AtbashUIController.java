/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.ziceck.cryptoUI.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * This class is a controller for AtbashUI
 * @author Ziceck
 */
public class AtbashUIController implements MenuListener{

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
    
}
