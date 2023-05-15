
package com.ultima.ultimo.controller;

import com.ultima.ultimo.molde.Persona;
import com.ultima.ultimo.service.ISPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
   
    
    @Autowired 
    private ISPersona persoServ;
    
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    } 
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
    return persoServ.verPersona();
    }
    
    
    
    @DeleteMapping ("/delete/persona/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    
    
    @PutMapping ("/editar/persona/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("profesion") String nuevoProfesion,
                               @RequestParam("ciudad") String nuevoCiudad,
                               @RequestParam("pais") String nuevoPais,
                               @RequestParam("imgfoto") String nuevoImgFoto,
                               @RequestParam("estuinfo1") String nuevoEstuInfo1,
                               @RequestParam("estu1img") String nuevoEstu1Img,
                               @RequestParam("estuinfo2") String nuevoEstuInfo2,
                               @RequestParam("estu2img") String nuevoEstu2Img){
    
    Persona persona = persoServ.buscarPersona(id);
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            persona.setProfesion(nuevoProfesion);
            persona.setCiudad(nuevoCiudad);
            persona.setPais(nuevoPais);
            persona.setImgfoto(nuevoImgFoto);
            persona.setEstuinfo1(nuevoEstuInfo1);
            persona.setEstu1img(nuevoEstu1Img);
            persona.setEstuinfo2(nuevoEstuInfo2);
            persona.setEstu2img(nuevoEstu2Img);
            
            persoServ.crearPersona(persona);
            return persona; 
    }
    
        @GetMapping("/persona/traer/perfil")
        public Persona buscarPersona(){
            return persoServ.buscarPersona((long)1);
        }
}
