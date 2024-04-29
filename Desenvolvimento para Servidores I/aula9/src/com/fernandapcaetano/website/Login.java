package com.fernandapcaetano.website;

public class Login {
    //polimorfismo
    public static Sitio login(String usuario, String senha){
        if (usuario == "user" && senha == "12345") {
            return new Comum();
        }

        if (usuario == "root" && senha == "12345") {
            return new Admin();
        }

        return new Convidado();
    }

}
