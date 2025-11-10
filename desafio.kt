// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, *AVANCADO } // * para identificar e separara os alunos dentro dos respectivos Níveis

*fun nivel = Nivel()

class Usuario
  
    *fun usuario = Usuario()
  )
  var aluno: String
  var idade: Int
  var sexo: String
  var nivel: String
  var conteudoEducacional, String
 )

/*data*/ class ConteudoEducacional(var nome: String, val duracao: Int = 60)

*fun conteudoEducacional = ConteudoEducacional()
*val conteudoEducacional(
    Java, 50
    Kotlin, 45
    SQL, 25
    PHP, 20
    Python, 40
) // lista dos cursos disponíveis.

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
	
    *when ConteudoEducacional(
    Java -> )
    
    
    val inscritos = mutableListOf<Usuario>()
    
    *inscritos.addAll(ListOf(Paulo, João, Maria)) // (https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/mutable-list-of.html)
       
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
   
    *fun usuario = Usuario()
        *val usuario (
        Paulo, 35, M, BASICO
        João, 28, M, INTERMEDIARIO
        Maria, 29, F, AVANCADO
    )
}

*fun main() {
    val nivel = Nivel.BASICO
    val message = when (nivel) {
        Nivel.BASICO -> "It´s Basico"
        Nivel.INTERMEDIARIO -> "It´s Intermediario"
        Nivel.AVANCADO -> "It´s Dificil"
    }
    println(message)
}
/*
{
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
*/
