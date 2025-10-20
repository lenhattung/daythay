
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.nio.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tungi
 */
public class File_ViDu1 {

    public static boolean checkExists(File f) {
        if (f.exists()) {
            System.out.println(f.getName() + " : Tap tin da ton tai!");
            return true;
        } else {
            System.out.println(f.getName() + " :Tap tin khong ton tai");
            return false;

        }
    }

    public static void mkdirA(File f) {
        try {
            f.mkdirs();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteA(String path) {
        try {
            File file = new File(path);
            // Ton tai
            if (file.exists()) {
                // La tap tin
                if (file.isFile()) {
                    file.delete();
                    return;
                } else {
                    // La thu muc
                    File[] subFileList = file.listFiles();// lay cac tap tin con ben trong
                    if(subFileList.length==0){
                        file.delete();
                        return;
                    }else{
                        for (File subFile : subFileList) {
                            deleteA(subFile.getAbsolutePath());
                        }
                        file.delete();
                    }
                }
            }

        } catch (Exception e) {
        }
    }
    
    public static void deleteB(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.err.println("File không tồn tại: " + path);
            return;
        }

        if (file.isDirectory()) {
            File[] subFiles = file.listFiles();
            if (subFiles != null) { // tránh NullPointerException
                for (File subFile : subFiles) {
                    deleteA(subFile.getAbsolutePath());
                }
            }
        }

        if (!file.delete()) {
            System.err.println("Không thể xóa: " + file.getAbsolutePath());
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\file");
        File file2 = new File("D:\\file\\hoctap");
        File file3 = new File("D:\\file\\giaitri\\game");
        File file4 = new File("D:\\file\\giaitri\\game\\cocaro.exe");

        checkExists(file);
        checkExists(file2);

        mkdirA(file2);
        mkdirA(file3);

        try {
            file4.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(File_ViDu1.class.getName()).log(Level.SEVERE, null, ex);
        }

        deleteB(file.getAbsolutePath());
        
        deleteB("D:\\");
    }
}
