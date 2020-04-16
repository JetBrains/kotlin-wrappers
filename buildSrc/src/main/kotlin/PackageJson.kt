import org.gradle.api.Project

internal fun Project.packageJsonFilter(): (String) -> String {
    val map = mapOf("version" to npmVersion())
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
