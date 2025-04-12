import org.gradle.api.file.Directory
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Sync
import java.io.File

open class SyncWrappers : Sync() {
    init {
        includeEmptyDirs = false
    }

    @get:Internal
    val commonGeneratedDir: Directory
        get() = project.layout.projectDirectory.dir("src/commonMain/kotlin")

    @get:Internal
    val jsGeneratedDir: Directory
        get() = project.layout.projectDirectory.dir("src/jsMain/kotlin")

    fun kotlinWrappersCommonDir(
        projectName: String,
    ): File =
        dir(projectName, "commonMain")

    fun kotlinWrappersDir(
        projectName: String,
    ): File =
        dir(projectName, "jsMain")

    private fun dir(
        projectName: String,
        sourceSet: String,
    ): File =
        project.rootProject.layout.projectDirectory
            .dir("../kotlin-wrappers")
            .dir(projectName)
            .dir("src/$sourceSet/generated")
            .asFile
}
