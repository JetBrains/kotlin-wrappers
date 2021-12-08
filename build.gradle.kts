import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin

plugins {
    kotlin("js") apply false
}

tasks.wrapper {
    gradleVersion = "7.3.1"
}

rootProject.the<NodeJsRootExtension>().nodeVersion = "16.13.1"

YarnPlugin.apply(rootProject).version = "1.22.17"
