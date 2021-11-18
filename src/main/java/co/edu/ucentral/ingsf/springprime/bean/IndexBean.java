package co.edu.ucentral.ingsf.springprime.bean;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@Component
@ManagedBean
@ViewScoped
@Getter
@Setter
public class IndexBean implements Serializable {
    private String cadena;
    private Integer conteo;


    @PostConstruct
    public void init() {

    }
    public void validar(){
        System.out.println("xxxxx   xxxx");

        if (cadena.isEmpty()){
            conteo = 0;
        }else{
            conteo = cadena.length();
        }

    }
    public String ir(){
        System.out.println("- - - - - - CLICK "+cadena);
        if (cadena.equals("IR"))
            return "principal";
        else
            return "";
    }
    public String guardar(){
        //Familia f1 = new Familia(cadena.isEmpty()?"":cadena, cadena.isEmpty()?"":cadena);

        return "";

    }
    public String guardarA(){

        return "";

    }


}
