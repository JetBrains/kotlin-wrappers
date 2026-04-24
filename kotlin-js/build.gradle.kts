import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    // ESM output is required to reproduce SyntaxError: Identifier 'set'/'get' has already been declared.
    // Combined with kotlin.js.ir.output.granularity=per-file (gradle.properties), multiple concrete
    // implementors of external interfaces with `= definedExternally` operator bodies cause the IR backend
    // to emit duplicate top-level function helpers in the generated .mjs.
    js {
        useEsModules()
    }
}

dependencies {
    webMainApi(projects.kotlinJsCore)

    webMainImplementation(projects.kotlinJsPlainObject)

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
