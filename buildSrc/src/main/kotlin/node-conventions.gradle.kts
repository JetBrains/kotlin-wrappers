import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnPlugin
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootExtension

plugins.withType<YarnPlugin> {
    the<YarnRootExtension>().version = "1.22.17"
    the<YarnRootExtension>().ignoreScripts = false
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().nodeVersion = "16.13.1"
}
