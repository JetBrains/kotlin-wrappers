import org.json.JSONObject
import org.gradle.api.Task

private const val REPO_URL = "https://github.com/JetBrains/kotlin-wrappers"
private const val LICENSE = "Apache-2.0"

private fun Task.prop(propertyName: String): String =
    project.property(propertyName) as String

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
    get() = defaultPeerDependencies().apply {
        put("kotlin", "^${project.kotlinVersion}")

        project.relatedProjects()
            .forEach { put(it.npmName, "^${it.npmVersion}") }
    }

private fun Task.defaultPeerDependencies(): JSONObject {
    val sourceFile = project.projectDir
        .resolve("package.json")
        .takeIf { it.exists() }
        ?: return JSONObject()

    return JSONObject(sourceFile.readText())
        .getJSONObject("peerDependencies")
}
