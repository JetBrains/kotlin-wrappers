import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin

plugins.withType<NodeJsPlugin> {
    the<NodeJsEnvSpec>().version.set("24.2.0")
}
