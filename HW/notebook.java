package Seminar6.HW;

public class notebook {
    int ram;
    int ssd;
    String os;
    String color;
    String name;

    public notebook(String name, String os, int ram, int ssd, String color) {
        this.name = name;
        this.os = os;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
    }
    public String strnote(){
        return String.format("name: %s, os: %s, ram: %d ГБ, ssd: %d ГБ, color: %s", name, os, ram, ssd, color);
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
