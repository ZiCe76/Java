import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class Movie {
    public static void main(String[] args) throws Exception {

        // Fazer uma conexão HTTP 
        
        String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
        URI endereco = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

        // Filtrar informações que me interessam (título, poster, classificação)

        JasonParser parser = new JasonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body) ;

         // Exibir e manipular os dados coletados

         for (Map<String,String> filme : listaDeFilmes) {
             System.out.println(filme.get("title"));
         }
    }

}