// UniqueCharacter.java
// (C) 2014 kmaune0
// Implement an algorithm to determine if a string has all unique
// characters. Problem 1.1

import java.util.HashSet;

public class UniqueCharacter {

  public static boolean isCharacterUnique(String str) {
    HashSet<Character> charCount = new HashSet<Character>();

    for(int i = 0; i < str.length(); i++) {
      if(charCount.contains(str.charAt(i))) {
        return false;
      }

      else {
        charCount.add(str.charAt(i));

      }
    }
    return true;

  }
}
