package com.example.game;

public class Bloke implements Interface{
    private int blokeHight = 60;
    private int blokeWidth = 30;
    private int blokeColorR;
    private int blokeColorG;
    private int blokeColorB;
    private int blokeX;
    private int blokeY;
    private int speedY;

    public Bloke(int blokeColorR, int blokeColorG, int blokeColorB, int blokeX, int blokeY, int speedY) {
        this.blokeColorR = blokeColorR;
        this.blokeColorG = blokeColorG;
        this.blokeColorB = blokeColorB;
        this.blokeX = blokeX;
        this.blokeY = blokeY;
        this.speedY = speedY;
    }

    public int getBlokeHight() {
        return blokeHight;
    }
    public void setBlokeHight(int blokeHight) {
        this.blokeHight = blokeHight;
    }
    public int getBlokeWidth() {
        return blokeWidth;
    }
    public void setBlokeWidth(int blokeWidth) {
        this.blokeWidth = blokeWidth;
    }
    public int getBlokeColorR() {
        return blokeColorR;
    }
    public void setBlokeColorR(int blokeColorR) {
        this.blokeColorR = blokeColorR;
    }
    public int getBlokeColorG() {
        return blokeColorG;
    }
    public void setBlokeColorG(int blokeColorG) {
        this.blokeColorG = blokeColorG;
    }
    public int getBlokeColorB() {
        return blokeColorB;
    }
    public void setBlokeColorB(int blokeColorB) {
        this.blokeColorB = blokeColorB;
    }
    public int getBlokeX() {
        return blokeX;
    }

    public void setBlokeX(int blokeX) {
        this.blokeX = blokeX;
    }

    public int getBlokeY() {
        return blokeY;
    }

    public void setBlokeY(int blokeY) {
        this.blokeY = blokeY;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }



    //methods
    @Override
    public void makeAndShow() {
        Main.p.fill(blokeColorR, blokeColorG, blokeColorB);
        Main.p.rect(blokeX, blokeY, blokeWidth, blokeHight);
    }

    //shoe methods
    // public void show1(){
    //     Main.p.fill(3, 107, 252);
    //     Main.p.rect(30, speedY, blokeWidth, blokeHight);
    //     Main.p.rect(90, speedY - 30, blokeWidth, blokeHight);
    //     Main.p.rect(150, speedY -10, blokeWidth, blokeHight);
    //     Main.p.rect(300, speedY + 10, blokeWidth, blokeHight);
    //     speedY += 5;
    // }

    public static void addBloke(){
        while(true){
            Main.blokeCrash = false;
            Main.x = (int) Main.p.random(-10 , 380);
            Main.y = (int) Main.p.random(-400, 10);
            for (Bloke bloke1 : Main.blokes) {
                if (Main.x + 30 > bloke1.getBlokeX() && Main.x < bloke1.getBlokeX() + 30) {
                    if(bloke1.getBlokeY() + 60 > Main.y && bloke1.getBlokeY() < Main.y + 60){
                    Main.blokeCrash = true;
                    break;
                    }
                }
            }
            if (!Main.blokeCrash) {
                Main.blokes.add(new Bloke((int) Main.p.random(10, 255), (int) Main.p.random(10, 255), (int) Main.p.random(10, 255), Main.x, Main.y, (int) Main.p.random(-2, 5)));
                Main.level++;
                break;
            }
        }

    }
    


}
