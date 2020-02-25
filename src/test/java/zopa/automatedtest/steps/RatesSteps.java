package zopa.automatedtest.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import zopa.automatedtest.pages.RatesPage;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RatesSteps extends BaseSteps {

    private RatesPage ratesPage = new RatesPage();

    @And("gets a personalized rates")
    public void getsPersonalizedRates() {

            Faker faker = new Faker(new Locale("en-GB"));

            Date dateOfBirth = faker.date().birthday(18, 65);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateOfBirth);

            ratesPage.SelectLoanCar();
            ratesPage.typeEmailAddress(faker.internet().emailAddress());
            ratesPage.selectTitleMr();
            ratesPage.typeFirstName(faker.name().firstName());
            ratesPage.typeLastName(faker.name().lastName());
            ratesPage.typeDayOfBirth(String.valueOf(cal.get(Calendar.DAY_OF_MONTH)));
            ratesPage.typeMonthOfBirth(String.valueOf(cal.get(Calendar.MONTH)));
            ratesPage.typeYearOfBirth(String.valueOf(cal.get(Calendar.YEAR)));
            ratesPage.typePhoneNumber(faker.phoneNumber().phoneNumber());
            ratesPage.typePostCode(faker.address().zipCode());
    }



}
