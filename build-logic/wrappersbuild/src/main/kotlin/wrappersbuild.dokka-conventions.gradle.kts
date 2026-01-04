import org.gradle.api.tasks.PathSensitivity.RELATIVE

plugins {
    id("org.jetbrains.dokka")
}

dokka {
    dokkaSourceSets.configureEach {
        includes.from(prepareReadmeForDokka)

        val relativeProjectPath = projectDir.relativeToOrNull(rootDir)?.invariantSeparatorsPath ?: ""

        /** Add a source link, if [path] exists. */
        fun addSourceLink(path: String) {
            val dir = layout.projectDirectory.dir(path)
                .takeIf { it.asFile.exists() }
                ?: return

            sourceLink {
                localDirectory = dir
                remoteUrl("https://github.com/JetBrains/kotlin-wrappers/tree/master/$relativeProjectPath/$path")
            }
        }

        addSourceLink("src/commonMain/kotlin")
        addSourceLink("src/jsMain/generated")
        addSourceLink("src/jsMain/kotlin")
        addSourceLink("src/wasmJsMain/generated")
        addSourceLink("src/wasmJsMain/kotlin")
        addSourceLink("src/webMain/generated")
        addSourceLink("src/webMain/kotlin")

        externalDocumentationLinks {
            register("kotlinx.coroutines") {
                url("https://kotlinlang.org/api/kotlinx.coroutines/")
            }
        }
    }

    dokkaGeneratorIsolation = ProcessIsolation {
        maxHeapSize = "4g"
    }

    pluginsConfiguration.html {
        homepageLink = "https://github.com/JetBrains/kotlin-wrappers/"
        templatesDir.convention(rootProject.layout.projectDirectory.dir("docs/templates"))
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
