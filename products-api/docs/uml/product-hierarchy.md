# Product Hierarchy UML Class Diagram

```mermaid
classDiagram
class Product {
    -Long id
    -String name
    -double price
    +getId() Long
    +getName() String
    +getPrice() double
    +setId(Long id) void
    +setName(String name) void
    +setPrice(double price) void
}

class DigitalProduct {
    -String downloadUrl
    -double fileSizeMB
    +getDownloadUrl() String
    +getFileSizeMB() double
    +setDownloadUrl(String url) void
    +setFileSizeMB(double size) void
}

class PhysicalProduct {
    -double weightKg
    -String dimensions
    +getWeightKg() double
    +getDimensions() String
    +setWeightKg(double weight) void
    +setDimensions(String dim) void
}

Product <|-- DigitalProduct
Product <|-- PhysicalProduct
```