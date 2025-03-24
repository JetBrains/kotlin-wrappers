import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins {
    id("node-conventions")
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        versions.apply {
            webpack.version = "5.98.0" // https://www.npmjs.com/package/webpack
            webpackCli.version = "6.0.1" // https://www.npmjs.com/package/webpack-cli
            karma.version = "6.4.4" // https://www.npmjs.com/package/karma

            // synchronize TypeScript version
            // to simplify converting of kotlin-typescript subproject
            typescript.version = prop("typescript.npm.version")
        }
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
        ignoreScripts = false
    }
}
