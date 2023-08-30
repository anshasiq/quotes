package quotes;

import java.util.ArrayList;

public class Quote {
//
    private String qotd_date;
    Quots_info quote  ;

    public String getQotd_date() {
        return qotd_date;
    }
    public Quots_info getquote() {
        return quote;
    }



    @Override
    public String toString() {
        return "Quote{" +
                "qotd_date='" + qotd_date + '\'' +
                ", o=" + quote +
                '}';
    }
}
