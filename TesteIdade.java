class TesteIdade{
    public static void main(String[] args) {
        int idade;
        idade = 28;
        System.out.println(idade);

        int idadeAnoQueVem;
        idadeAnoQueVem = idade + 1;
        System.out.println(idadeAnoQueVem);

        double pi = 3.14;
        int raio = 5;
        double result = 2 * raio * pi;
        System.out.println(result == 31.4);
        
        
        boolean menorDeidade = idade >= 18;
        System.out.println(menorDeidade);
        
        char letra = 'a';
        System.out.println(letra);

        int i = 5;
        int j = i;
        i = i + 1;
        System.out.println(j);
        System.out.println(i);

}
}