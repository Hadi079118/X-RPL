interface WiFi {  
    void sendData();  
}  

interface Radio {  
    void sendSignal();  
}  

abstract class Computer {  
    String ipAddress;  
    int cpuClock;  
    int memory;  
    int storage;  

    Computer(String ipAddress, int cpuClock, int memory, int storage) {  
        this.ipAddress = ipAddress;  
        this.cpuClock = cpuClock;  
        this.memory = memory;  
        this.storage = storage;  
    }  

    abstract void sendData();  
    abstract void getInfo();  
}  

class Desktop extends Computer implements WiFi {  
    private int battCapacity;  

    Desktop(String ipAddress, int cpuClock, int memory, int storage, int battCapacity) {  
        super(ipAddress, cpuClock, memory, storage);  
        this.battCapacity = battCapacity;  
    }  

    @Override  
    public void sendData() {  
        System.out.println("Controlling data desktop via wifi...");  
    }  

    @Override  
    void getInfo() {  
        System.out.println("Desktop Info: " + ipAddress);  
    }  
}  

class RaspberryPi extends Computer implements WiFi, Radio {  
    private int numSocket;  

    RaspberryPi(String ipAddress, int cpuClock, int memory, int storage, int numSocket) {  
        super(ipAddress, cpuClock, memory, storage);  
        this.numSocket = numSocket;  
    }  

    @Override  
    public void sendData() {  
        System.out.println("Controlling data raspberrypi via wifi...");  
    }  

    @Override  
    public void sendSignal() {  
        System.out.println("Controlling data raspberrypi via radio...");  
    }  

    @Override  
    void getInfo() {  
        System.out.println("RaspberryPi Info: " + ipAddress);  
    }  
}  

class Drone extends Computer implements WiFi, Radio {  
    private int maxSpeed;  
    private int maxAltitude;  

    Drone(String ipAddress, int cpuClock, int memory, int storage, int maxSpeed, int maxAltitude) {  
        super(ipAddress, cpuClock, memory, storage);  
        this.maxSpeed = maxSpeed;  
        this.maxAltitude = maxAltitude;  
    }  

    @Override  
    public void sendData() {  
        System.out.println("Controlling data drone via wifi...");  
    }  

    @Override  
    public void sendSignal() {  
        System.out.println("Controlling data drone via radio...");  
    }  

    @Override  
    void getInfo() {  
        System.out.println("Drone Info: " + ipAddress);  
    }  
}  

class Operator {  
    void wifiControl(WiFi wifiDevice) {  
        wifiDevice.sendData();  
    }  

    void radioControl(Radio radioDevice) {  
        radioDevice.sendSignal();  
    }  
}  

public class tugas14 {  
    public static void main(String[] args) {  
        Operator operator = new Operator();  

        Desktop desktop = new Desktop("192.168.1.2", 3200, 8, 256, 5000);  
        RaspberryPi raspberryPi = new RaspberryPi("192.168.1.3", 1200, 4, 32, 4);  
        Drone drone = new Drone("192.168.1.4", 2500, 8, 512, 50, 300);  

        operator.wifiControl(desktop);  
        operator.wifiControl(raspberryPi);  
        operator.wifiControl(drone);  
        operator.radioControl(raspberryPi);  
        operator.radioControl(drone);  
    }  
}