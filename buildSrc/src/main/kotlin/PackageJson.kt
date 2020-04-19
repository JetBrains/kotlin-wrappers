import org.json.JSONObject
import org.gradle.api.Task
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency

private const val REPO_URL = "https://github.com/JetBrains/kotlin-wrappers"
private const val LICENSE = "Apache-2.0"

internal fun Task.generatePackageJson(): String =
    JSONObject().apply {
        put("name", project.npmName)
        put("description", prop("description"))
        put("version", project.npmVersion)
        put("main", jsOutputFileName)
        put("repository", REPO_URL)
        put("peerDependencies", peerDependencies)
        put("author", prop("author"))
        put("license", LICENSE)
    }.toString(2)

private val Task.peerDependencies: JSONObject
    get() = JSONObject().apply {
        put("kotlin", "^${project.kotlinVersion}")

        project.relatedProjects()
            .forEach { put(it.npmName, "^${it.npmVersion}") }

        project.nmpDependencies()
            .forEach { put(it.name, it.peerVersion) }
    }

private val NpmDependency.peerVersion: String
    get() = when (name) {
        "react", "react-dom" -> ">=15.x.x <=16.x.x"
        else -> version
    }
