package ethereum.ckzg4844;

public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("开始加载jni");
      CKZG4844JNI.loadNativeLibrary();

      // once a trusted setup is loaded, all methods will use it
      System.out.println("开始加载文件");
      String path = "trusted_setup.txt";
      CKZG4844JNI.loadTrustedSetup(path, 0);
      System.out.println("加载文件成功");
    } catch (Exception e) {
      System.out.println("正常报错!");
      throw e;
    }
    System.out.println("正常结束");
  }
}