@file:JvmName("Versions")

import org.gradle.api.Project

private fun Project.version(target: String): String =
    property("${target}_version") as String

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
