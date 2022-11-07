package com.capgemini.apirest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiRestTypeCodeTest {

    @Test
    //Comprobamos los datos de todos los elementos del array
    public void testList() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        String body  = response.body();
        // System.out.println(body);
        JSONParser jsonParser = new JSONParser();
        // Array porque es un conjunto de datos
        JSONArray array = (JSONArray) jsonParser.parse(body);
        // System.out.println(array.size());//Primero vemos cual es e tamaño para luego compararlo
        assertEquals(100, array.size());
        JSONObject objeto = (JSONObject) array.get(0);//Accedemos al dato guardado en el array 0
        //System.out.println(objeto);// vemos qué datos tiene el objeto
        Long userId = (Long) objeto.get("userId");
        // System.out.println(userId);//vemos el dato que hay en userId
        assertEquals(1, userId);//Lo comparamos
        Long id = (Long) objeto.get("id");
        // System.out.println(userId);
        assertEquals(1, id);
    }
    @Test
    //Insertamos un elemento nuevo en el array
    public void testCreate() throws ParseException, URISyntaxException, IOException, InterruptedException {
        // Given
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        JSONObject obj = new JSONObject();
        obj.put("title", "El color de la magia");
        obj.put("body", "Terry Pratchett");
        obj.put("userID", 1);

        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://jsonplaceholder.typicode.com/posts"))
                .version(HttpClient.Version.HTTP_2)
                .POST(HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .build();

        // When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String responseBody = response.body();
        //System.out.println("httpGetRequest: " + responseBody); //Vemos que ha guardado el nuevo elemento en el array ya que ahora el id es 101, y el tamaño antes era de 100
        // Then
        assertEquals(
                201,
                responseStatusCode);
        //System.out.println("responseBody: " + responseBody);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        assertEquals(101L, jsonObject.get("id"));//Nos aseguramos que el elemento 101 se ha añadido

    }
    @Test
    //Comprobamos los datos de un elemento del array
    public void testGetById() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))// posts/1 porque miramos el elemento 1
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        String body  = response.body();
        // System.out.println(body);

        JSONParser jsonParser = new JSONParser();
        JSONObject objeto = (JSONObject) jsonParser.parse(body);

        //System.out.println(objeto);
        Long userId = (Long) objeto.get("userId");
        // System.out.println(userId);
        assertEquals(1, userId);
        Long id = (Long) objeto.get("id");
        // System.out.println(userId);
        assertEquals(1, id);
        assertEquals(
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                objeto.get("title"));
        assertEquals("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto",
                objeto.get("body"));
    }
    @Test
    //Modificamos un elemento del array
    public void testUpdate() throws IOException, InterruptedException, URISyntaxException, ParseException {
        // Given
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        JSONObject obj = new JSONObject();
        obj.put("title", "El color de la magia");
        obj.put("body", "Terry Pratchett");
        obj.put("id", 1);
        obj.put("userId", 1);

        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/1"))
                .version(HttpClient.Version.HTTP_2)
                .method("PUT", HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .build();

        // When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String responseBody = response.body();
        // System.out.println("httpGetRequest: " + responseBody);
        // Then
        assertEquals(
                200,
                responseStatusCode);
        // System.out.println("responseBody: " + responseBody);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);

        assertEquals(1L,jsonObject.get("id"));
    }

    @Test
    //Borramos un elemento del array
    public void testDelete() throws IOException, InterruptedException, URISyntaxException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://jsonplaceholder.typicode.com/posts/1"))//vamos a borrar el elemento 1 del array
                .version(HttpClient.Version.HTTP_2)
                .method("DELETE",HttpRequest.BodyPublishers.ofString(""))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        String body = response.body();
        //System.out.println(body);
        assertEquals("{}", body);
    }

}
