import org.gradle.api.artifacts.PublishArtifact
import org.gradle.api.artifacts.dsl.ArtifactHandler

// TODO: check why standard Kotlin DSL extension unresolved
//  method copied from `kotlin-dsl`
internal fun ArtifactHandler.archives(artifactNotation: Any): PublishArtifact =
    add("archives", artifactNotation)
