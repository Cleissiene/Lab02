package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar( 50.0);
//        c.depositar( 50.0);

        Conta c2 = new Conta();
        c2.setNumero (10);
        c2.setSaldo(500.0);

        Conta c3 = new Conta();

        if(c.equals(c2)){
            System.out.println("Contas iguais");
        }
        else{
            System.out.println("Contas divergentes");
        }
        System.out.println("você possui " +c.getSaldo()+ " reais de saldo em sua conta");

        //Pessoa p = new Pessoa(){



                Pessoa pessoas[] = new Pessoa[4];
                pessoas[0] = new PessoaFisica();
                pessoas[1] = new PessoaJuridica();
                pessoas[2] = new PessoaJuridica();
                pessoas[3] = new PessoaFisica();


                for(Pessoa p : pessoas)
                    p.validarDocumento();

                Conta conta = new ContaEspecial();
                conta.setNumero(111111111);
                conta.setSaldo(100000.00);


                Pessoa cleissi = new PessoaFisica();
                     cleissi.setNome("Cleissi");
                     cleissi.getContas().add(conta);




                     //cleissi.setConta(conta);

                     conta.setPessoa(cleissi);

                     //cleissi.getContas().depositar(50000.00);

                    System.out.println(conta.getPessoa().getNome());
        //System.out.println(cleissi.getContas().getSaldo());




        //System.out.println(p.getConta().getSaldo());
            }
        }

