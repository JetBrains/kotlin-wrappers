@file:Suppress("UnstableApiUsage")

import org.gradle.api.DefaultTask
import org.gradle.api.file.Directory
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileSystemOperations
import org.gradle.api.file.ProjectLayout
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.listProperty
import org.gradle.kotlin.dsl.property
import java.io.File
import javax.inject.Inject

abstract class GenerateDeclarationsTask
@Inject constructor(
    private val projectLayout: ProjectLayout,
    private val fileSystemOperations: FileSystemOperations,
    objectFactory: ObjectFactory,
) : DefaultTask(), HasGeneratedDirectories {

    private val rootBuildDirectory: DirectoryProperty
        get() = project.rootProject.layout.buildDirectory

    private val buildDirectory: DirectoryProperty
        get() = projectLayout.buildDirectory

    @Internal
    val nodeModules: Provider<File> =
        rootBuildDirectory.dir("js/node_modules").map { it.asFile }

    @Internal
    override val rootGeneratedDir: Provider<Directory> =
        buildDirectory.rootGeneratedDir

    @Internal
    override val commonGeneratedDir: Provider<Directory> =
        rootGeneratedDir.commonGeneratedDir

    @Internal
    val jsGeneratedDir: Provider<Directory> =
        rootGeneratedDir.map { it.dir("src/jsMain/generated") }

    @Input
    val sourceDirs: ListProperty<Directory> =
        objectFactory.listProperty()

    @Input
    val action: Property<() -> Unit> =
        objectFactory.property()

    @TaskAction
    fun mainAction() {
        fileSystemOperations.delete {
            delete(sourceDirs)
        }

        action.get().invoke()
    }
}

fun Provider<File>.resolve(path: String): Provider<File> =
    map { it.resolve(path) }
