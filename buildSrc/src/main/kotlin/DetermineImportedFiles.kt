import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.ProjectLayout
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.UntrackedTask
import org.gradle.kotlin.dsl.submit
import org.gradle.workers.WorkerExecutor
import javax.inject.Inject

@UntrackedTask(because = "imported files can import other files so inputs are not determinable upfront")
abstract class DetermineImportedFiles : DefaultTask() {
    @get:InputFile
    abstract val mainKtsFile: RegularFileProperty

    @get:InputFiles
    abstract val kotlinCompilerEmbeddableClasspath: ConfigurableFileCollection

    @get:OutputFile
    abstract val importedFiles: RegularFileProperty

    @get:Inject
    abstract val workerExecutor: WorkerExecutor

    @get:Inject
    abstract val layout: ProjectLayout

    @TaskAction
    fun determineImportedFiles() {
        workerExecutor.classLoaderIsolation {
            classpath.from(kotlinCompilerEmbeddableClasspath)
        }.submit(DetermineImportedFilesWorkAction::class) {
            projectDirectory.set(layout.projectDirectory)
            mainKtsFile.set(this@DetermineImportedFiles.mainKtsFile)
            importedFiles.set(this@DetermineImportedFiles.importedFiles)
        }
    }
}
