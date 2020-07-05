package builder;

public abstract class WebSiteBuilder {
    WebSite webSite;
    void createWebSite(){
        webSite =  new WebSite();
    }
    abstract void buildCms();
    abstract void buildname();
    abstract void buildPrice();
   abstract WebSite getWebSite();

}
