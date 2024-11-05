package it.unibo.encapsulation;

public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 65536;
    private static final int DEF_RAM_SIZE = 8192;
    private static final int DEF_N_CPU = 8;

    private final int cpuCount;
    private final int ram;
    private final int sdSize;
    private final String brand;
    private final String model;
    private final boolean hasGPS;
    private final boolean has3G;
    private final boolean hasNFC;

    public Smartphone(
        final int cpuCount,
        final int ram,
        final int sdSize,
        final String brand,
        final String model,
        final boolean hasGPS,
        final boolean has3G,
        final boolean hasNFC
    ) {
        this.cpuCount = cpuCount;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(brand, model, DEF_SD_SIZE);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    public String getModel() {
        return this.model;
    }

    public int getCpuCount() {
        return this.cpuCount;
    }
    public int getRam() {
        return this.ram;
    }
    public int getSdSize() {
        return this.sdSize;
    }
    public String getBrand() {
        return this.brand;
    }
    public boolean getHasGPS() {
        return this.hasGPS;
    }
    public boolean getHas3G() {
        return this.has3G;
    }
    public boolean getHasNFC() {
        return this.hasNFC;
    }
    public void setRam(int size) {
        this.ram=size;
    }
    public void setCpu(int numberCpu) {
        this.cpuCount=numberCpu;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public void setBrand(String brand) {
        this.brand=brand;
    }
    public void setSdSize(int size) {
        this.sdSize=size;
    }
    public void setGPS(boolean value) {
        this.hasGPS=value;
    }
    public void set3G(boolean value) {
        this.has3G=value;
    }
    public void setNFC(boolean value) {
        this.hasNFC=value;
    }

    public void printStringRep() {
        System.out.println("n CPU(s): " + cpuCount);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + sdSize);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("hasGPS: " + hasGPS);
        System.out.println("has3G: " + has3G);
        System.out.println("hasNFC: " + hasNFC + "\n");
    }
}
