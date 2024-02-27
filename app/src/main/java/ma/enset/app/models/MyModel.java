package ma.enset.app.models;

public class MyModel {
    private String title;
    private String Content;

    public MyModel(String title, String content) {
        this.title = title;
        Content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
