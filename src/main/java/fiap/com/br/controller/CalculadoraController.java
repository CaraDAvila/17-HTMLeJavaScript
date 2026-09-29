package fiap.com.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/soma")
    public int soma(int n1, int n2){
        return n1+n2;
    }

    @GetMapping("/subtracao")
    public int subtracao(int n1, int n2){
        return n1-n2;
    }

    @GetMapping("/multiplicacao")
    public int multiplicacao(int n1, int n2){
        return n1*n2;
    }

    @GetMapping("/divisao")
    public double divisao(int n1, int n2){
        if (n2 == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ERRO: divisao impossivel");
        }
        return (double) n1/n2;
    }
}
