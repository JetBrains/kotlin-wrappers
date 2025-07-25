package karakum.vscode

class Commenter(
    val name: String,
) {
    fun child(
        name: String,
    ): Commenter =
        Commenter(this.name + "." + name)
}
