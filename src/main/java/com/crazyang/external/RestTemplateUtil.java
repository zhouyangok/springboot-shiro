package com.crazyang.external;

import com.crazyang.pojo.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateUtil
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/7/8 下午10:39.
 */

public class RestTemplateUtil {

    /**
     * Form
     */
    public ResultResponse httpTemplate(MultiValueMap<String, String> params, HttpMethod method, String url) {
        ResultResponse body = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
            HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
            ResponseEntity<ResultResponse> response = restTemplate.exchange(url, method, requestEntity, ResultResponse.class);
            //获取3方接口返回的数据通过entity.getBody();它返回的是一个字符串；
            body = response.getBody();
        } catch (HttpClientErrorException e) {
            //捕捉HTTP异常
            e.getResponseBodyAsString();
        } catch (Exception e) {
            //捕捉所有异常
            e.printStackTrace();
        }
        return body;
    }

    public static void main(String[] args) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.add("JSESSIONID","6D411BC6ABABCE60BD2359DE3B080C5C");
        String url = "http://101.132.146.171:8103/result/map";
        RestTemplateUtil restTemplateUtil = new RestTemplateUtil();
        restTemplateUtil.httpTemplate(params,HttpMethod.GET,url);

    }
}
