package karakum.vscode

class Commenter
private constructor(
    val name: String?,
) {
    fun child(
        name: String,
    ): Commenter {
        return if (this.name != null) {
            Commenter(this.name + "." + name)
        } else {
            this
        }
    }

    companion object {
        val EMPTY: Commenter = Commenter(null)

        fun create(name: String): Commenter =
            Commenter(name)
    }
}
