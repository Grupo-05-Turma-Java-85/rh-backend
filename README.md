# RH FitHub - Backend

<div align="center">     <img src="https://i.imgur.com/Ei8epc3.png" title="source: imgur.com" width="30%"/> </div>

<div align="center">
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) ![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white) ![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white) 

![GitHub language count](https://img.shields.io/github/languages/count/Grupo-05-Turma-Java-85/rh-backend)![GitHub top language](https://img.shields.io/github/languages/top/Grupo-05-Turma-Java-85/rh-backend)![GitHub repo size](https://img.shields.io/github/repo-size/Grupo-05-Turma-Java-85/rh-backend)![GitHub last commit](https://img.shields.io/github/last-commit/Grupo-05-Turma-Java-85/rh-backend)



# 1. Descrição  

O **RH FitHub** é uma API Back-end desenvolvida para auxiliar no gerenciamento de colaboradores de uma empresa do segmento fitness.   O sistema permite realizar o cadastro, consulta, atualização e exclusão de informações dos colaboradores, facilitando o controle dos dados do setor de Recursos Humanos.  A aplicação foi desenvolvida utilizando Java com Spring Boot, integração com banco de dados MySQL e persistência de dados utilizando JPA/Hibernate.  

# 

# 2. Sobre esta API

*O* **RH FitHub** *é uma API REST desenvolvida para o gerenciamento de recursos humanos de empresas do segmento fitness. O sistema permite cadastrar, consultar, atualizar e excluir informações de colaboradores e cargos, facilitando a organização e o controle dos dados de forma prática e eficiente.*

*O projeto foi desenvolvido utilizando* **Java***,* **Spring Boot***,* **Spring Data JPA***,* **Hibernate** *e* **MySQL***, seguindo a arquitetura REST e boas práticas de desenvolvimento Back-end. Para a persistência dos dados, foi utilizado um* **banco de dados relacional MySQL***, integrado à aplicação por meio do JPA/Hibernate, garantindo um gerenciamento seguro e eficiente das informações.*

# 

## 2.1 Principais Funcionalidades

1. Gerenciamento completo de colaboradores através das operações CRUD; 
2. Cadastro de novos colaboradores; 
3. Consulta de todos os colaboradores cadastrados; 
4. Busca de colaboradores por ID e e-mail; 
5. Atualização das informações dos colaboradores; 
6. Remoção de colaboradores do sistema; 
7. Integração com banco de dados MySQL para armazenamento das informações.

# 

# 3. Diagrama de Classes  

<div align="center">     <img src="https://i.imgur.com/xkd2Np1_d.jpeg?maxwidth=520&shape=thumb&fidelity=high" width="50%"/> </div>

# 

# 4. Diagrama Entidade-Relacionamento (DER)

<div align="center">     <img src="https://i.imgur.com/2Gb4c3Q.png" width="50%"/> </div>

# 

# 5. Tecnologias utilizadas 

| **Item**                 | **Tecnologia**  |
| ------------------------ | --------------- |
| Servidor                 | Tomcat          |
| Linguagem de Programação | Java            |
| Framework                | Spring          |
| ORM                      | JPA + Hibernate |
| Banco de dados           | MySQL           |

# 

# 6. Requisitos

Para executar os códigos localmente, você precisará:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Banco de dados [MySQL](https://dev.mysql.com/downloads/)
- [STS](https://spring.io/tools)
- [Insomnia](https://insomnia.rest/download) ou [Postman](https://www.postman.com/)

# 

# 7. Como Executar o projeto no STS

## 7.1. Importando o Projeto

1. Clone o repositório do Projeto [**FitHub RH**](https://github.com/Grupo-05-Turma-Java-85/rh-backend) dentro da pasta do *Workspace* do STS

```
git clone https://github.com/Grupo-05-Turma-Java-85/rh-backend
```

2. **Abra o STS** e selecione a pasta do *Workspace* onde você clonou o repositório do projeto
3. No menu superior do STS, clique na opção: **File 🡲 Import...**
4. Na janela **Import**, selecione a opção: **General 🡲 Existing Projects into Workspace** e clique no botão **Next**
5. Na janela **Import Projects**, no item **Select root directory**, clique no botão **Browse...** e selecione a pasta do Workspace onde você clonou o repositório do projeto
6. O STS reconhecerá o projeto automaticamente
7. Marque o Projeto Blog Pessoal no item **Projects** e clique no botão **Finish** para concluir a importação

# 

## 7.2. Executando o Projeto

1. Na Guia **Boot Dashboard**, localize o **Projeto FitHub RH**
2. Selecione o **Projeto FitHub RH** 
3. Clique no botão **Start or Restart** [![source: imgur.com](https://camo.githubusercontent.com/55fb030baeae807a71d2234022da28a827faa55c1fd8c9a9e615e309c255a080/68747470733a2f2f692e696d6775722e636f6d2f77646f5a7157502e706e67)](https://camo.githubusercontent.com/55fb030baeae807a71d2234022da28a827faa55c1fd8c9a9e615e309c255a080/68747470733a2f2f692e696d6775722e636f6d2f77646f5a7157502e706e67) para iniciar a aplicação
4. Caso seja perguntado se você deseja autorizar o acesso ao projeto via rede, clique no botão **Permitir Acesso**
5. Acompanhe a inicialização do projeto no console do STS
6. Verifique se o banco de dados `db_fithubrh` foi criado corretamente e se as tabelas foram geradas automaticamente.
7. Utilize o [Insomnia](https://insomnia.rest/) ou o [Postman](https://www.postman.com/) para testar os endpoints.

Tip

Ao acessar a URL `http://localhost:8080` em seu navegador, a interface do Swagger será carregada automaticamente, permitindo a visualização e a interação com os endpoints da API, bem como a consulta dos modelos de dados utilizados.

# 

# 8. Contato

Projeto desenvolvido por 

Desenvolvido por [**Grupo 05 - Turma Java 85**](https://github.com/Grupo-05-Turma-Java-85) 

Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!