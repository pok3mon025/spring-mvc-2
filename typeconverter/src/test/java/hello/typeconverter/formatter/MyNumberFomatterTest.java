package hello.typeconverter.formatter;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class MyNumberFomatterTest {

    MyNumberFomatter formatter = new MyNumberFomatter();

    @Test
    void parse() throws ParseException {
        Number result = formatter.parse("1,000", Locale.KOREA);
        assertThat(result).isEqualTo(1000L); //Long 타입 주의
    }

    @Test
    void print() {
        String result = formatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000"); //Long 타입 주의
    }
}
