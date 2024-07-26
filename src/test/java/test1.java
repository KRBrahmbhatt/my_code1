import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class test1 {
      @Test
    public void streamFilter()
      {
          ArrayList<String> names = new ArrayList<String>();

          names.add("Abhijit");
          names.add("Don");
          names.add("Aayushi");
          names.add("Ankit");
          names.add("Banana");



            Long C =names.stream().filter(a -> a.startsWith("B")).count();
          System.out.println(C);


      }
      
    public void streamm()
      {
          ArrayList<String> Models = new ArrayList<String>();
          Models.add("Alia");
          Models.add("Rash");
          Models.add("Rk");

           Long A = Models.stream().filter(r-> r.startsWith("R")).count();
          System.out.println(A);


      }
}



