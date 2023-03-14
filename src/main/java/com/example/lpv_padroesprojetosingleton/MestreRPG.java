package com.example.lpv_padroesprojetosingleton;

public class MestreRPG {
    private MestreRPG() {};
    private static MestreRPG instance = new MestreRPG();
    public static MestreRPG getInstance() {
        return instance;
    }

    private String nome;
    private String email;
    private String edicaoJogo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdicaoJogo(){
        return edicaoJogo;
    }
    public void setEdicaoJogo(String edicaoJogo){
        this.edicaoJogo = edicaoJogo;
    }
}
