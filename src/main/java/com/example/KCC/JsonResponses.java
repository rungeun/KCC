package com.example.KCC;

import org.json.JSONObject;

public class JsonResponses {

    public JSONObject getJsonResponse() {
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("success", true);
        jsonResponse.put("token", "로그인에 성공했습니다.");

        return jsonResponse;
    }
}