import org.gradle.util.Path.SEPARATOR
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("node-conventions")
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

val outputPath: String = layout.projectDirectory.dir("../src/commonMain/generated").asFile.path

tasks.named<NodeJsExec>("jsNodeProductionRun") {
    args(outputPath)
}
