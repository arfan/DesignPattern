package xyz.kmbmicro.designpattern.facadepattern;/* Facade */

class ComputerFacade {
    public static final long BOOT_ADDRESS = 0l;
    public static final long BOOT_SECTOR = 0l;
    public static final int SECTOR_SIZE = 0;
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}