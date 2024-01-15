public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        IdadePessoa idadePessoa = new IdadePessoa();
        Produto produto = new Produto();
        Aluno aluno = new Aluno();

        contaBancaria.setSaldo(3000);
        contaBancaria.setNumeroConta(14);
        contaBancaria.titular = "Bruno";
        System.out.println(contaBancaria.getSaldo());
        System.out.println(contaBancaria.getNumeroConta());

        idadePessoa.setAge(25);
        idadePessoa.setName("Bruno");
        System.out.println(idadePessoa.getName());
        System.out.println(idadePessoa.getAge());
        System.out.println(idadePessoa.verificaIdade());

        produto.setNome("Sabão em pó");
        produto.setPreco(10);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.aplicaDesconto(50));

        aluno.setNome("Bruno Loureiro Braz");
        aluno.setNota1(10);
        aluno.setNota2(9);
        aluno.setNota3(8);
        System.out.println(aluno.getNome());
        System.out.println(aluno.media());

        Livro livro = new Livro();
        livro.setAutor("Bruno");
        livro.setTitulo("Bras Cubas");
        System.out.println(livro.exibirDetalhes());
    }
}