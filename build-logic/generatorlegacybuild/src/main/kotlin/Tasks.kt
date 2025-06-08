import org.gradle.api.Task
import org.gradle.api.file.Directory
import java.io.File

val Task.nodeModules: File
    get() = project.rootProject.layout.buildDirectory
        .dir("js/node_modules").get().asFile

val Task.rootGeneratedDir: Directory
    get() = project.layout.buildDirectory.dir("generated").get()

val Task.commonGeneratedDir: Directory
    get() = rootGeneratedDir.dir("src/commonMain/generated")

val Task.jsGeneratedDir: Directory
    get() = rootGeneratedDir.dir("src/jsMain/generated")
