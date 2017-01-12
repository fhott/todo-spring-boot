package app.stringjoin;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

    public static String join(List<String> stringToJoin, CharSequence delimiter, CharSequence prefix, CharSequence suffix) {
        StringJoiner sj = new StringJoiner(delimiter, prefix, suffix);
        stringToJoin.forEach(sj::add);
        return sj.toString();
    }
}
