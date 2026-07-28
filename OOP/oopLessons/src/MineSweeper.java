import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

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

        // Kullanıcıya gösterilecek tahtanın (board) başlangıç ayarı (-3 açılmamış hücre)
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                this.board[i][j] = -3;
            }
        }
    }

    public void run() {
        int row, col;
        prepareGame();

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
                continue;
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
            int mineCount = 0;

            // 4 Yön Kontrolü
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
                board[r][c] = mineCount; // Etraftaki mayın sayısını ata
            }

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
                if (arr[i][j] == -3) { // Henüz açılmamış hücre
                    System.out.print("-  ");
                } else if (arr[i][j] >= 0) { // Açılmış ve etrafındaki mayın sayısı
                    System.out.print(arr[i][j] + "  ");
                } else if (arr[i][j] == -1) { // Mayın
                    System.out.print("*  ");
                } else if (arr[i][j] == -2) { // Etrafında hiç mayın olmayan boş alan
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
}