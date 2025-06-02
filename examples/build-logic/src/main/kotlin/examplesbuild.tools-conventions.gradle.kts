import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        version = "24.1.0" // https://nodejs.org/en/download/package-manager

        versions.apply {
            webpack.version = "5.99.9" // https://www.npmjs.com/package/webpack
            webpackCli.version = "6.0.1" // https://www.npmjs.com/package/webpack-cli
            webpackDevServer.version = "5.2.1" // https://www.npmjs.com/package/webpack-dev-server
            karma.version = "6.4.4" // https://www.npmjs.com/package/karma
        }
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}
