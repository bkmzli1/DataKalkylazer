package ru.bkmz;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();//вызываем GUI
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//пири нажатии на кнопку закрыть полностью закрывает пограмму
    }
}
