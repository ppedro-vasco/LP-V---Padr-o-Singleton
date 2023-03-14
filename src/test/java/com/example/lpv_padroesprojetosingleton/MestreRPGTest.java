package com.example.lpv_padroesprojetosingleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MestreRPGTest {

    @Test
    public void deveRetornarNome() {
        MestreRPG.getInstance().setNome("Matheus");
        assertEquals("Matheus", MestreRPG.getInstance().getNome());
    }

    @Test
    public void deveRetornarEmail() {
        MestreRPG.getInstance().setEmail("mestre@email.com");
        assertEquals("mestre@email.com", MestreRPG.getInstance().getEmail());
    }

    @Test
    public void deveRetornarEdicaoJogo() {
        MestreRPG.getInstance().setEdicaoJogo("Edicao 5");
        assertEquals("Edicao 5", MestreRPG.getInstance().getEdicaoJogo());
    }

}