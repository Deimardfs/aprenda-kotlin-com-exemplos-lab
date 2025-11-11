// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO } // * para identificar e separar os alunos dentro dos respectivos Níveis

class Usuario ( var aluno: String, var idade: Int, var sexo: String )

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

var conteudoEducacional = listOf<ConteudoEducacional> ( 
    "Java", 50
    "Kotlin", 45
    "SQL", 25
    "PHP", 20
    "Python", 40
    )
// lista dos cursos (conteúdos) disponíveis.

data class Formacao(val nome: String, val nivel: Nivel(), var conteudos: List<ConteudoEducacional>) {
	
  
    
    val inscritos = mutableListOf<Usuario>()
        
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
      inscritos.addAll("João", 28, "M"; "Maria", 35, "F"; "Elder", 16, "M", "Lisa", 21, "F")) // (https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/mutable-list-of.html)
    }

    
}
/*
{
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
*/
