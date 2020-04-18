// TODO: remove after bug fix
//  https://github.com/bintray/gradle-bintray-plugin/issues/229

import org.gradle.api.Project
import org.gradle.api.publish.PublicationArtifact
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact
import java.io.File

tasks.named("bintrayUpload") {
    doFirst {
        project.extensions
            .getByName<PublishingExtension>("publishing")
            .publications.withType<MavenPublication>()
            .all { artifact(project.moduleArtifact(name)) }
    }
}

fun Project.moduleArtifact(publicationName: String): PublicationArtifact =
    ModuleArtifact(buildDir.resolve("publications/$publicationName/module.json"))

class ModuleArtifact(moduleFile: File) : FileBasedMavenArtifact(moduleFile) {
    override fun getDefaultExtension() = "module"
}
