/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.polimorphisme;

/**
 *
 * @author M. RAFI DUTA ATTALA
 */
public class LaptopAsus extends Laptop {
    //constructor
    LaptopAsus(String merk)
    {   setMerk(merk);
    merk = null;
    }
    protected void setMerk(String merk){
        this.merk = merk;
        merk = null;
    }
    protected String getMerk(){
        return merk;
    }
    protected void setPemilik(String pemilik)
    { this.pemilik = pemilik;
    pemilik = null;
    }
    protected String getPemilik()
    { return this.pemilik;
    }
    
    protected void tampil()
    { System.out.println(getPemilik()+" memiliki laptop " +getMerk());
    }
    protected void hapus()
    { merk = null;
    pemilik = null;
    }
}
