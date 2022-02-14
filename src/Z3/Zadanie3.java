package Z3;
import  java.io.File;
import  java.io.FileFilter;

class Zadanie3 {
   static File[] podkatalogi1(String katalog){
       return new File(katalog).listFiles(pathname -> pathname.isDirectory());
   }
   static File[] podkatalogi2(String katalog){
       return new File(katalog).listFiles(new FileFilter() {
           @Override
           public boolean accept(File pathname) {
               return pathname.isDirectory();
           }
       });
   }
   public static void main(String[] args) {
       for(File f : podkatalogi1(".")) System.out.println((f.getName()));
       for(File f : podkatalogi2(".")) System.out.println((f.getName()));
   }
}