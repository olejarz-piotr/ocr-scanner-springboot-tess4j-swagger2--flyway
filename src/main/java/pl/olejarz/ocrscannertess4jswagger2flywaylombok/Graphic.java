package pl.olejarz.ocrscannertess4jswagger2flywaylombok;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Graphic {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    public Graphic() {
    }


    private String url;

    private String content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
