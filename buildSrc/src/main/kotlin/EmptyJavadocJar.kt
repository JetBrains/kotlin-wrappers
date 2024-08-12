import org.gradle.api.plugins.JavaBasePlugin
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.assign

private val README_CONTENT = """
|This Javadoc JAR is intentionally empty.
|
|For documentation, see https://github.com/JetBrains/kotlin-wrappers/ or the sources JAR.
|
""".trimMargin()

class EmptyJavadocJar : Jar() {
    init {
        group = JavaBasePlugin.DOCUMENTATION_GROUP
        description = "Empty javadoc artifact (required by Maven Central)"
        archiveClassifier = "javadoc"

        from(project.resources.text.fromString(README_CONTENT)) {
            rename { "readme.txt" }
        }
    }
}
