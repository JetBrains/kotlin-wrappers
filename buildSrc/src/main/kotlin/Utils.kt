import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra

fun Project.projectKey(): String {
    val nameForKey = if (name.startsWith("kotlin-css")) "kotlin-css" else name
    return "${nameForKey.replace("-", "_")}_version"
}

fun Project.projectVersion() = Versions[projectKey()]