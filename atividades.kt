//Diferencas de um arquivo Kotlin para um arquivo Java.

fun main() {
  /* a -> Crie uma variável do tipo inteiro e atribua o valor 10. Em seguida, crie uma constante e
  atribua o valor 5. Qual a diferença entre variáveis e constantes? */

  var numero1: Int = 10;
  val numero2: Int = 5;

  //Variáveis podem ser alteradas durante o código, já constantes tem um valor constante não podendo ser alteradas.

  /* a -> Crie uma variável para armazenar um número decimal. Qual tipo de dado você deve
  utilizar? R= Deve ser usada DOUBLE ou FLOAT */

  var numero3: Double = 10.540;

  /* b -> Crie uma variável para armazenar um texto e outra para armazenar um número inteiro.
Qual tipo de dado você deve utilizar para cada uma? */
  
  var texto: String = "Olá Mundo!";
  var intNum: Int = 2013;
  
  //Texto se utiliza STRING e números inteiros INT

  /* c -> Crie uma variável para armazenar um número inteiro e outra para armazenar um número
decimal. Qual tipo de dado você deve utilizar para cada uma? */
  
  var numDecimal: Double = 0.0;
  var numInteiro: Int = 0;

  /* a -> Crie duas variáveis inteiras e faça a soma utilizando o operador +. */

  var numInteiro1: Int = 13;
  var numInteiro2: Int = 123;

  var soma: Int = numInteiro1 + numInteiro2;

  console.log(soma);

  /* b -> Crie uma variável do tipo Boolean e atribua o resultado da expressão 5 > 3 && 2 < 4. O
que será exibido ao imprimir o valor dessa variável? */

 var boolResult: Boolean =  (5 > 3 && 2 < 4); // Sera exibido false.

 console.log(boolResult);

 /* c -> Crie uma variável do tipo Boolean e atribua o resultado da expressão !(10 > 5 || 3 < 1). O
que será exibido ao imprimir o valor dessa variável? */

var boolResult2: Boolean = !(10 > 5 || 3 < 1); // Sera exibido true.
 

}