    public class operatorstring10 {
        public static void main(String[] args) {
            String kalimat = "saya memancing ikan di sungai menggunakan pancingan yang panjang bersama teman saya yang berasal dari malang";
    
            String[] kataAsli = {"memancing", "sungai", "teman", "malang"};
            String[] kataPengganti = {"menjaring", "laut", "saudara", "surabaya"};
    
            for (int i = 0; i < kataAsli.length; i++) {
                kalimat = kalimat.replace(kataAsli[i], kataPengganti[i]);
            }
    
            System.out.println("Kalimat setelah diubah:");
            System.out.println(kalimat);
        }
    }
