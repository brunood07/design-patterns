package br.com.bruno.store.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> data) {
        try {
            URL apiUrl = new URL(url);
            URLConnection connection = apiUrl.openConnection();
            connection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar a requisição http", e);
        }
    }
}
