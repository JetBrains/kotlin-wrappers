import org.gradle.api.Project
import org.gradle.api.Task
import java.io.File

private val Project.jsProjectId: String
    get() = "${rootProject.name}-$name"

private val Task.jsProjectId: String
    get() = project.jsProjectId

internal val Task.jsDistDir: File
    get() = if (project.isKotlinMultiplatformProject) {
        project.rootProject.buildDir
            .resolve("js/packages/$jsProjectId/kotlin")
    } else {
        project.buildDir.resolve("classes/main")
    }

internal val Task.jsOutputFileName: String
    get() = if (project.isKotlinMultiplatformProject) {
        "${jsProjectId}.js"
    } else {
        "${project.name}.js"
    }
