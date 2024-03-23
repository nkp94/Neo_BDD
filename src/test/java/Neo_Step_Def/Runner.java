package Neo_Step_Def;

import cucumber.api.cli.Main;

public class Runner {
    public static void main(String[] args) {
//        Main.main(new String[] {
//                "--glue",
//                "Neo_Step_Def",
//                ".\\src\\test\\resources\\featuresNeo\\Neo.feature"
//        });

        run(args);
    }

    public static void run(String [] strings ) {
//		  Main.main(new String[]{
//		            "--glue",
//		            "rahulshettyacademy.stepDefinitions", // the package which contains the glue classes
//		            ".\\src\\test\\java\\cucumber\\SubmitOrder.feature"}
//		        );

        Main.main(strings);
    }
}
