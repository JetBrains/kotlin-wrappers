import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("kotlin-library-conventions")
}

// for `definedExternally`
tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-Xallow-kotlin-package",
        )
    }
}
