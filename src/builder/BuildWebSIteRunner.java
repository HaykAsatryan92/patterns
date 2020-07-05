package builder;

public class BuildWebSIteRunner {
    public static void main(String[] args) {
        Director director =  new Director();
        director.setBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite =  director.buildWebsite();
        System.out.println(webSite);


    }

}
