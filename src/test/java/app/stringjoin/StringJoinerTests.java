package app.stringjoin;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerTests {

    @Test
    public void joinAStringPassingDelimiterPrefixAndSuffix() {
        StringJoiner sj = new StringJoiner(":", "{", "}");
        List<String> strings = Arrays.asList("Presepa", "OOOOO RAUNY", "Silver", "Vandim", "Igo", "Hott", "Zonta meu bom", "#maycongarante");
        strings.forEach(sj::add);
        System.out.println(sj.toString());
    }

    @Test
    public void joinAStringPassingOnlyDelimiter() {
        StringJoiner sj = new StringJoiner(":");
        List<String> strings = Arrays.asList("Presepa", "OOOOO RAUNY", "Silver", "Vandim", "Igo", "Hott", "Zonta meu bom", "#maycongarante");
        strings.forEach(sj::add);
        System.out.println(sj.toString());
    }
}
