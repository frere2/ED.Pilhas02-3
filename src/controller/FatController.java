package controller;

import br.edu.fateczl.pilha.PilhaInt;

public class FatController {

    public long fatorial(int numero) {
        PilhaInt pilhaInt = new PilhaInt();

        pilhaInt.push(numero);
        try {
            if (numero == 0) return 1;
            for (int i = numero-1; i > 0; i--) {
                pilhaInt.push(pilhaInt.top() * i);
            }
            return pilhaInt.top();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }
}
