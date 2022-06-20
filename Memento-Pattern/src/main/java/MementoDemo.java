import domain.Article;
import domain.ArticleMemento;

public class MementoDemo {
    public static void main(String[] args) {
        Article article = new Article(1, "My Article");
        article.setContent("ABC Content");
        System.out.println(article);
        ArticleMemento memento = article.createSnapshot();
        System.out.println("SAVE");
        article.setContent("New Content");
        System.out.println(article);

        System.out.println("UNDO");
        article.restoreSnapshot(memento);
        System.out.println(article);
    }
}
