import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware

fun Project.AliasHelper(): AliasHelper =
    AliasHelper(this)

class AliasHelper
internal constructor(
    project: ExtensionAware,
) {
    private val npmScopes = project
        .allNpmDependencies
        .asSequence()
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
            transform = { it.groupValues[1].uppercase() },
        )

        return listOfNotNull(group, name)
            .joinToString("-")
    }
}
