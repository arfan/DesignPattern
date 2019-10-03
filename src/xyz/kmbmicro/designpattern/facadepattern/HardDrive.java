package xyz.kmbmicro.designpattern.facadepattern;

class HardDrive {
    public byte[] read(long lba, int size) {
        return new byte[1];
    }
}
