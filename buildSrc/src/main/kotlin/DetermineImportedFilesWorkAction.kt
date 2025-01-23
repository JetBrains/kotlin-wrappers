import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.workers.WorkAction
import org.gradle.workers.WorkParameters
import org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion.NONE
import org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles.JVM_CONFIG_FILES
import org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment
import org.jetbrains.kotlin.com.intellij.openapi.util.Disposer
import org.jetbrains.kotlin.com.intellij.openapi.vfs.local.CoreLocalFileSystem
import org.jetbrains.kotlin.com.intellij.openapi.vfs.local.CoreLocalVirtualFile
import org.jetbrains.kotlin.com.intellij.psi.PsiManager
import org.jetbrains.kotlin.config.CommonConfigurationKeys.MESSAGE_COLLECTOR_KEY
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.psi.KtFile
import org.jetbrains.kotlin.psi.KtLiteralStringTemplateEntry
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import java.io.File

abstract class DetermineImportedFilesWorkAction : WorkAction<DetermineImportedFilesWorkAction.Parameters> {
    override fun execute() {
        val projectDirectory = parameters.projectDirectory.get().asFile
        parameters
            .mainKtsFile
            .get()
            .asFile
            .importedFiles
            .map { it.relativeTo(projectDirectory).invariantSeparatorsPath }
            .distinct()
            .sorted()
            .joinToString("\n")
            .also(parameters.importedFiles.get().asFile::writeText)
    }

    interface Parameters : WorkParameters {
        val projectDirectory: DirectoryProperty
        val mainKtsFile: RegularFileProperty
        val importedFiles: RegularFileProperty
    }
}

private val File.importedFiles: List<File>
    get() = if (!isFile) {
        emptyList()
    } else {
        PsiManager
            .getInstance(
                KotlinCoreEnvironment
                    .createForProduction(
                        Disposer.newDisposable(),
                        CompilerConfiguration().apply {
                            put(MESSAGE_COLLECTOR_KEY, NONE)
                        },
                        JVM_CONFIG_FILES
                    )
                    .project
            )
            .findFile(CoreLocalVirtualFile(CoreLocalFileSystem(), toPath()))
            .let { it as KtFile }
            .fileAnnotationList
            ?.annotationEntries
            ?.asSequence()
            ?.filter { it.shortName?.asString() == "Import" }
            ?.flatMap { it.valueArgumentList?.arguments ?: emptyList() }
            ?.mapNotNull { it.getArgumentExpression() as? KtStringTemplateExpression }
            ?.map { it.entries.first() }
            ?.mapNotNull { it as? KtLiteralStringTemplateEntry }
            ?.map { resolveSibling(it.text) }
            ?.flatMap { it.importedFiles + it }
            ?.toList()
            ?: emptyList()
    }
