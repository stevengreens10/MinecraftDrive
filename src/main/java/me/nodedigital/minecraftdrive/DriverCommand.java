package me.nodedigital.minecraftdrive;

public class DriverCommand {

    /** Read or write request */
    public CommandType type;
    /** Offset to read/write from */
    public int offset;

    /** Amount of data to read/write*/
    public int len;


    /** Data provided (only for write) */
    public byte[] data;

    public enum CommandType {
        READ,
        WRITE

    }

}
