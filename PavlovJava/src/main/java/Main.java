import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main (String [] args){
        String text= "In meteorology, precipitation is any product of the condensation of atmospheric water vapor that falls under gravity. " +
                "The main forms of precipitation include drizzle, rain, sleet, snow, graupel and hail. " +
                "Precipitation forms as smaller droplets coalesce via collision with other rain drops or ice crystals within a cloud. " +
                "Short, intense periods of rain in scattered locations are called showers";
        String qu= "Where do water droplets collide with ice crystals to form precipitation?";


        WorkWithModel work = new WorkWithModel();

        System.out.println(work.askQuestion(text,qu));

    }
}
