import com.encapsulation.*;

class Main {
    public static void main(String[] args){
        try {
        String workDir = System.getProperty("user.dir") + "/files";
        FileStore store = new FileStore(workDir);
        store.read(1);
        } catch (Exception e){
            
            System.out.println("Oops \n" + e);
        }
    }
}