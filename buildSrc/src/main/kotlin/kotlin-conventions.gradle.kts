import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.gradle.api.tasks.PathSensitivity.RELATIVE
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
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
     * So, as a quick fix, filter out the Markdown images, and replace GitHub admonitions with emojis.
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
                    // filter out images
                    .filterNot { it.startsWith("[![") }
                    // replace GitHub admonitions with emojis
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

        val relativeProjectPath = projectDir.relativeToOrNull(rootDir)?.invariantSeparatorsPath ?: ""

        /** Add a source link, if [path] exists. */
        fun addSourceLink(path: String) {
            val dir = layout.projectDirectory.dir(path)
            if (dir.asFile.exists()) {
                sourceLink {
                    localDirectory = dir
                    remoteUrl("https://github.com/JetBrains/kotlin-wrappers/tree/master/$relativeProjectPath/$path")
                }
            }
        }

        addSourceLink("src/commonMain/kotlin")
        addSourceLink("src/commonMain/generated")
        addSourceLink("src/jsMain/kotlin")
        addSourceLink("src/jsMain/generated")
    }

    dokkaGeneratorIsolation = ProcessIsolation {
        maxHeapSize = "4g"
    }

    pluginsConfiguration.html {
        homepageLink = "https://github.com/JetBrains/kotlin-wrappers/"
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
        target = "es2015"

        freeCompilerArgs.addAll(
            "-Xdont-warn-on-error-suppression",
        )

        // TODO: Enable after resolving
        //  https://youtrack.jetbrains.com/issue/KT-67355
        /*
        freeCompilerArgs.addAll(
            "-Xir-generate-inline-anonymous-functions",
        )
        */
    }
}
