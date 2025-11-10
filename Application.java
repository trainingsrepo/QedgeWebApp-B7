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

  #feature101 code changes by vivek in oct 2025
	public class ScannerExample {

    public static void main(String... args) {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign 
                9 homecoming 1 
                freight car
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(IO::println);
        }
    }
}
#end of feature101

}
