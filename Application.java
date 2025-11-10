public class MultipleClassesInSameFile {
    public static void main(String[] args) {
 
        IO.println(GenerateMessage.generateMessage());
        IO.println(AnotherMessage.generateAnotherMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
	#feature102 code changes by Ethan in Oct 2025
	public class MultipleClassesInSameFile {
    public static void main(String[] args) {
 
        IO.println(GenerateMessage.generateMessage());
        IO.println(AnotherMessage.generateAnotherMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}
#end of feature102 code changes
}
