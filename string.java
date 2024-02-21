public class string 
{
        public static void main(String[] args) 
        {
            String str1 = new String();
            String str2 = new String("Hello, World!");
            char[] charArray = {'J', 'a', 'v', 'a'};
            String str3 = new String(charArray);
            byte[] byteArray = {65, 66, 67, 68};
            String str4 = new String(byteArray);
            System.out.println("str1: " + str1);
            System.out.println("str2: " + str2);
            System.out.println("str3: " + str3);
            System.out.println("str4: " + str4);
            String originalString = "Java Programming";
            int length = originalString.length();
            System.out.println("Length of the string: " + length);
            char charAtIndex = originalString.charAt(2);
            System.out.println("Character at index 2: " + charAtIndex);
            String substring = originalString.substring(5, 16);
            System.out.println("Substring from index 5 to 15: " + substring);
            int indexOf = originalString.indexOf("Programming");
            System.out.println("Index of 'Programming': " + indexOf);
            String concatString = originalString.concat(" is fun!");
            System.out.println("Concatenated string: " + concatString);
            String replacedString = originalString.replace("Java", "Python");
            System.out.println("String after replacement: " + replacedString);
            String upperCaseString = originalString.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseString);
            String lowerCaseString = originalString.toLowerCase();
            System.out.println("Lowercase string: " + lowerCaseString);
            String stringWithSpaces = "   Trim Example   ";
            String trimmedString = stringWithSpaces.trim();
            System.out.println("Trimmed string: '" + trimmedString + "'");
        }

}