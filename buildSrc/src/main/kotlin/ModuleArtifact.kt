import org.gradle.api.Project
import org.gradle.api.publish.PublicationArtifact
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import java.io.File

// TODO: remove after bug fix
//  https://github.com/bintray/gradle-bintray-plugin/issues/229
fun Project.moduleArtifact(publicationName: String): PublicationArtifact =
    ModuleArtifact(buildDir.resolve("publications/$publicationName/module.json"))

private class ModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
