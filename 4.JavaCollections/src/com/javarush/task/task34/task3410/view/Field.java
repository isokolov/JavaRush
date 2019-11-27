package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {

    private View view;
    private Controller controller;

    public Field(View view) {
        this.view = view;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
