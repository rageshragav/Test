package testrunpck;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate)); //2016/11/16
		
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.now();
		//System.out.println(dtf.format(localDate)); //2016/11/16
		driver.findElement(By.id("endDate")).click();
		String date = driver.findElement(By.id("endDate")).getText();
		Assert.assertTrue("Text not found!",date.contains(dtf.format(localDate)));

		/*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = new Date();
		String date1= dateFormat.format(dt);
		Assert.assertTrue("Text not found!",date.contains(date1.toString()));*/
	}

}
