import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

plugins {
    id("io.github.sgrishchenko.karakum")
}

karakum {
    output = layout.projectDirectory.dir("../src/webMain/generated")
}

// Exclude redundant NPM test dependencies
plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().versions.mocha.version = "npm:empty-npm-package@1.0.0"
}
