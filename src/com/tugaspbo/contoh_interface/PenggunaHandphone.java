package com.tugaspbo.contoh_interface;

/*
Created at Wednesday 09 June 2021
Licensed @JustAo
Tugas Pbo Materi Interface(24 Januari 2021).
 */



public class PenggunaHandphone {

    private Handphone handphone;

    public PenggunaHandphone(Handphone handphone) {
        this.handphone = handphone;
    }

    void turnOnPhone(){
        this.handphone.powerOn();
    }

    void turnOffPhone(){
        this.handphone.powerOff();
    }

    void turnUpPhone(){
        this.handphone.powerUp();
    }

    void turnDownPhone(){
        this.handphone.powerDown();
    }
}
