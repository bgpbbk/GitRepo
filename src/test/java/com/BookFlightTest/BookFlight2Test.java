package com.BookFlightTest;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.BookFlight.BookFlight2;
import com.commonTest.TestBase;

public class BookFlight2Test extends TestBase {

	@Test
	public void BookFlightTest2way() throws IOException {

		BookFlight2 bkFlight = new BookFlight2(getDriver1());
		bkFlight.navigateToSite();
		bkFlight.Bookticket("Hyderabad", "New Delhi");

	}

}
