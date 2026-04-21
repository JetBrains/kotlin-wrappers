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
        lockFileDirectory = projectDir.resolve(".kotlin-locks/js")
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}

plugins.withType<WasmNodeJsRootPlugin> {
    the<WasmNodeJsRootExtension>().versions.configureVersions()

    the<WasmNpmExtension>().apply {
        lockFileDirectory = projectDir.resolve(".kotlin-locks/wasmjs")
        packageLockMismatchReport = LockFileMismatchReport.NONE
    }
}

fun NpmVersions.configureVersions() {
    // https://www.npmjs.com/package/webpack
    webpack.version = "5.106.2"

    // https://www.npmjs.com/package/webpack-cli
    webpackCli.version = "7.0.2"

    // https://www.npmjs.com/package/webpack-dev-server
    webpackDevServer.version = "5.2.3"

    // https://www.npmjs.com/package/mocha
    mocha.version = "12.0.0-beta-10"
}
