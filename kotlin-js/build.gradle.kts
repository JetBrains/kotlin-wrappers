import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJsCore)

        implementation(projects.kotlinJsPlainObject)

        implementation(libs.coroutines.core)
    }

    sourceSets.webTest.dependencies {
        implementation(libs.coroutines.test)
        implementation(libs.kotlin.test)
    }
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
        )
    }
}
