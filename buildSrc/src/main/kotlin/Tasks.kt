import org.gradle.api.Task
import java.io.File

internal val Task.jsOutputDir: File
    get() = project.rootProject.buildDir
        .resolve("js/packages/${project.name}/kotlin")

internal val Task.jsOutputFileName: String
    get() = "${project.name}.js"

val Task.jsOutputFile: String
    get() = jsOutputDir.resolve(jsOutputFileName).absolutePath
