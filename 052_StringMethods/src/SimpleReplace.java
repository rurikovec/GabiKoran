public class SimpleReplace {
    public static void main(String... args){
        String example = "In a dishwasher far far away";

        //example.replace("dishwasher", "galaxy");
        String exampleReplaced = example.replace("dishwasher", "galaxy");
        example = exampleReplaced;
        // I would like to replace "dishwasher" with "galaxy" in this example, but it has a problem.
        // Please fix it for me!
        // Expected output: In a galaxy far far away

        System.out.println(example);
    }
}