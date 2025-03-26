import org.gradle.kotlin.dsl.withType
import org.gradle.util.Path.SEPARATOR
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
}

kotlin {
    js {
        outputModuleName = project.path
            .removePrefix(SEPARATOR)
            .replace(SEPARATOR, "-")

        nodejs()

        compilerOptions {
            target = "es2015"
        }

        binaries.executable()
    }
}

plugins.withType<NodeJsPlugin> {
    the<NodeJsEnvSpec>().version.set("22.14.0")
}

val outputPath: String = layout.projectDirectory.dir("../src/jsMain/generated2").asFile.path

tasks.named<NodeJsExec>("jsNodeProductionRun") {
    args(outputPath)
}
