public class Main
{
    public enum GestureType
     {

        UP(0, "fell"),
        RIGHT(1, "jobb"),
        DOWN(2, "lee"),
        LEFT(3, "bal");

        private int value;
        private String name;

        GestureType(int value, String name)
         {
            this.value = value;
            this.name = name;
         }

        public int getValue()
         {
            return this.value;
         }

        public String getName()
         {
            return this.name;
         }

     }

    public static void main(String[] args)
     {
        for(GestureType type: GestureType.values())
         {
            System.out.println(type.name() + "\t----->\t" + type.getValue() + "\t----->\t" + type.getName());
         }

     }
}