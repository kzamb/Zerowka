package pl.sages.drugidzien.obiektowe;

public class Article {

    static int counter = 0;

    private int id;
    private String name;
    private String description;
    private Money price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        printChange("id");

    }

    public void setName(String name) {
        this.name = name;
        printChange("name");
    }

    public void setDescription(String description) {
        this.description = description;
        printChange("description");
    }

    public void setPrice(Money price) {
        this.price = price;
        printChange("price");
    }

    public Article(String name, int price) {
        this(name, "Brak opisu", price);
    }

    // alt + insert == generate -> Constructor
    public Article(String name, String description, int price) {
        this(name, description, new Money(price));
    }

    public Article(String name, String description, Money price) {
        counter++;
        this.id = counter;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    private void printChange (String pole) {
        System.out.println("Zmieniono wartość pola: " + pole);
    }


    // psvm
    public static void main(String[] args) {

        Article mleko = new Article("Mleko",
                "Mleko sojowe", 250);

        Article maka = new Article("Mąka",
                "Mąka pszenna 1kg", 199);

        Article jajka = new Article("Jajka", 349);
        Article baton = new Article("Jowisz", 105);
        Article jowisz = baton;

        System.out.println(mleko);
        System.out.println(maka);
        System.out.println(jajka);
        System.out.println(baton);
        System.out.println(Article.counter);

        Order order = new Order(3);
        order.add(mleko);
        order.add(maka);
        order.add(jajka);
        order.add(baton);
        System.out.println(order.toString());
        System.out.println("Łączna wartość zamówienia wynosi "+order.getTotalCost());
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Money getPrice() {
        return price;
    }

    // alt + insert == generate -> toString
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
