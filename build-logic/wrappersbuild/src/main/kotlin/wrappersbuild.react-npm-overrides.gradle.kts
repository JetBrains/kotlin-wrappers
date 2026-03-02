import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NpmExtension>().apply {
        // TODO: remove after
        //  https://github.com/prantlf/jsonlint/pull/44
        override("ajv", prop("ajv.npm.version"))
    }
}
