import org.gradle.api.Project

internal fun Project.version(target: String): String =
    property("${target}.version") as String

internal fun Project.versionPair(target: String): Pair<String, String> {
    val propertyName = "${target}.version"
    return propertyName to property(propertyName) as String
}

internal fun Project.npmVersion(): String {
    val target = name
        .removePrefix("kotlin-")
        .let {
            when {
                it.startsWith("css") -> "css"
                it == "extensions" -> "kotlinext"
                else -> it
            }
        }

    return version(target)
}

internal val Project.kotlinVersion: String
    get() = version("kotlin")

internal fun Project.publishVersion(): String =
    "${npmVersion()}-kotlin-$kotlinVersion"
