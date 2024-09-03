Modelagem e diagramação da representação UML do desafio Bootcamp, abrangendo suas funcionalidades.

```mermaid
classDiagram
    class Bootcamp {
        -nome: String
        -descricao: String
        -dataInicial: LocalDate
        -dataFinal: LocalDate
        -devsInscritos: Set
        -conteudos: Set
    }

    class Conteudo {
        -titulo: String
        -descricao: String
        #XP_PADRAO: double
        +calcularXp() double
    }

    class Curso {
        -cargaHoraria: int
        +calcularXp() double
    }

    class Dev {
        -nome: String
        -conteudosInscritos: Set
        -conteudosConcluidos: Set
        +inscreverBootcamp(Bootcamp: bootcamp) void
        +progredir() void
        +calcularTotalXp() double
    }

    class Mentoria {
        -data: LocalDate
        +calcularXp() double        
    }

    class Main {
        +inscreverBootcamp() void
        +progredir() void
        +calcularTotalXp() void
        +exibirCurso() void
    }
    Bootcamp "1..*" -- "1..*" Mentoria: Associado
    Bootcamp "1..*" -- "1..*" Dev: Associado
    Bootcamp "1..*" -- "1..*" Curso: Associado
    Curso "1" *-- "0..*" Conteudo: Contém
    Mentoria "1" *-- "0..*" Conteudo: Contém
    Main "1" *-- "0..*" Dev: Contém
          
    ```
