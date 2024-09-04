import java.io.File

class AliasHelper(
    rootDir: File,
) {
    private val npmScopes = rootDir
        .resolve("gradle.properties")
        .readText()
        .splitToSequence("# https://www.npmjs.com/package/")
        .drop(1)
        .filter { it.startsWith("@") }
        .map { it.substringBefore("/") }
        .map { it.removePrefix("@") }
        .plus("muix")
        .toSet()

    fun getAlias(
        libraryName: String,
    ): String {
        var name = libraryName.removePrefix("kotlin-")
        val group = name.substringBefore("-", "")
            .takeIf { it in npmScopes }

        if (group != null) {
            name = name.substringAfter("-")
        }

        name = name.replace(
            regex = Regex("""-(\w)"""),
            transform = { it.groupValues[1].uppercase() }
        )

        return listOfNotNull("wrappers", group, name)
            .joinToString("-")
    }
}
