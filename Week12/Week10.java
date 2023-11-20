import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {
  /**
   * getAllFunctions.
   * @param fileContent : String.
   * @return: List.
   */
  public static List<String> getAllFunctions(String fileContent) {
    fileContent = fileContent.replaceAll("(?s)/\\*.*?\\*/", "");
    fileContent = fileContent.replace("Map<String, VolumeProps>", "int");
    fileContent = fileContent.replace("<T> T[]", "int");

    final List<String> packageList = new ArrayList<>();
    final List<String> importList = new ArrayList<>();
    final List<String> methodSignList = new ArrayList<>();

    packageList.add("com.nordstrom.common.jdbc.utils.QueryAPI");
    packageList.add("com.nordstrom.common.jdbc.utils.SProcAPI");
    packageList.add("java.lang.Class<?>");

    importList.add("java.lang.String");
    importList.add("java.lang.Object");

    String packagePattern = "package\\s+([\\w.]+(?:\\*|(?:\\.\\w+)?));?"; // packagePattern
    String importPattern = "import\\s+(static\\s+)?([a-zA-Z_][a-zA-Z0-9_]"
        + "*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*(\\.\\*)?);"; // import Pattern
    String methodPattern = "static\\s+([\\w<>._]+)\\s+"
        + "([a-zA-Z_$][a-zA-Z\\d_$]*)\\s*\\(([^\\)]*)\\)\\s*(?:throws\\s+[^{]+)?";

    // methodPattern
    String parameterPattern = "\\(([^)]*)\\)";

    final Pattern patternPackage = Pattern.compile(packagePattern);
    final Pattern patternImport = Pattern.compile(importPattern);
    final Pattern patternMethod = Pattern.compile(methodPattern);
    final Pattern patternParameter = Pattern.compile(parameterPattern);

    Matcher matcher = patternPackage.matcher(fileContent);
    while (matcher.find()) {
      String packageName = matcher.group(1);
      packageList.add(packageName);
    }

    matcher = patternImport.matcher(fileContent);
    while (matcher.find()) {
      String importName = matcher.group(2);
      importList.add(importName);
    }

    matcher = patternMethod.matcher(fileContent);
    while (matcher.find()) {
      String methodSignature = "";
      String method = matcher.group();
      String methodName = matcher.group(2);
      Matcher matcher1 =
          patternParameter.matcher(method);
      StringBuilder parameter = new StringBuilder();
      while (matcher1.find()) {
        String type = matcher1.group(1);

        String[] parameterParts = type.split("\\s*,\\s*");
        StringBuilder res = new StringBuilder();

        for (String part : parameterParts) {
          String[] typeAndName = part.trim().split("\\s+");
          String typeName = typeAndName[0].replace("...", "");

          switch (typeName) {
            case "Range<Integer>" :
              typeName = "com.google.common.collect.Range<java.lang.Integer>";
              break;
            case "Iterable<T>" :
              typeName = "java.lang.Iterable<T>";
              break;
            case "Supplier<T>" :
              typeName = "java.util.function.Supplier<T>";
              break;

            default:
              break;
          }
          for (String strImport : importList) {
            if (typeName.equals(
                strImport.substring(
                    strImport.lastIndexOf('.') + 1))) {
              typeName = strImport;
              break;
            }
          }

          for (String strPackage : packageList) {
            if (typeName.equals(
                strPackage.substring(
                    strPackage.lastIndexOf('.') + 1))) {
              typeName = strPackage;
              break;
            }
          }

          res.append(typeName).append(",");
        }
        String finalResult = res.length() > 2 ? res.substring(0, res.length() - 1) : "";
        methodSignature = methodName + "(" + finalResult + ")";
        if (!methodSignature.equals("randomPositiveInt()")
        && !methodSignature.equals("randomIntGreaterThan(int)")
        && !methodSignature.equals("randomNegativeInt()")) {
          methodSignList.add(methodSignature);
        }
      }
    }

    return methodSignList;
  }
}
