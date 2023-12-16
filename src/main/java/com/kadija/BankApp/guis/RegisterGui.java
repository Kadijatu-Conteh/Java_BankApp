package com.kadija.BankApp.guis;

import javax.swing.*;
import java.awt.*;

public class RegisterGui extends BaseFrame{
    public RegisterGui(){
        super("Banking App Register");
    }
    @Override
    protected  void addGuiComponents(){

        //create the title label
        JLabel bankingAppLabel = new JLabel("Banking Application");
        bankingAppLabel.setBounds(0, 20, getWidth(), 40);
        bankingAppLabel.setFont(new Font("Open Sans", Font.BOLD, 30));
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(bankingAppLabel);

        // Create username label
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20, 120, getWidth() - 25, 20);
        usernameLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
        add(usernameLabel);

        // Create username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(20, 160, getWidth() - 40, 30);
        usernameField.setFont(new Font("Open Sans", Font.PLAIN, 12));
        add(usernameField);  // Add the username field to GUI

        //create password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 220, getWidth() - 25, 20);
        passwordLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
        add(passwordLabel);

        //create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 260, getWidth() - 40, 30);
        passwordField.setFont(new Font("Open Sans", Font.PLAIN, 12));
        add(passwordField);

        //create a re-type password label
        JLabel rePasswordLabel = new JLabel("Re-type Password:");
        rePasswordLabel.setBounds(20, 320, getWidth() - 40, 30);
        rePasswordLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
        add(rePasswordLabel);

        //create a re-type password field
        JPasswordField rePasswordField = new JPasswordField();
        rePasswordField.setBounds(20, 360, getWidth() - 40, 30);
        rePasswordField.setFont(new Font("Open Sans", Font.PLAIN, 12));
        add(rePasswordField);

        //create a register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(20, 450, getWidth() - 40, 30);
        registerButton.setFont(new Font("Open Sans", Font.BOLD, 13));
        add(registerButton);

        //create a register label
        JLabel registerLabel = new JLabel("<html><a href=\"#\">Have an account? Sign-in Here</a></html>");
        registerLabel.setBounds(0, 490, getWidth() - 10, 30);
        registerLabel.setFont(new Font("Open Sans", Font.PLAIN, 10));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

    }
}



