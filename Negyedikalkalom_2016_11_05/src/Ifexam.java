/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Ifexam {
    public static void main(String[] args) {
        String s = "-";
	boolean b = false;
	int x = 7, y = 8;
	if((x < 8) ^ (b = true)) s += "^";
	if(!(x > 8) | ++y > 5) s += "|";
	if(++y > 9 && b == true) s += "&&";
	if(y % 8 > 1 || y / (x - 7) > 1) s += "%";
	System.out.println(s);

    }
}
