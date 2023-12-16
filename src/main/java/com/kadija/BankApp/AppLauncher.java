package com.kadija.BankApp;

import com.kadija.BankApp.guis.LoginGui;
import com.kadija.BankApp.guis.RegisterGui;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // new LoginGui().setVisible(true);
                new RegisterGui().setVisible(true);
            }
        });
    }
}