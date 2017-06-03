/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.card.component;

/**
 *
 * @author lfeher
 */
public enum Cards {
    Hearts1(5,0,153,235),
    Hearts2(158,0,153,235),
    Hearts3(311,0,153,235),
    Hearts4(464,0,153,235),
    Hearts5(617,0,153,235),
    Hearts6(770,0,153,235),
    Hearts7(923,0,153,235),
    Hearts8(1076,0,153,235),
    Hearts9(1229,0,153,235),
    Hearts10(1382,0,153,235),
    HeartsJack(1535,0,153,235),
    HeartsQueen(1688,0,153,235),
    HeartsKing(1841,0,153,235),
    tiles1(5,230,157,222),
    tiles2(158,230,157,222),
    tiles3(311,230,157,222),
    tiles4(464,230,157,222),
    tiles5(617,230,157,222),
    tiles6(770,230,157,222),
    tiles7(923,230,157,222),
    tiles8(1076,230,157,222),
    tiles9(1229,230,157,222),
    tiles10(1382,230,157,222),
    tilesJack(1535,230,157,222),
    tilesQueen(1688,230,157,222),
    tilesKing(1841,230,157,222),
    clovers1(5,449,157,227),
    clovers2(158,449,157,227),
    clovers3(311,449,157,227),
    clovers4(464,449,157,227),
    clovers5(617,449,157,227),
    clovers6(770,449,157,227),
    clovers7(923,449,157,227),
    clovers8(1076,449,157,227),
    clovers9(1229,449,157,227),
    clovers10(1382,449,157,227),
    cloversJack(1535,449,157,227),
    cloversQueen(1688,449,157,227),
    cloversKing(1841,449,157,227),
    pikes1(5,0,165,235),
    pikes2(158,0,165,235),
    pikes3(311,0,165,235),
    pikes4(464,0,165,235),
    pikes5(617,0,165,235),
    pikes6(770,0,165,235),
    pikes7(923,0,165,235),
    pikes8(1076,0,165,235),
    pikes9(1229,0,165,235),
    pikes10(1382,0,165,235),
    pikesJack(1535,0,165,235),
    pikesQueen(1688,0,165,235),
    pikesKing(1841,0,165,235);
    
    private final int x;   
    private final int y; 
    private final int width; 
    private final int height; 
    Cards(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    
    
}
