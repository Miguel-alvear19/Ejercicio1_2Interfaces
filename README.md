classDiagram
    class Mamiferos {
        <<abstract>>
        +amamantarCrias()* void
    }
    class Ballena {
        +amamantarCrias() void
    }
    class Ornitorrinco {
        +amamantarCrias() void
        +ponerHuevos() void
    }
    class IOviparo {
        <<interface>>
        +ponerHuevos()* void
    }
    class Main {
        +main(String[] args) void
    }
    Mamiferos <|-- Ballena
    Mamiferos <|-- Ornitorrinco
    IOviparo <|.. Ornitorrinco