import java.util.Stack;

public class stack{
    public static void main(String[] args){
        Stack<String> stac = new Stack<String>();

        stac.push("Minecraft");
        stac.push("Skyrim");
        stac.push("DOOM");
        stac.push("Halo");

        stac.pop();
        stac.pop();

        System.out.println(stac);

    }
}