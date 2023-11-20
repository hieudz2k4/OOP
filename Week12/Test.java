import java.util.regex.*;

public class Test {
  public static void main(String[] args) {
    String input1 = "public static Duration randomPositiveDuration()";
    String input2 = "public static Map<String, VolumeProps> getVolumeProps() throws IOException";

    Pattern pattern = Pattern.compile("\\b(\\w+(?:\\s*<[^>]+>)?)\\s+(\\w+)\\s*\\(([^)]*)\\)\\s*(?:throws\\s+([\\w.]+(?:\\s*,\\s*[\\w.]+)*))?");

    Matcher matcher1 = pattern.matcher(input1);
    Matcher matcher2 = pattern.matcher(input2);

    processMatch(matcher1);
    processMatch(matcher2);
  }

  private static void processMatch(Matcher matcher) {
    if (matcher.find()) {
      String returnType = matcher.group(1);
      String methodName = matcher.group(2);
      String parameters = matcher.group(3);
      String throwsClause = matcher.group(4);

      System.out.println("Return Type: " + returnType);
      System.out.println("Method Name: " + methodName);
      System.out.println("Parameters: " + parameters);
      if (throwsClause != null) {
        System.out.println("Throws: " + throwsClause);
      }
      System.out.println();
    }
  }
}
