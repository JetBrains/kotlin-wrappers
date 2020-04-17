// TODO: remove after bug fix
//  https://github.com/bintray/gradle-bintray-plugin/issues/229

import org.gradle.api.Project
import org.gradle.api.publish.PublicationArtifact
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import org.gradle.kotlin.dsl.withType
import java.io.File

internal fun Project.addBintrayMetadataSupport(publications: PublicationContainer) {
    tasks.named("bintrayUpload") {
        doFirst {
            publications.withType<MavenPublication>()
                .all { artifact(project.moduleArtifact(name)) }
        }
    }
}

private fun Project.moduleArtifact(publicationName: String): PublicationArtifact =
    ModuleArtifact(buildDir.resolve("publications/$publicationName/module.json"))

private class ModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
