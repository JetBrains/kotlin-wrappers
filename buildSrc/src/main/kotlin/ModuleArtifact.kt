import org.gradle.api.Project
import org.gradle.api.publish.PublicationArtifact
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import java.io.File

fun Project.moduleArtifact(publicationName: String): PublicationArtifact =
    ModuleArtifact(buildDir.resolve("publications/$publicationName/module.json"))

private class ModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
