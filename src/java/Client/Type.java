
package Client;

public class Type {
    
    private String name;
    private String url;

//    public Type(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public Type(String name, String url) {
        this.name = name;
        this.url = url;
    }
    
    

    public Type() {
    }

    public String getUrl() {
        return url;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
