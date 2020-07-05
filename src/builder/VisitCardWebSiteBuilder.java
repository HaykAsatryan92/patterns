package builder;

public class VisitCardWebSiteBuilder  extends WebSiteBuilder{
    @Override
    void buildCms() {
        webSite.setCms(Cms.WordPress);

    }

    @Override
    void buildname() {
webSite.setName("Visit Card webSIte");
    }

    @Override
    void buildPrice() {
webSite.setPrice(500);
    }

    @Override
    WebSite getWebSite() {
      return webSite;
    }
}
