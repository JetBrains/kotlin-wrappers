import org.jetbrains.kotlin.gradle.targets.js.NpmVersions
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.wasm.npm.WasmNpmExtension

plugins {
    id("wrappersbuild.node-conventions")
}

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().versions.configureVersions()

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}

plugins.withType<WasmNodeJsRootPlugin> {
    the<WasmNodeJsRootExtension>().versions.configureVersions()

    the<WasmNpmExtension>().apply {
        lockFileDirectory = project.layout.buildDirectory.file("wasm-package-lock").get().asFile
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}

fun NpmVersions.configureVersions() {
    // https://www.npmjs.com/package/webpack
    webpack.version = "5.99.9"

    // https://www.npmjs.com/package/webpack-cli
    webpackCli.version = "6.0.1"

    // https://www.npmjs.com/package/webpack-dev-server
    webpackDevServer.version = "5.2.2"

    // https://www.npmjs.com/package/karma
    karma.version = "6.4.4"
}
