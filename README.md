# Atividade Pontuada: API REST com Spring Boot

Desenvolva uma API RESTful com Spring Boot para gerir endpoints, seguindo os requisitos:

**Banco de dados:**
* MySQL

**Modelagem:** 
Implemente as classes (`model`) e o mapeamento ORM conforme o diagrama de classes (anexo).

**Endpoints:**
* `/`: Mensagem de boas-vindas.
* `/funcionarios`: Operações CRUD (Create, Read, Update, Delete).
* `/fornecedores`: Operações CRUD (Create, Read, Update, Delete).
* `/clientes`: Operações CRUD (Create, Read, Update, Delete).

**Verificação:**
* Impeça emails duplicados.

**Tratamento de Exceções:**
* Trate erros com mensagens apropriadas.
* Retorne status HTTP apropriados para os erros. 

**Respostas:**
* Padronize as respostas em formato JSON.
* Inclua o status HTTP nas respostas.
* No padrão: "mensagem" : "sucesso ou erro"

**Organização:**
* Utilize os seguintes pacotes:
    * `model`
    * `repository`
    * `service`
    * `controller`
    * `exception`
    * `dto`
    * `config`

* Padronize as mensagens da API em JSON conforme abaixo: 

controller:
```
{
    "mensagem  " : "Cadastrado com sucesso."
}
```

exception:
```
{
    "mensagem" : "Funcionário já cadastrado."
}
```

**DTO:**
* Deve controlar os dados de saída da API.
* Oculte os dados abaixo:
    * `id`
    * `cpf`
    * `cnpj`
    * `senha`

**Testes:**
* Teste os endpoints utilizando Insomnia.
* Utilize as pastas de teste:
    * `welcome`
    * `funcionarios`
    * `fornecedores`
    * `clientes`

**Diagrama de Classes:**
* (Fornecido separadamente)

**Observações:**
* Utilize Spring Boot e a linguagem Java
* Documente o código de forma clara
* Considere aspectos de segurança da API
