# Product Hierarchy UML Class Diagram

```mermaid
classDiagram
class Product {
    <<abstract>>
    -Long id
    -String name
    -double price
    +getSummary()* String
    +getId() Long
    +getName() String
    +getPrice() double
    +setId(Long id) void
    +setName(String name) void
    +setPrice(double price) void
}

class Discountable {
    <<interface>>
    +applyDiscount(double rate) void
    +getDiscountedPrice() double
}

class DigitalProduct {
    -String downloadUrl
    -double fileSizeMB
    -double discountedPrice
    +getSummary() String
    +applyDiscount(double rate) void
    +getDiscountedPrice() double
    +getDownloadUrl() String
    +getFileSizeMB() double
}


class PhysicalProduct {
    -double weightKg
    -String dimensions
    -double discountedPrice
    +getSummary() String
    +applyDiscount(double rate) void
    +getDiscountedPrice() double
    +getWeightKg() double
    +getDimensions() String
}

Product <|-- DigitalProduct
Product <|-- PhysicalProduct
Discountable <|.. DigitalProduct
Discountable <|.. PhysicalProduct
```