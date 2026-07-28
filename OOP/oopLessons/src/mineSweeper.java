import java.util.Random;
import java.util.Scanner;

public class MineSweeper { // Sınıf isimleri büyük harfle başlamalı

    int rowNumber, colNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, col;
        prepareGame();
        // Test etmek istersen map'i bastırabilirsin, normal oyunda gizli olmalı:
        print(map);
        System.out.println("Oyun basladi !");

        while(game) {
            print(board);
            System.out.print("Row : ");
            row = scan.nextInt();
            System.out.print("Column : ");
            col = scan.nextInt();

            // Sınır (Bounds) Kontrolü
            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Gecersiz koordinat! Lutfen harita sinirlari icinde bir deger girin.");
                continue; // Döngüyü başa sarar, tekrar girdi ister
            }

            if (map[row][col] != -1) {
                checkMine(row, col);
            } else {
                game = false;
                System.out.println("Mayina bastin! Game Over !");
                print(map); // Oyun bitince mayınların yerini göster
            }
        }
    }

    public void checkMine(int r, int c) {
        if (map[r][c] == 0) {
            int mineCount = 0; // O hücre için ayrı bir sayaç tutmak daha güvenlidir

            // 4 Yön Kontrolü (Hatalar düzeltildi)
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
                mineCount++;
            }
            if ((r < rowNumber - 1) && (map[r + 1][c] == -1)) {
                mineCount++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                mineCount++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                mineCount++;
            }

            if (mineCount == 0) {
                board[r][c] = -2; // Etrafta mayın yoksa özel bir değer (-2) ata
            } else {
                board[r][c] = mineCount;
            }

            // map üzerinde buranın açıldığını işaretleyelim ki tekrar kontrol edilmesin
            map[r][c] = 1;
        }
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;

        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);

            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // Süslü parantezler eklendi ve görünüm düzenlendi
                if (arr[i][j] >= 0) {
                    System.out.print(" " + arr[i][j] + " ");
                } else if (arr[i][j] == -1) { // Mayın
                    System.out.print("*  ");
                } else if (arr[i][j] == -2) { // Boş alan
                    System.out.print("0  ");
                } else { // Varsayılan durum (Henüz açılmamış hücreler için 0 görünüyordu, bunu da dizayn edebilirsin)
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
}