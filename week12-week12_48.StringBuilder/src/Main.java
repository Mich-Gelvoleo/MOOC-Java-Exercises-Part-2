
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        for(int i = 0; i<t.length; i++){
                if((i + 1) % 4 == 0 && i != 0 && i != t.length - 1){
                    sb.append(t[i]).append(", \n");
                }else if(i % 4 == 0){
                    if(i != t.length - 1){
                        sb.append(" ").append(t[i]).append(", ");
                    }else{
                        sb.append(" ").append(t[i]).append("\n");
                    }
                }else if(i == t.length - 1){
                    sb.append(t[i]).append("\n");
                }
                else{
                    sb.append(t[i]).append(", ");
                }

        }
        sb.append("}\n");
        
        String string = sb.toString();
        return string;
    }
}
