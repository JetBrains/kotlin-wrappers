import org.gradle.api.file.Directory
import org.gradle.api.file.ProjectLayout
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Sync
import java.io.File
import javax.inject.Inject

open class SyncWrappers
@Inject constructor(
    projectLayout: ProjectLayout,
) : Sync(), HasGeneratedDirectories {
    @Internal
    override val rootGeneratedDir: Provider<Directory> =
        projectLayout.buildDirectory.rootGeneratedDir

    @Internal
    override val commonGeneratedDir: Provider<Directory> =
        rootGeneratedDir.commonGeneratedDir

    @Internal
    val jsGeneratedDir: Provider<Directory> =
        rootGeneratedDir.map { it.dir("src/jsMain/generated") }

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
