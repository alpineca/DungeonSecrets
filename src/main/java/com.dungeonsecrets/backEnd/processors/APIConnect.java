package com.dungeonsecrets.backEnd.processors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class APIConnect {

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    public static JSONArray classesList() {
        JSONObject json = null;

        try {
            json = readJsonFromUrl("https://www.dnd5eapi.co/api/classes/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int jsonLenght = (int) json.get("count");

        JSONArray json2 = null;
        try {
            json2 = json.getJSONArray("results");

            for (int i = 0; i < json2.length(); i++) {

                JSONObject c = json2.getJSONObject(i);
                // Storing  JSON item in a Variable
                String name = c.optString("name", "");

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json2;
    }
}
