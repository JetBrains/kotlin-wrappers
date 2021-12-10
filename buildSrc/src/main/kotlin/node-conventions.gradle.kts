import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin

YarnPlugin.apply(project).version = "1.22.17"

project.the<NodeJsRootExtension>().nodeVersion = "16.13.1"
