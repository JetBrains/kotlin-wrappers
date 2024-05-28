import org.gradle.api.tasks.PathSensitivity.RELATIVE
import org.jetbrains.kotlin.gradle.dsl.JsModuleKind
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    id("npm-conventions")
    id("dev.adamko.dokkatoo-html")
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

val prepareReadmeForDokka by tasks.registering {
    description = "Prepare README for Dokka"

    /*
     * The READMEs of each subproject start with a Markdown shields.io image.
     *
     * Dokka doesn't like this for two reasons:
     *
     * 1. The format that Dokka requires for Module files is unreasonably strict.
     *    The first line _must_ be `# Module ${module name}`. If an image is first, Dokka breaks.
     *
     * 2. Dokka can't handle `![](...)` embedded links, and prints loads of warnings
     *    https://github.com/Kotlin/dokka/issues/1961
     *
     * So, as a quick fix, filter out the Markdown images.
     */

    val output = temporaryDir.resolve("README.md")
    outputs.file(output).withPropertyName("readmeOutput")

    val input = file("README.md")
    inputs.file(input).withPropertyName("README.md")
        .withPathSensitivity(RELATIVE)

    doLast {
        val content =
            if (input.exists()) {
                input.readText()
                    .lines()
                    .filterNot { it.startsWith("[![") }
                    .joinToString("\n") {
                        it.replace("> [!WARNING]", "> ⚠️")
                    }
            } else {
                ""
            }

        output.writeText(content)
    }
}

dokkatoo {
    dokkatooSourceSets.configureEach {
        includes.from(prepareReadmeForDokka)
    }

    dokkaGeneratorIsolation = ProcessIsolation {
        maxHeapSize = "4g"
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
        if (k2mode) {
            target = "es2015"
        } else {
            moduleKind = JsModuleKind.MODULE_ES
            useEsClasses = true
        }

        // TODO: Enable after resolving
        //  https://youtrack.jetbrains.com/issue/KT-67355
        /*
        freeCompilerArgs.addAll(
            "-Xir-generate-inline-anonymous-functions",
        )
        */
    }
}

if (k2mode) {
    apply(plugin = "k2-conventions")
}
