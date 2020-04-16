import org.gradle.api.Project
import org.gradle.api.Task
import java.io.File

private val Project.jsProjectId: String
    get() = "${rootProject.name}-$name"

internal val Task.jsProjectId: String
    get() = project.jsProjectId

internal val Task.jsDistDir: File
    get() = project.rootProject
        .buildDir
        .resolve("js")
        .resolve("packages")
        .resolve(jsProjectId)
        .resolve("kotlin")
