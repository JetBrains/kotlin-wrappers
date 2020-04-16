import org.gradle.api.Project

internal fun Project.packageJsonFilter(): (String) -> String {
    val map = versionMap()
    return { line ->
        var result = line
        for ((key, value) in map) {
            result = result.replace("${'$'}$key", value)
        }
        result
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
