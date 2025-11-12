// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO } // * para identificar e separar os alunos dentro dos respectivos Níveis

data class Usuario (
    val aluno: String,
    var idade: Int,
    val sexo: String
    )

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {
	
    val inscritos = mutableListOf<Usuario>()
        
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
      inscritos.addAll("João", 28, "M"; "Maria", 35, "F"; "Elder", 16, "M", "Lisa", 21, "F")) // (https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/mutable-list-of.html)
    }
    
fun main(){

val usuario1 = Usuario(
    aluno = "João"
    idade = 25
    sexo = "M"
)
val usuario2 = Usuario(
    aluno = "Maria"
    idade = 25
    sexo = "M"
)
val conteudoEducacional1 = ConteudoEducacional ( 
    nome = "Java",
    duracao = 50
    nivel = BASICO
   
val conteudoEducacional2 = ConteudoEducacional ( 
    nome = "Kotlin",
    duracao = 45
    nivel = BASICO   
    
 val conteudoEducacional3 = ConteudoEducacional ( 
    nome = "SQL",
    duracao = 25
    nivel = BASICO
 
 val conteudoEducacional4 = ConteudoEducacional ( 
    nome = "PHP",
    duracao = 20
    nivel = BASICO
    )
print(usuario)
}
/*
{
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
*/
