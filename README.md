# Executável com MongoDB Atlas

O arquivo executável da API está disponível em: https://github.com/GTourinho/CarApi/releases/tag/v1.0

Com o arquivo executável, o banco de dados na nuvem já vem configurado.

Para executá-lo, basta rodar o comando abaixo na pasta raíz de onde ele se encontra:

<code>java -jar CarApi.jar</code>

# Compilação

Caso queira compilar o projeto, terá que conectar a aplicação com um banco de dados MongoDB. Para configurar com o MongoDB Atlas siga as instruções disponíveis em: https://www.opencodez.com/java/use-mongodb-atlas-with-spring-boot.htm

Após isso, rode o comando abaixo na pasta raíz do projeto:

<code>./mvnw spring-boot:run</code>
