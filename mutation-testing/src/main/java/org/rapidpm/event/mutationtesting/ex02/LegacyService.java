package org.rapidpm.event.mutationtesting.ex02;

public class LegacyService {

  //TODO do not change anything here !!
  public static final String[] discardCommonPrefix(String a , String b) {
    String[] ret = {a , b};
    int l = a.length() < b.length() ? a.length() : b.length();

    for (int i = 0; i < l; i++) {
      if (a.charAt(i) == b.charAt(i)) {
        if (i + 1 < l) {
          ret[0] = a.substring(i + 1);
          ret[1] = b.substring(i + 1);
        } else {
          if (a.length() < b.length()) {
            ret[0] = "";
            ret[1] = b.substring(i + 1);
          }
          if (a.length() == b.length()) {
            ret[0] = "";
            ret[1] = "";
          }
          if (a.length() > b.length()) {
            ret[0] = a.substring(i + 1);
            ret[1] = "";
          }
        }
      } else
        break;
    }
    return ret;
  }

}



