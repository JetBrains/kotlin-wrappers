import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        version = "22.11.0"

        versions.apply {
            webpack.version = "5.96.1"
            webpackCli.version = "5.1.4"
            webpackDevServer.version = "5.1.0"
            karma.version = "6.4.4"
        }
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}
