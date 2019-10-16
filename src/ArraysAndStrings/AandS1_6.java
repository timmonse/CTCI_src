package ArraysAndStrings;

public class AandS1_6 {
    public static void main(String[] args){
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("a"));
        System.out.println(stringCompression("aaaa"));
        System.out.println(stringCompression("ssjdndndnskaaaaakkkkcccclsspppppaaakkkkkkkk"));

    }

    static String stringCompression(String s){
        int count = 1;
        String output = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));

            while((i < s.length() - 1) && (s.charAt(i) == s.charAt(i+1))) {
                count++;
                i++;
            }

            sb.append(count);
            count = 1;
        }
        output = sb.toString();
        if(output.length() >= s.length()){
            return s;
        }
        return output;
    }


}
