import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    kotlin("plugin.js-plain-objects")
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-Xdont-warn-on-error-suppression",
        )
    }
}
