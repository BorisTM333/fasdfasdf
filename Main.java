class Product {
    private String name;
    private String category;
    private double price;
    private int stockQuantity;
    private String supplierEmail;

    public Product(String name, String category, double price, int stockQuantity, String supplierEmail) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.supplierEmail = supplierEmail;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void restock(int quantity) {
        stockQuantity += quantity;
        System.out.println("Uzupełniono zapasy o " + quantity + " sztuk.");
    }

    public void sell(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
            System.out.println("Sprzedano " + quantity + " sztuk.");
        } else {
            System.out.println("Niewystarczająca ilość w magazynie.");
        }
    }
}

class InventoryManager extends Product {
    private String department;
    private int managedProductsCount;
    private boolean isLoggedIn;

    public InventoryManager(String department, int managedProductsCount, boolean isLoggedIn, String name, String category, String supplierEmail, double price, int stockQuantity) {
        super(name, category, price, stockQuantity, supplierEmail);
        this.department = department;
        this.managedProductsCount = managedProductsCount;
        this.isLoggedIn = isLoggedIn;
    }

    public String getDepartment() {
        return department;
    }

    public int getManagedProductsCount() {
        return managedProductsCount;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void logIn() {
        isLoggedIn = true;
        System.out.println("Zalogowano.");
    }

    public void logOut() {
        isLoggedIn = false;
        System.out.println("Wylogowano.");
    }

    public void assignProduct() {
        managedProductsCount++;
        System.out.println("Przydzielono produkt. Liczba zarządzanych produktów: " + managedProductsCount);
    }

    public void viewReports() {
        System.out.println("Przeglądanie raportów.");
    }

    public void displayManagerData() {
        System.out.println("Dane menedżera:");
        System.out.println("Nazwa: " + Product.getName());
        System.out.println("Kategoria: " + Product.getCategory());
        System.out.println("Cena: " + Product.getPrice());
        System.out.println("Ilość w magazynie: " + Product.getStockQuantity());
        System.out.println("Email dostawcy: " + Product.getSupplierEmail());
        System.out.println("Dział: " + department);
        System.out.println("Zarządzane produkty: " + managedProductsCount);
        System.out.println("Zalogowany: " + (isLoggedIn ? "Tak" : "Nie"));
    }

    public void manageProduct() {
        assignProduct();
        System.out.println("Zarządzanie produktem. Liczba zarządzanych produktów: " + managedProductsCount);
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager("departament", 5, false, "Grześ", "jedzenie", "cwl@gmail.com", "50$", "50",);
    }
}
