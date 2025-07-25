package karakum.vscode

class Commenter(
    private val name: String,
) {
    fun child(
        name: String,
    ): Commenter =
        Commenter(this.name + "." + name)
}
