public class Elemento {
   public Espectador dado;
   public Elemento proximo;

   /**
    * Método construtor (sem verificação)
    * @param dado Um objeto Espectador.
    */
   public Elemento(Espectador dado) {
      this.dado = dado;
      this.proximo = null;
   }

   public boolean equals(Object obj) {
      String comparacao = (String) obj;

      return this.dado.equals(comparacao);
   }
}
