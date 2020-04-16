import org.gradle.api.Project

private const val REPO_URL = "https://github.com/JetBrains/kotlin-wrappers"
private const val LICENSE = "Apache-2.0"

internal fun Project.packageJsonFilter(): (String) -> String {
    val map = mapOf(
        "name" to "@jetbrains/$name",
        "version" to npmVersion(),
        "repo.url" to REPO_URL,
        "license" to LICENSE
    )
        .plus(versionMap())
        .mapKeys { "${'$'}${it.key}" }

    return {
        map.entries.fold(it) { line, (key, value) ->
            line.replace(key, value)
        }
    }
}

private fun Project.versionMap(): Map<String, String> =
    sequenceOf(
        "css",
        "kotlin",
        "kotlinext",
        "mocha",
        "react",
        "react-dom",
        "react-redux",
        "react-router-dom",
        "redux",
        "styled"
    ).associate(::versionPair)
