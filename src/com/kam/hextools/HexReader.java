/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.hextools;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author teacher
 */
public class HexReader {

    private FileInputStream in = null;
    private File useFile = null;
    private byte[] ourBuffer = new byte[16];

    public static void main(String[] args) {
        HexReader myReader = new HexReader();
        myReader.chooseFile();
        myReader.setupFileForReading();
        myReader.fileIntoHex(myReader.getIn(), myReader.getOurBuffer());
    }

    public void fileIntoHex(FileInputStream in, byte[] bufferToUse) {

        try {

            int bytesRead = 0;
            System.out.println("File Output: ");
            StringBuilder builder = new StringBuilder();
            while ((bytesRead = in.read(bufferToUse, 0, bufferToUse.length)) != -1) {
                
                for (int i = 0; i < bytesRead; i++) {
                    char charToPrint;
                      //For the next line: if the char is < 0 it won't be a usable ASCII code for us, so multiply it by -1 to get something useful
                    charToPrint = (bufferToUse[i] < 0) ? (char) (bufferToUse[i] * -1) : (char) bufferToUse[i]; 
                    System.out.print(Integer.toHexString((int) charToPrint).toUpperCase() + " ");
                    builder.append(charToPrint+"  "); //this aligns our HEX BYTES(2chars wide) with the char

                }
                System.out.println("");
                System.out.println(builder);
                builder.delete(0, builder.length());
                
            }
            System.out.println();

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    public void chooseFile() {
        String filePath = null;
         File fileToSet = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a file Path to read the hex:");
        filePath = scanner.next();
        System.out.println("File to read will be:" + filePath);
        fileToSet = new File(filePath);
        
        while (!fileToSet.exists()) {
            System.out.println("ERROR: FILE DOES NOT EXIST OR COULD NOT CREATE FILE Object");
            System.out.println("SELECT FILE: ");
            fileToSet = new File(scanner.next());
        }
        System.out.println("File Set success");
        this.setUseFile(fileToSet);
        scanner.close();
    }

    public void setupFileForReading() {
        try {
            in = new FileInputStream(useFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public FileInputStream getIn() {
        return in;
    }

    public void setIn(FileInputStream in) {
        this.in = in;
    }

    public File getUseFile() {
        return useFile;
    }

    public void setUseFile(File useFile) {
        this.useFile = useFile;
    }

    public byte[] getOurBuffer() {
        return ourBuffer;
    }

    public void setOurBuffer(byte[] ourBuffer) {
        this.ourBuffer = ourBuffer;
    }

}
