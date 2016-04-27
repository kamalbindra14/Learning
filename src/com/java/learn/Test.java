package com.java.learn;

public class Test {

  public static void main(String[] args) {
    checkisShortcutKeyValid("1=|2=0|3=", "2");
  }

  public static String checkisShortcutKeyValid(final String shortcutKey,
    final String input) {
    String response = "Error305";
    if (shortcutKey.contains(input)) {
      final String[] str = shortcutKey.split("\\|");
      for (int i = 0; i < str.length; i++) {
        if (str[i].contains(input) && str[i].split("=")[1].equals(input)) {
          response = String.valueOf(i + 1);
          break;
        }
      }
    }
    return response;
  }

}
