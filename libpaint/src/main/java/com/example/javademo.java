package com.example;

import java.applet.*;

import java.awt.*;

public class javademo extends Applet{

    Image img;

    public void init(){

        img=getImage(getCodeBase(),"w.jpg");

    }

    public void paint(Graphics g){

        int w=img.getWidth(this);

        int h=img.getHeight(this);

        g.drawImage(img,20,40,this);

        g.drawImage(img,100,100,w/2,h/2,this);

        g.drawImage(img,160,10,2*w,2*h,this);

    }

}