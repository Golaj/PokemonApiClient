package model;


public class Pokis {
    
    private String name;
    private String url;

    public Pokis() {
    }

    public Pokis(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "\n"
                + "name = " + name + "\n"
                + "ID = " + url.substring(34, url.length()-1) + "\n";
    }
        
    
  
    
    
}
