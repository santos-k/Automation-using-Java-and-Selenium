import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

// Program not working.............................................................
public class DigestAuth {
    public static void main(String[] args) {
        // Replace with your actual credentials and URL
        String username = "admin";
        String password = "admin";
        String url = "https://the-internet.herokuapp.com/digest_auth";

        try {
            // Create a URL object
            URL requestUrl = new URL(url);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();

            // Encode the username and password
            String credentials = username + ":" + password;
            String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes(StandardCharsets.UTF_8));

            // Set the Authorization header with the encoded credentials
            connection.setRequestProperty("Authorization", "Digest " + encodedCredentials);

            // Send the request and get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read and print the response content
            InputStream inputStream = connection.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.write(buffer, 0, bytesRead);
            }
            inputStream.close();

            // Disconnect the connection
            connection.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
