import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

fun Project.kotlinxHtml(name: String): String =
    kotlinx("kotlinx-html", name)

fun Project.kotlinxSerialization(name: String): String =
    kotlinx("kotlinx-serialization", name)

private fun Project.kotlinx(projectName: String, name: String): String =
    "org.jetbrains.kotlinx:$projectName-$name:${version(projectName)}"

fun Project.npmv(name: String): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, "^${version(name)}")
}
