package lex.tests.http;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTests {
    @Test
    public void lexHomepageStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.lexingtonlaw.com");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void lexLandingPageStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.lexingtonlaw.com/l/credit-snapshot");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void lexSignupStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.lexingtonlaw.com/signup");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void lexSnapshotStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.lexingtonlaw.com/credit-snapshot/pi");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void creditRepairStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.creditrepair.com");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void creditRepairLandingPageStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.creditrepair.com/b/credit-snapshot");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void creditRepairSignupStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.creditrepair.com/signup");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }

    @Test
    public void creditRepairSnapshotStatusCodeIsOk() throws IOException {
        URL obj = new URL("https://www.creditrepair.com/credit-snapshot/pi");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        Assert.assertEquals(200, responseCode);
    }
}
