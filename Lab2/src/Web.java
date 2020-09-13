import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Web {
	
	public static void main(String[] args) {
		try {																	
			URL url = new URL ("https://jsonplaceholder.typicode.com/posts"); //create URL object of fake online rest API site
			HttpURLConnection hr = (HttpURLConnection)url.openConnection();  //Returns a URLConnection instance that represents a connection to the remote object referred to by the URL
			if(hr.getResponseCode()==200) {									//if  HTTP response message is 200
				InputStream ss = hr.getInputStream();						//Returns an input stream that reads from this open connection
				
				BufferedReader br = new BufferedReader(new InputStreamReader(ss));			//create a buffer reader object to read content from the URLconnection
				String line = br.readLine();												//create line variable hold content read from the URL
				while(line!=null) {            //if the content isn't null read line and print line
					System.out.println(line);
					line = br.readLine();
				}
				br.close();
			}
		} catch (Exception e) {                                       //if error occur print eror message
			System.out.println(e);
		}
	}
}