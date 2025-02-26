import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    `kotlin-library-conventions`
}

// for `definedExternally`
tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        // for `expect external JsError`
        allWarningsAsErrors = false

        freeCompilerArgs.addAll(
            "-Xallow-kotlin-package",
        )
    }
}
