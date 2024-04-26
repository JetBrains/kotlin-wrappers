import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.registering

val k2patch by tasks.registering {
    patchFile("gradle.properties") {
        it.replace(
            "kotlin.version=1.9.23",
            "kotlin.version=2.0.0-RC1",
        )
    }

    patchFile("buildSrc/src/main/kotlin/Plugins.kt") {
        it.replace("""id("io.github.sgrishchenko.karakum")""", "")
    }
}

fun patchFile(
    path: String,
    transform: (String) -> String,
) {
    val file = rootProject.file(path)
    val content = file.readText()
    file.writeText(transform(content))
}
