import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NpmExtension>().apply {
        override("@octokit/request", "^10.0.3")
        override("@octokit/plugin-paginate-rest", "^13.1.1")
        override("@octokit/request-error", "^7.0.0")
    }
}
