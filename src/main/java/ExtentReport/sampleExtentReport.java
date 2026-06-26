package ExtentReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleExtentReport {

    public void sampleReport(){
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setReportName("My sample Report");
        spark.config().setDocumentTitle("My first Extent Report");
        extent.attachReporter(spark);

        ExtentTest LoginTest=extent.createTest("Facebook Login Test");
        LoginTest.info("Passing user name");
        LoginTest.info("Passing password");
        LoginTest.info("Click Submit button");
        LoginTest.pass("Test Success");

        ExtentTest homePageTest=extent.createTest("Facebook HomePage Test");
        homePageTest.pass("Enter to Facebook HomePage");
        homePageTest.info("Click on profile");
        homePageTest.fail("Test failed...");

        extent.flush();
    }
}
