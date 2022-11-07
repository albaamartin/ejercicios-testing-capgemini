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
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ApiRestTest {

    @Test
    public void testGetHttpBinOrg() throws IOException, InterruptedException {

        //Given
        //Configurar el cliente Web que haga la peticion
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get"))
                .build();
        //When
        //Realizar la peticion
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Then
        //Comprobar que la respuesta a nuestra peticion es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200, responseStatusCode, "El codigo a devolver deberia ser 200");

    }
    @Test
    public void testGetHttpBinOrgIPWithJson()
            throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/ip"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        // Status code
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        // Datos de la caebecera
        HttpHeaders httpHeaders = response.headers();
        assertEquals("application/json", httpHeaders.firstValue("content-type").get());
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos la string a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        // obtenemos el valor de un atributo deel objeto JSON
        String origin = jsonObject.get("origin").toString();
        // verificamos su contenido
        assertNotNull(origin, "El origen debe ser diferente a null");
        System.out.println(origin);
    }
    @Test
    public void testGetHttpBinOrgWithJSON() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get"))
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
        // Extraemos el body de la respuesta
        String body = response.body();
        // Parsear el contenido del body
        JSONParser jsonParser = new JSONParser();
        JSONObject json = (JSONObject) jsonParser.parse(body);
        // Obtener los datos de los atributos que están dentro del JSON
        String url = json.get("url").toString();
        // Comprobamos que el es el contenido esperado
        assertEquals(
                "https://httpbin.org/get",
                url,
                "La url debe coincidir con el valor esperado");
        String origin = json.get("origin").toString();
        // Comprobamos que el es el contenido esperado
        assertNotNull(
                origin,
                "El origen no puede ser null");
    }
    @Test
    public void testGetHttpBinOrgWithParams() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                //Pasamos en el enlace el parametro que queremos meter, siempre detras del get va ? y entre parametro y parametro &
                .uri(URI.create("https://httpbin.org/get?param1=hola&param2=23&param3=lunes"))
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
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        //Nos aseguramos que no este vacio
        assertNotNull(responseBody, "El valor debe ser diferente a null");
        // Transformamos el body a un objeto Java JSON
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        //Guardamos en un object el dato que vamos a tocar
        JSONObject args = (JSONObject) jsonObject.get("args");
        //Pasamos param1 a string
        String param1 = (String) args.get("param1");
        //Imprimimos por pantalla
        System.out.println("param1: " + param1);
        //Nos aseguramos que salga lo mismo
        assertEquals("hola", param1);
        String param2 = (String) args.get("param2");
        System.out.println("param2: " + param2);
        assertEquals("23", param2);
        String param3 = (String) args.get("param3");
        System.out.println("param3: " + param3);
        assertEquals("lunes", param3);

    }

    @Test
    public void testSogetiTechCamp() throws IOException, InterruptedException {

        //Given
        //Configurar el cliente Web que haga la peticion
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://www.sogeti.es/unete-a-sogeti/tech-camp"))
                .build();
        //When
        //Realizar la peticion
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Then
        //Comprobar que la respuesta a nuestra peticion es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200, responseStatusCode, "El codigo a devolver deberia ser 200");

    }
    @Test
    public void testCursosDeDesarrollo() throws IOException, InterruptedException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://cursosdedesarrollo.com/pactometro/resultados.json"))
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

    }
    @Test
    public void testCursosDeDesarrolloWithJson() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://cursosdedesarrollo.com/pactometro/resultados.json"))
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
        // Recogemos los datos del body
        String body = response.body();
        //Imprimimos para obtener el body y luego comprobar que no sea null
        System.out.println(body);
        assertNotNull(body, "El valor debe ser diferente a null");
        // Parseamos los datos
        JSONParser jsonParser = new JSONParser();
        //En vez de objecto hacemos array porque van a ser muchos datos
        JSONArray array = (JSONArray) jsonParser.parse(body);
        // System.out.println(array);
        JSONObject partido = (JSONObject) array.get(0);//Empezamos el array en el primer campo vacio, el 0
        String nombre = partido.get("nombre").toString();
        assertEquals("PP", nombre,
                "El nombre del primer partido del array debe ser PP");
        String dipu = partido.get("dipu").toString();
        assertEquals("89", dipu,
                "El número de diputados del primer partido del array debe ser 89");
        String imagen = partido.get("imagen").toString();
        assertEquals("logotipo-pp.png", imagen,
                "la imagen del primer partido del array debe ser logotipo-pp.png");
    }
    @Test
    //post envia los datos en un paqueto json a la base de datos mientras que get solo podría enviar parametros mediante url, pero no a la base de datos
    public void testPostRequest() throws IOException, InterruptedException, URISyntaxException, ParseException {
        // Given
        //HttpClient client = HttpClient.newHttpClient();//Un cliente nuevo ya configurado
        HttpClient client = HttpClient.newBuilder()//Un cliente nuevo configurando yo algunos parametros, se pone newBuilder
                .version(HttpClient.Version.HTTP_2)
                .build();
        JSONObject obj = new JSONObject();
        obj.put("name", "David Vaquero");
        obj.put("age", 44);
        obj.put("phone", "654789365");
        HttpRequest request = HttpRequest.newBuilder(new URI("https://httpbin.org/post"))
                .version(HttpClient.Version.HTTP_2)
                //Se puede poner así tambien: POST(HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .method("POST", HttpRequest.BodyPublishers.ofString(obj.toJSONString()) )
                .build();
        // When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String reponseBody = response.body();
        // System.out.println("httpGetRequest: " + reponseBody);
        // Then
        assertEquals(
                200,
                responseStatusCode);
        String responseBody = response.body();
        // System.out.println("reponseBody: " + responseBody);
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject json = (JSONObject) jsonObject.get("json");

        assertEquals("David Vaquero", json.get("name"));
        assertEquals(44L, json.get("age"));
        assertEquals("654789365", json.get("phone"));
    }
    @Test
    public void testPutRequest() throws IOException, InterruptedException, URISyntaxException, ParseException {
        // Given
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();
        JSONObject obj = new JSONObject();
        obj.put("name", "David Vaquero");
        obj.put("age", 44);
        obj.put("phone", "654789365");

        HttpRequest request = HttpRequest.newBuilder(new URI("https://httpbin.org/put"))
                .version(HttpClient.Version.HTTP_2)
                .PUT(HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                //.method("PUT", HttpRequest.BodyPublishers.ofString(obj.toJSONString()))
                .build();
        // When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String reponseBody = response.body();
        // System.out.println("httpGetRequest: " + reponseBody);
        // Then
        assertEquals(
                200,
                responseStatusCode);
        String responseBody = response.body();
        // System.out.println("reponseBody: " + responseBody);
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(responseBody);
        JSONObject json = (JSONObject) jsonObject.get("json");

        assertEquals("David Vaquero",json.get("name"));
        assertEquals(44L, json.get("age"));
        assertEquals("654789365", json.get("phone"));
    }

}
