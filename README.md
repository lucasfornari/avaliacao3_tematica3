# Sistema de Gerenciamento de Notas (Selection Sort)

Este repositório contém o código-fonte desenvolvido para implementar um sistema de organização de notas de alunos utilizando o algoritmo de ordenação **Selection Sort**.

O objetivo deste projeto é permitir que o usuário insira uma quantidade determinada de notas e, em seguida, ordene essas notas em **ordem crescente**, demonstrando a aplicação prática de algoritmos de ordenação em estruturas de dados.

---

## Estrutura e Classes do Projeto

O sistema é construído em **Java**, utilizando um **array** como base para armazenar as notas. O projeto é dividido nas seguintes classes:

| Classe                  | Função                                                      | Tipo / Conceito            |
|-------------------------|-------------------------------------------------------------|----------------------------|
| `Nota.java`             | Representa uma nota (valor numérico de 0 a 10)              | Objeto                     |
| `ListaNotas.java`       | Gerencia o array de notas e implementa o Selection Sort     | Lista / Ordenação          |       
| `App.java`              | Executa o programa e exibe o menu interativo                | Aplicação / UI             |

---

## Funcionalidades Implementadas

O programa oferece um menu de console que permite ao usuário interagir com o sistema de notas:

- **Inserir quantidade e notas dos alunos:** Solicita ao usuário a quantidade de notas que serão inseridas e, em seguida, permite a entrada de cada nota (valores entre 0 e 10).

- **Ordenar notas (Selection Sort):** Organiza as notas inseridas em **ordem crescente** utilizando o algoritmo de ordenação por seleção, garantindo que a menor nota apareça sempre no início da lista.

- **Exibir lista de notas:** Mostra todas as notas cadastradas em sua ordem atual, seja ela a ordem de inserção ou a ordem crescente após a ordenação.

- **Finalizar programa:** Encerra a execução do sistema.

---

## Algoritmo de Ordenação: Selection Sort

O **Selection Sort** (Ordenação por Seleção) é um algoritmo de ordenação simples que funciona da seguinte forma:

1. Percorre o array buscando o **menor elemento**
2. Troca esse menor elemento com o elemento da primeira posição
3. Repete o processo para o restante do array (excluindo as posições já ordenadas)
4. Continua até que todo o array esteja ordenado

### Exemplo de Execução

**Antes da ordenação:**
```
[8.5, 3.2, 9.1, 4.0, 7.5]
```

**Após a ordenação (Selection Sort):**
```
[3.2, 4.0, 7.5, 8.5, 9.1]
```

---

## Autor

Projeto desenvolvido como atividade acadêmica para demonstrar a aplicação prática do algoritmo **Selection Sort** em um sistema de gerenciamento de notas.

---

## Licença

Este projeto é de uso educacional e acadêmico.