import enums.Gender;
import models.CodeReview;
import models.Manager;
import models.PersonDetails;

import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StoreApp {
   static Executor executor = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
//        PersonDetails manager = new Manager("Janet", "Kalu", "08083830333", 30, Gender.FEMALE, UUID.randomUUID().toString());


        CodeReview codeReview = new CodeReview(true, true);

//        System.out.println(codeReview.doCodeReview());


        executor.execute(()-> System.out.println(codeReview.doCodeReview()));



    }
}
