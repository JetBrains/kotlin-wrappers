import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.DevNpmDependencyExtension
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

private val NAME_ALIASES = mapOf(
    "@popperjs/core" to "popper",
)

internal fun Project.npmVersion(name: String): String {
    val alias = NAME_ALIASES[name]
    if (alias != null) {
        return npmVersion(alias)
    }

    val target = name
        .removePrefix("@types/")
        .removePrefix("@")
        .replace("/x-", "x-")
        .replace("/", "-")

    return prop("$target.npm.version")
}

fun Project.npmv(name: String): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, npmVersion(name))
}

fun Project.devNpmv(name: String): NpmDependency {
    val devNpm = dependencies.the<DevNpmDependencyExtension>()
    return devNpm(name, npmVersion(name))
}
