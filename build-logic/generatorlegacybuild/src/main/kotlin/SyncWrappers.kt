import org.gradle.api.tasks.Sync
import java.io.File

open class SyncWrappers : Sync() {
    init {
        includeEmptyDirs = false
    }

    fun webMainDir(
        projectName: String,
    ): File =
        dir(projectName, "webMain")

    fun jsMainDir(
        projectName: String,
    ): File =
        dir(projectName, "jsMain")

    private fun dir(
        projectName: String,
        sourceSet: String,
    ): File =
        project.rootProject.layout.projectDirectory
            .dir("../..")
            .dir(projectName)
            .dir("src/$sourceSet/generated")
            .asFile
}
