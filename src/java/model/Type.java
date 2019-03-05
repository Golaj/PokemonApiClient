
package model;

public class Type {
    
    private String name;
    private String url;

    public Type(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Type() {
    }

//    @Override
    public String getUrl() {
        return url;
    }

//    @Override
    public void setUrl(String url) {
        this.url = url;
    }

//    @Override
    public String getName() {
        return name;
    }

//    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    
}
