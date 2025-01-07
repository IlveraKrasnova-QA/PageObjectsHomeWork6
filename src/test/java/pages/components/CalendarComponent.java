package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void setDate (String day, String month, String year) {
        $("[class=react-datepicker__month-select]").selectOption("February");
        $("[class=react-datepicker__year-select]").selectOption("1999");
        $("[class~=react-datepicker__day--002").click();

    }
}
