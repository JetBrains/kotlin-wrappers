import org.gradle.api.Task
import java.io.File

val Task.nodeModules: File
    get() = project.rootProject.layout.buildDirectory
        .dir("js/node_modules").get().asFile
