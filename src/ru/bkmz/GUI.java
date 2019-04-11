package ru.bkmz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUI extends JFrame {


    private JButton button;//кнопка счета
    private JSpinner day1;//ден начальный
    private JSpinner year1;//год начальный
    private JSpinner month1;//месяц начальный
    private JSpinner day2;//день конечный
    private JSpinner month2;//месяц конечный
    private JSpinner year2;//год конечный
    private JPanel JPanel;//панель
    private JLabel Jlabe;//вывод ответа пр
    private SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");//формула к дате


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    //код генерирует IDEA
    //нужен для createUIComponents
    private void $$$setupUI$$$() {
        createUIComponents();
        JPanel = new JPanel();
        JPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 5, new Insets(0, 0, 0, 0), -1, -1));
        JPanel.setName("");
        JPanel.setToolTipText("");
        JPanel.putClientProperty("html.disable", Boolean.TRUE);
        button = new JButton();
        button.setForeground(new Color(-16731205));
        button.setText("Button");
        button.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(button, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Jlabe = new JLabel();
        Jlabe.setBackground(new Color(-4316082));
        Jlabe.setDoubleBuffered(false);
        Jlabe.setForeground(new Color(-15597381));
        Jlabe.setText("    ");
        Jlabe.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(Jlabe, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        month1.setFocusTraversalPolicyProvider(false);
        month1.setForeground(new Color(-4521981));
        month1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(month1, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        month2.setFocusTraversalPolicyProvider(false);
        month2.setForeground(new Color(-4521981));
        month2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(month2, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        day1.setFocusTraversalPolicyProvider(false);
        day1.setForeground(new Color(-4521981));
        day1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(day1, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        year1.setFocusTraversalPolicyProvider(false);
        year1.setForeground(new Color(-4521981));
        year1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(year1, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        year2.setFocusTraversalPolicyProvider(false);
        year2.setForeground(new Color(-4521981));
        year2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(year2, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        day2.setFocusTraversalPolicyProvider(false);
        day2.setForeground(new Color(-4521981));
        day2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(day2, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(4, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer5 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer5, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer6 = new com.intellij.uiDesigner.core.Spacer();
        JPanel.add(spacer6, new com.intellij.uiDesigner.core.GridConstraints(7, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return JPanel;
    }

    eHendler hendler = new eHendler();//нажатие кнопки

    GUI() {
        super("Калькулазер даты");//имя


        $$$setupUI$$$();// подключение
        Date data = new Date();//получаем дату

        //разбиваем дату и применяем её к дате начала
        String formatData = formatForDateNow.format(data);
        String[] dataStrMass = formatData.split("\\.");
        year1.setValue(Integer.parseInt(dataStrMass[0]));
        month1.setValue(Integer.parseInt(dataStrMass[1]));
        day1.setValue(Integer.parseInt(dataStrMass[2]));


        setVisible(true);//окно видемо
        add(JPanel);//формеруем внутрености окна
        setSize(400, 200);//размер окна
        setResizable(false);//блокировка изменения размера
        button.addActionListener(hendler);//при нажатиии вызываем hendler
    }

    //изменение внутреностей окна так как GUI.form делает недоступную функцыю new SpinnerNumberModel(0, 0, null, 1)
    private void createUIComponents() {
        JPanel = new JPanel();
        JPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        JPanel.putClientProperty("html.disable", Boolean.TRUE);
        button = new JButton();
        button.setText("Button");
        button.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(button, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        Jlabe = new JLabel();
        Jlabe.setText("");
        Jlabe.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(Jlabe, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        month1 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        month1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(month1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        month2 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        month2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(month2, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        day1 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        day1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(day1, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        year1 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        year1.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(year1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        year2 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        year2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(year2, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        day2 = new JSpinner(new SpinnerNumberModel(0, 0, null, 1));
        day2.putClientProperty("html.disable", Boolean.TRUE);
        JPanel.add(day2, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));

    }

    //обработчик нажатия
    public class eHendler extends Thread implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                int year = dataMinus(year1, year2);//разница в годе
                int month = dataMinus(month1, month2);//разница в месяце
                int day = dataMinus(day1, day2);//разница в днях
                Date date = new Date(year - 1900, month - 1, day);//для удобства Data всё сама сконфигурирует
                System.out.println(formatForDateNow.format(date));
                Jlabe.setText(formatForDateNow.format(date));//вывод ответа
            }
        }
        //JSpinner имеет формат Object поэтому мы его изменяем в int и вычетам их
        int dataMinus(JSpinner jSpinner1, JSpinner jSpinner2) {
            int data1 = Integer.parseInt(String.valueOf(jSpinner1.getValue()));
            int data2 = Integer.parseInt(String.valueOf(jSpinner2.getValue()));
            return data1 - data2;
        }

    }

}