package com.kadija.BankApp.guis;

import javax.swing.*;
import java.awt.*;

//Allow user to login or launch the register GUI, it extends from BaseFrame
public class LoginGui extends BaseFrame {
    public LoginGui() {
        super("Banking App Login");
    }

    @Override
    protected void addGuiComponents() {
        //create the title label
        JLabel bankingAppLabel = new JLabel("Banking Application");

        bankingAppLabel.setBounds(0, 20, getWidth(), 40);
        bankingAppLabel.setFont(new Font("Open Sans", Font.BOLD, 30));
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);
        // Add the label to GUI
        add(bankingAppLabel);

        // Create username label
        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(20, 120, getWidth() - 25, 20);
        usernameLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
        add(usernameLabel);

        // Create username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(20, 160, getWidth() - 40, 30);
        usernameField.setFont(new Font("Open Sans", Font.PLAIN, 12));
        add(usernameField);  // Add the username field to GUI

        //create password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 250, getWidth() - 25, 20);
        passwordLabel.setFont(new Font("Open Sans", Font.PLAIN, 13));
        add(passwordLabel);

        //create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 300, getWidth() - 40, 30);
        passwordField.setFont(new Font("Open Sans", Font.BOLD, 12));
        add(passwordField);

        //create a login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20, 450, getWidth() - 40, 30);
        loginButton.setFont(new Font("Open Sans", Font.BOLD, 10));
        add(loginButton);

        //create a register label
        JLabel registerLabel = new JLabel("<html><a href=\"#\">Don't have an account? Register Here</a></html>");
        registerLabel.setBounds(0, 490, getWidth() - 10, 30);
        registerLabel.setFont(new Font("Open Sans", Font.PLAIN, 10));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);
    }
}