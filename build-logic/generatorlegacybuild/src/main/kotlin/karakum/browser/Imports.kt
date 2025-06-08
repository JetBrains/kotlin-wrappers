package karakum.browser

internal class Imports(
    vararg items: String,
) {
    private val map: Map<String, String> = items.associateWith { it.substringAfterLast(".") }

    fun forContent(
        annotations: String,
        body: String,
    ): String =
        map.asSequence()
            .mapNotNull { (fqn, name) ->
                if (name in annotations || name in body) fqn else null
            }.joinToString("\n") { "import $it" }
}
