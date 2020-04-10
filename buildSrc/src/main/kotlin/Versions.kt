import org.gradle.api.Project

internal fun Project.version(target: String): String =
    property("${target}_version") as String

internal fun Project.versionPair(target: String): Pair<String, String> {
    val propertyName = "${target}_version"
    return propertyName to property(propertyName) as String
}

internal fun Project.publishVersion(): String {
    val target = name
        .removePrefix("kotlin-")
        .let {
            when {
                it.startsWith("css") -> "css"
                it == "extensions" -> "kotlinext"
                else -> it.replace("-", "_")
            }
        }

    return "${version(target)}-kotlin-${version("kotlin")}"
}
