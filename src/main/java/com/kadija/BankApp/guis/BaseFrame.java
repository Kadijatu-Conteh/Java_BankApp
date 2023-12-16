package com.kadija.BankApp.guis;

import javax.swing.*;
import java.awt.*;

// Create an abstract class that helps set up the blueprint that our GUIs will follow
public abstract class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        initialize(title);
    }

    private void initialize(String title) {
        setTitle(title);
        setSize(420, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        addGuiComponents(); // Call on this subclass to add specific GUI components
    }

    // Abstract method to be implemented by subclasses for adding GUI components
    protected abstract void addGuiComponents();


}
