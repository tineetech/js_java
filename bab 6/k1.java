class namasuperclass {
    //body kelas
}

class namasubclass extends namasuperclass {
    //body kelas
}
/////////////////////////////////////
public class PersegiPanjang {
private int panjang;
private int lebar;

public void setPanjang (int p) {
panjang = p;
}
public void setLebar (int l) {
lebar = l;
}
public int getPanjang() {
return panjang;
}
public int getLebar () {
return lebar;
}
public int Luas() {
int luas = panjang * lebar;
return luas;
    }
}