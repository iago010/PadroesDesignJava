# Padroes Design Java

Este é um projeto Java que exemplifica diferentes padrões de design. Cada padrão de design é implementado em uma classe separada para facilitar a compreensão e a organização do código.

## Padrões de Design Implementados

### Singleton Pattern

O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância.

### Factory Method Pattern

O padrão Factory Method define uma interface para criar objetos em uma superclasse, mas permite que subclasses alterem o tipo de objetos que serão criados.

### Observer Pattern

O padrão Observer define uma dependência um-para-muitos entre objetos, permitindo que um objeto notifique vários outros objetos sobre mudanças no estado.

### Builder Pattern

O padrão Builder separa a construção de um objeto complexo da sua representação, permitindo a construção de diferentes representações.

## Como Executar

Para testar todos os padrões de design implementados, você pode usar a classe `PadroesDesignJava.java` que contém um método `main`. Este método executa testes para cada padrão de design.

## Pré-requisitos

Certifique-se de ter o Java e o Maven instalados em sua máquina antes de executar o projeto.

```bash
# Clone o repositório
git clone https://seu-repositorio.git

# Navegue até o diretório do projeto
cd PadroesDesignJava

# Execute o projeto com Maven
mvn clean install

# Execute a classe de teste
java -cp target/classes com.iago010.padroesdesignjava.PadroesDesignJava
