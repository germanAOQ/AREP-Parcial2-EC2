package edu.escuelaing.arep.parcial.trigonometricServer;

import com.google.gson.Gson;
import edu.escuelaing.arep.parcial.model.Response;
import edu.escuelaing.arep.parcial.service.LogService;
import edu.escuelaing.arep.parcial.service.LogServiceImpl;

import static spark.Spark.*;

public class TrigonometricServer {
    public static void main(String[] args){
        LogService logService = new LogServiceImpl();
        port(getPort());
        get("/log",(req, res) -> {
            String value = req.queryMap().get("value").value();
            Double val = Double.parseDouble(value);
            Double vaLog = logService.calculateLog(val);
            Response response = new Response();
            response.setInput(val);
            response.setOperation("log");
            response.setOutput(vaLog);
            return new Gson().toJson(response);
        });
        get("/",(req, res) ->{
           return "<h1>Para probar la API utilice los siguientes valores: 2, 10, 20.5, 100.25, 1000</h1>";
        });
    }

    /** Permite retornar el puerto que por defecto asigna el entorno.
     * @return el puerto asignado por el entorno.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
