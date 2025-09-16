import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJsCore)

    webMainImplementation(libs.coroutines.core)

    webTestImplementation(libs.coroutines.test)
    webTestImplementation(libs.kotlin.test)
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        )
    }
}
