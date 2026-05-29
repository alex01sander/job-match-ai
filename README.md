# JobMatch AI

Sistema desenvolvido em Java para simular um mecanismo simples de compatibilidade entre usuários e vagas de emprego.

O projeto foi criado com foco em aprendizado de:

- Programação Orientada a Objetos (POO)
- Separação de responsabilidades
- Arquitetura em camadas
- Regras de negócio
- Manipulação de listas
- Estruturas de repetição e controle de fluxo

---

# Funcionalidades

- Cadastro de usuário
- Exibição de perfil
- Atualização de nível profissional
- Listagem de vagas disponíveis
- Sistema de match entre usuário e vagas
- Verificação de compatibilidade por:
  - nível
  - tecnologias exigidas

---

# Estrutura do Projeto

```bash
src
├── model
│   ├── Usuario.java
│   └── Vaga.java
│
├── service
│   ├── UsuarioService.java
│   ├── VagasService.java
│   └── MatchService.java
│
└── Main.java
```

---

# Conceitos Aplicados

## Programação Orientada a Objetos

- Encapsulamento
- Classes e objetos
- Construtores
- Getters e Setters
- Composição

---

## Estrutura em Camadas

### Model

Responsável pelas entidades do sistema.

Exemplo:

- Usuario
- Vaga

---

### Service

Responsável pelas regras de negócio.

Exemplo:

- cadastro de usuário
- busca de vagas compatíveis
- gerenciamento de vagas

---

### Main

Responsável pelo fluxo principal do sistema e interação com usuário.

---

# Exemplo de Match

## Usuário

```text
Tecnologias:
- React
- CSS
- JavaScript
```

## Vaga

```text
Frontend React Jr

Requisitos:
- React
- CSS
- JavaScript
```

## Resultado

```text
MATCH ENCONTRADO!
```

---

# Tecnologias Utilizadas

- Java
- IntelliJ IDEA
- Collections Framework
- Scanner
- List
- ArrayList

---

# Aprendizados Durante o Projeto

Durante o desenvolvimento foram praticados conceitos importantes como:

- uso de loops (`for`)
- controle de fluxo (`break` e `continue`)
- manipulação de listas
- comparação entre objetos
- separação de responsabilidades
- criação de regras de negócio
- organização de código em services

---

# Melhorias Futuras

- Cadastro de múltiplos usuários
- Persistência em banco de dados
- Match por porcentagem
- API REST com Spring Boot
- Interface web
- Login e autenticação
- Integração com IA para recomendação de vagas

---

# Autor

Alex Britto
