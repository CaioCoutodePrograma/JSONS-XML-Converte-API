package nrb.engie.Controller;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.XMLObject;

@RestController
public class Controller {

    @PostMapping(value = "/JsontoXml",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
    public String retornaxml(@RequestBody String inputJsObject){
        JSONObject json = new JSONObject(inputJsObject);
        return XML.toString(json);

    }
}
