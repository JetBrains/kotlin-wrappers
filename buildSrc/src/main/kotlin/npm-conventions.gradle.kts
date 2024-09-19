import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    val npmExtension = rootProject.the<NpmExtension>()

    for ((packageName, version) in getOverrides()) {
        npmExtension.override(packageName, version)
    }
}

fun getOverrides(): List<Pair<String, String>> =
    file("gradle.properties").readText()
        .splitToSequence("# https://www.npmjs.com/package/")
        .drop(1)
        .filter { ".npm.version=" in it }
        .map { data ->
            val packageName = data.substringBefore("\n")

            val version = data
                .substringAfter("\n")
                .substringBefore("\n")
                .substringAfter("=", "")
                .removePrefix("^")
                .removePrefix("~")

            packageName to version
        }
        .toList()
