public class DebugBox
{
   private int width;
   private int length;
   private int height;

   private static void FixDebugBox() {
      int length = 1;
      int width = 1;
      int height = 1;
   }
   public DebugBox(int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData() {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume() {
     double vol = length * width * height;
     return vol;
   }
}
