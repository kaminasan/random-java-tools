/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetesting;

import java.io.File;
import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author ashikitaALT
 */
public class NonRecursiveDirectoryCopy {

    /**
     * This class will be used to form a file COPY operation, that does NOT rely
     * on recursion. While the recursive option might seem more elegant, and it
     * is definitely easier to write, the possibility of running out of
     * memory(stack space) is real, hence the use of two stacks to simulate
     * recursion, and a simple while loop.
     * Has not been written for wide use, as the start files are fixed. 
     *
     * @param args
     */
    public static void main(String[] args) {
        String sep = File.separator;

        Stack<File> srcStack = new Stack<>();
        Stack<File> destStack = new Stack<>();
        File srcFile = new File("C:" + sep + "Users" + sep + "ashikitaALT" + sep + "Documents" + sep + "HTML");
        File destFile = new File("C:" + sep + "Users" + sep + "ashikitaALT" + sep + "Documents" + sep + "Ruby");
        //prepare the stacks for the first loop iteration
        srcStack.push(srcFile);   //add the src file
        destStack.push(new File(destFile, srcFile.getName())); //create a destination file using the srcFile's name, and the destFile's path
      

        while (!srcStack.empty()) {
             System.out.println("");
              System.out.println("");
           System.out.println("Our Stacks Look like the Following before running through the loop:");
        System.out.println("srcStack: " + srcStack);
        System.out.println("destStack: " + destStack);
            srcFile = srcStack.pop();
            destFile = destStack.pop();

            if (srcFile.isDirectory()) { //if our srcFile is a dir, we need to make sure that the directory is made in the destFile location. 
                if (destFile.exists()) {
                    System.out.println("Sorry, we found a directory that already exists");

                } else {
                    System.out.println("Current File is a directory!");
                    System.out.println("Current Directory Name is: " + srcFile.getName());
                    System.out.println("Src dir is : " + srcFile);
                    System.out.println("Making target dir: " + destFile);
                    destFile.mkdir();
                }

            }
            if (srcFile.isFile()) { //we are attempting to simply copy a file. Do it and get out.
                System.out.println("Simple File detected");
                System.out.println("Now copying from :" + srcFile);
                System.out.println("To: " + destFile);
                return;
            }

            File[] fileList = srcFile.listFiles();
            if (fileList != null) {
                System.out.println("Now checking currentDir" + srcFile + " for contents");
                for (File testFile : fileList) {  //check the contents of the dir/file we popped off the stack we can now add contents to it, as it is our currently selected dir, AND we made it when we popped it off

                    if (testFile.isDirectory()) {
                        //if it is a directory, push it onto the both stacks. Since we have our current srcDir and destDir set to it, it will be the parent of any files
                        System.out.println("Current item is a directory called: " + testFile.getName());
                        System.out.println("Pushing the FILE" + testFile + "to the srcStack");
                        srcStack.push(testFile);
                        
                        System.out.println("SRC STACK LOOKS LIKE: " + srcStack.toString() );
                        File destinationFile = new File(destFile, testFile.getName());
                        System.out.println(" NOW Pushing the FILE" + destinationFile + "to the DEST STACK");
                        destStack.push(destinationFile);
                          System.out.println("DESTSTACK LOOKS LIKE: " + destStack.toString() );
                        
                     
                    } 
                    
                    else {
                        System.out.println("Current item is a normal file called: " + testFile.getName());
                        System.out.println("Copying directly to the destination: " + new File(destFile, testFile.getName()));
                    }

                }

            }
                System.out.println("Finished processing this directory or single file, moving back to the while loop check.");
        }

    }

    public static void out(String printString) {
        System.out.println(printString);
    }
}
