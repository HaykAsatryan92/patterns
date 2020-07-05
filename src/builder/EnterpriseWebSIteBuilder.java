package builder;

public class EnterpriseWebSIteBuilder  extends  WebSiteBuilder{
    @Override
    void buildCms() {
        webSite.setCms(Cms.AliFresco);
    }

    @Override
    void buildname() {
webSite.setName("Enterprice website");
    }

    @Override
    void buildPrice() {
webSite.setPrice(10000);
    }

    @Override
    WebSite getWebSite() {
        return webSite;
    }
}
