public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        //Adventure jaws = new Adventure("A", "Jaws"); this is not working properly
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        // comedy.watchMovie(); // this is not working
        // comdey.watchComedy(); // this is also not working even though created method

        // this is also not working
//        Movie comedyMovie = (Movie) comedy;
//        comedyMovie.watchComedy();

        // we have to case more specific
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        // var is a special contextual keyword in Java, that lets our code take advantage of Local
        // Variable Type Inference
        // By using var as the type, we're telling Java to figure out the compile-time type for us
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // LVTI (Local Variable Type Inference)
        // it can't be used in field declarations on a class
        // it can't be used in method signatures, either as a parameter type or a return type
        // it can't be used without an assignment, because the type can't be inferred in that case
        // it can't be assigned a null literal, again because a type can't be inferred in that case


        // instanceof operator lets you test type of an object or instance
        // the reference variable you are testing is the left operand
        // the type you are testing for is the right operand
        // it's important to see that Adventure is not in quotes meaning we're not testing the type name, but the actual type
        // This operator returns true, if unknownObject is an instance of Adventure

        // if the JVM can identify that the object matches the type, it can extract data from the object, without casting
        // For this operator, the object can be assigned to a binding variable, which here is called syfy
        // the variable syfy (if the instanceof method returns ture) is already typed as a ScienceFiction variable

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}
