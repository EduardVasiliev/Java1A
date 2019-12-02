package ManipulareString;
public class Ex {
    public static void main(String[] args){
        String s1 = "Hello World";
        String s2 = "Hello World Again";
        String s3 = "World";
        
        System.out.println(s1.charAt(0));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s2.contains(s1));
        System.out.println(s1.endsWith(s3));
        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.isEmpty());
        
        String str = "String1-String2";
        String parts[] = str.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        System.out.print(part1 + " " + part2);
        
    }
}