import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

apply(plugin = "org.jetbrains.kotlin.plugin.js-plain-objects")

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-Xdont-warn-on-error-suppression",
        )
    }
}
