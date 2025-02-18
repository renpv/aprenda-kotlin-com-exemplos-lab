// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 10)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val conteudosJavaIni: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Intro", 3),
        ConteudoEducacional("Ambiente", 5),
        ConteudoEducacional("Hello", 4),
        ConteudoEducacional("Finalizando o curso", 2)
    )
    
    val formacaoJavaIniciante = Formacao("Java Iniciante", Nivel.BASICO, conteudosJavaIni)
    
    val uRenato = Usuario("Renato")
    formacaoJavaIniciante.matricular(uRenato)
    
    println(formacaoJavaIniciante)
}
