package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal
{
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        fulano.setNome("Fulano da Silva");
        fulano.endereco = "Rua dos programadores, 42";
        fulano.setNascimento(LocalDate.of(1990, 10, 13));
        fulano.setSalario(new BigDecimal("1000.99"));

        System.out.println("Nome......: " + fulano.getNome());
        System.out.println("Endereço..: " + fulano.endereco);
        System.out.println("Nascimento: " + fulano.getNascimento());
        System.out.println("Salário...: " + fulano.getSalario());

        // A linha de baixo acusa erro pois não consegue acessar o atributo nome
        // System.out.println(fulano.nome);
    }}

