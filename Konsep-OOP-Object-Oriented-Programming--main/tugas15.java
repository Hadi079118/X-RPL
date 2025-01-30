import java.util.Scanner;  

interface Control {  
    void pindahChannel(int channelIndex);  
    void perbesarVolume();  
    void perkecilVolume();  
}  

class Samsung implements Control {  
    private int volume;  
    private String[] channels = {"SCTV", "RCTI", "TRANS 7", "MNCTV", "NET."};  
    private int currentChannel;  

    public Samsung() {  
        this.volume = 10; 
        this.currentChannel = 0;  
    }  

    @Override  
    public void pindahChannel(int channelIndex) {  
        if (channelIndex >= 0 && channelIndex < channels.length) {  
            currentChannel = channelIndex;  
            System.out.println("TV Samsung pindah channel ke: " + channels[currentChannel]);  
        } else {  
            System.out.println("Channel tidak valid.");  
        }  
    }  

    @Override  
    public void perbesarVolume() {  
        volume++;  
        System.out.println("Volume TV Samsung: " + volume);  
    }  

    @Override  
    public void perkecilVolume() {  
        if (volume > 0) {  
            volume--;  
            System.out.println("Volume TV Samsung: " + volume);  
        } else {  
            System.out.println("Volume sudah pada batas minimum.");  
        }  
    }  
}  

class Polytron implements Control {  
    private int volume;  
    private String[] channels = {"SCTV", "RCTI", "TRANS 7", "MNCTV", "NET."};  
    private int currentChannel;  

    public Polytron() {  
        this.volume = 10; 
        this.currentChannel = 0; 
    }  

    @Override  
    public void pindahChannel(int channelIndex) {  
        if (channelIndex >= 0 && channelIndex < channels.length) {  
            currentChannel = channelIndex;  
            System.out.println("TV Polytron pindah channel ke: " + channels[currentChannel]);  
        } else {  
            System.out.println("Channel tidak valid.");  
        }  
    }  

    @Override  
    public void perbesarVolume() {  
        volume++;  
        System.out.println("Volume TV Polytron: " + volume);  
    }  

    @Override  
    public void perkecilVolume() {  
        if (volume > 0) {  
            volume--;  
            System.out.println("Volume TV Polytron: " + volume);  
        } else {  
            System.out.println("Volume sudah pada batas minimum.");  
        }  
    }  
}  

// Kelas RemoteControl untuk mengatur TV  
class RemoteControl {  
    private Control tv;  

    public void setTV(Control tv) {  
        this.tv = tv;  
    }  

    public void controlTV(int menu, int value) {  
        switch (menu) {  
            case 1: 
                tv.pindahChannel(value);  
                break;  
            case 2: 
                tv.perbesarVolume();  
                break;  
            case 3:  
                tv.perkecilVolume();  
                break;  
            default:  
                System.out.println("Menu tidak valid.");  
        }  
    }  
}  

public class tugas15 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        RemoteControl remote = new RemoteControl();  

        System.out.println("Menu :");  
        System.out.println("1. Pindah Channel");  
        System.out.println("2. Perbesar Volume");  
        System.out.println("3. Perkecil Volume");  
        System.out.print("Masukkan pilihan menu: ");  
        int menu = scanner.nextInt();  

        System.out.println("Pilihan TV :");  
        System.out.println("1. Samsung");  
        System.out.println("2. Polytron");  
        System.out.print("Pilih TV (1/2): ");  
        int tvChoice = scanner.nextInt();  

        if (tvChoice == 1) {  
            remote.setTV(new Samsung());  
        } else if (tvChoice == 2) {  
            remote.setTV(new Polytron());  
        } else {  
            System.out.println("Pilihan TV tidak valid.");  
            scanner.close();  
            return;  
        }  

        if (menu == 1) { 
            System.out.print("Masukkan Channel [0 - 4]: ");  
            int channel = scanner.nextInt();  
            remote.controlTV(menu, channel);  
        } else if (menu == 2) { 
            remote.controlTV(menu, 0); 
        } else if (menu == 3) { 
            remote.controlTV(menu, 0);  
        } else {  
            System.out.println("Menu tidak valid.");  
        }  

        scanner.close();  
    }  
}