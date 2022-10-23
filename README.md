Desenvolvimento CRUD com tratamento de exceção utilizando handler. 

Tecnologias utilizadas: <br>
Linguagem de programação: java <br>
Frameworks: springboot, spring data JPA, spring validation <br>
Database: H2 (banco de memória) <br>

Métodos do CRUD: <br>
POST - inserir nome e email na tabela <br>
GET - pegar informações na tabela <br>
DELETE - deletar informações na tabela <br>
PUT - atualização de todas as informações (através de um determinado ID) <br>
PATCH - atualização aparcial das informações (atráves de um determinado ID) <br>

Como utilizar: <br>
1° baixe uma IDEA java. <br>
2° baixe uma ferramenta administrativa de banco de dados (eu uso Dbeaver). <br>
3° baixe o POSTMAN. <br>
4° abra o Dbeaver e selecionar o database H2 e insira as informações que estão no application.properties (dentro de resources). <br>
5° suba a aplicação: RUN no intellij ou dê RUN na classe DemoApplication. <br>
6° abra o POSTMAN e criei as abas com todos os metodos: POST, GET, DELETE, PUT e PATCH. <br>
7° use o POST para inserir algumas informações na tabela. <br>
8° divirta-se! <br>

URI para colocar no POSTMAN: http://localhost:8080/users/1 <br>
obs.: como eu criei apenas um metodos de cada não ouve necessidade de criar caminhos diferentes <br>
para URI e como todos os métodos (exceto POSTMAN) usam o ID como base para fazer sua determinada <br>
função a URI é igual para todas as operações criadas neste desenvolvimento. 
