import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJsCore)

    commonMainImplementation(libs.coroutines.core)

    commonTestImplementation(libs.coroutines.test)
    commonTestImplementation(libs.kotlin.test)
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        )
    }
}
