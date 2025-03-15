import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsExec

plugins {
    id("kotlin-conventions")
}

kotlin.js().binaries.executable()

val outputPath: String = layout.projectDirectory.dir("../src/jsMain/generated").asFile.path

tasks.named<NodeJsExec>("jsNodeProductionRun") {
    args(outputPath)
}
