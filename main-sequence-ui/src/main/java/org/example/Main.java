package org.example;

import jdepend.xmlui.JDepend;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        JDepend depend = new JDepend(new PrintWriter("report/report.xml"));
        depend.addDirectory("T:\\HuynhAnhKhoi\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}