public class tugaslinearsecrhel {


    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10};

        int hasil = linearSearch(data, 6);

        if (hasil != -1) {
            System.out.println("Data ditemukan di index: " + hasil);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}