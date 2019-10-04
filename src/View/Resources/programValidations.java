package View.Resources;

import static java.lang.Double.isNaN;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ocruz
 */
public class programValidations {

    public boolean checkFilled(ArrayList<String> text) {
        for (String s : text) {
            if (s.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfString(ArrayList<String> strings) {
        for (String s : strings) {
            if (!s.matches("^[ A-Za-z\\-]+$")) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfNumber(ArrayList<String> numbers) {
        for (String s : numbers) {
            if (!s.matches("^[0-9]\\d*$")) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfDate(ArrayList<String> dates) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        for (String s : dates) {
            try {
                format.parse(s);
            } catch (ParseException e) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfTime(ArrayList<String> times) {
        for (String s : times) {
            if (!s.matches("(?:[0-1][0-9]|2[0-4]):[0-5]\\d")) {
                return false;
            }
        }
        return true;
    }
}
