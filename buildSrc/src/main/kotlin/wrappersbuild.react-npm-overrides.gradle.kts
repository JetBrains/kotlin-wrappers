import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NpmExtension>().apply {
        override("react", prop("react.npm.version"))
        override("react-dom", prop("react-dom.npm.version"))
    }
}
