package core;

import java.text.*;
import java.util.Date;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.interactions.Action;
// import org.openqa.selenium.interactions.Actions;
// import org.testng.annotations.BeforeTest;
// import org.testng.annotations.Test;

public class OOP {                                               // Object-Oriented Programming

       String name = "Gleb Pichshulin";                                 // Instance Variable

       String dob = "01/01/2001";                                  // Instance Variable

       void print(String param) {System.out.println(param);}     // Instance Void Method

       long age(String param_dob) throws ParseException {       // Instance Method

              SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy"); // Defining date format

              Date date = f.parse(param_dob);                     // Convert String to Date

              long dob_ms = date.getTime();                        // Local Variable (DOB in ms)
              long now_ms = System.currentTimeMillis(); // Local Variable (Current Time in ms)

              return (now_ms - dob_ms) / 31556952000L;         // Returns age
		  }    
	  }