import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("/home/manikanta/basicjavaPE.txt");    
             fout.write(65);
             byte b[] =  {65,72,82};
             fout.write(b);
             fout.flush();
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  