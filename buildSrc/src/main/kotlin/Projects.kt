import org.gradle.api.Project

fun Project.version(target: String): String =
    prop("${target}.version")

internal fun Project.publishVersion(): String {
    val build = prop("version.build")
        .let { if (it.isNotEmpty()) "-$it" else "" }

    val version = version(name.removePrefix("kotlin-")) + build

    val kotlinVersion: String = version("kotlin")

    return "$version-kotlin-$kotlinVersion"
}
