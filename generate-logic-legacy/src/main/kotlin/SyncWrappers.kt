import org.gradle.api.tasks.Sync
import java.io.File

open class SyncWrappers : Sync() {
    init {
        includeEmptyDirs = false
    }

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
            .dir(if (project == project.rootProject) "../.." else "..")
            .dir(projectName)
            .dir("src/$sourceSet/generated")
            .asFile
}
