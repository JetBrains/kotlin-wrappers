import org.jetbrains.kotlin.gradle.dsl.JsModuleKind
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    id("npm-conventions")
}

kotlin {
    js {
        moduleName = project.name

        when (project.jsPlatform) {
            JsPlatform.WEB -> {
                browser()
                nodejs()
            }

            JsPlatform.BROWSER -> {
                browser()
            }

            JsPlatform.NODE -> {
                nodejs()
            }
        }
    }

    val generatedDir = projectDir.resolve("src/jsMain/generated")
    if (generatedDir.exists()) {
        sourceSets["jsMain"].kotlin.srcDir(generatedDir)
    }
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        allWarningsAsErrors = true

        freeCompilerArgs.addAll(
            "-opt-in=kotlin.ExperimentalStdlibApi",
            "-opt-in=kotlin.ExperimentalUnsignedTypes",
            "-opt-in=kotlin.contracts.ExperimentalContracts",
        )
    }
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        moduleKind = JsModuleKind.MODULE_ES
        useEsClasses = true

        // TODO: Enable after resolving
        //  https://youtrack.jetbrains.com/issue/KT-67355
        /*
        freeCompilerArgs.addAll(
            "-Xir-generate-inline-anonymous-functions",
        )
        */
    }
}
