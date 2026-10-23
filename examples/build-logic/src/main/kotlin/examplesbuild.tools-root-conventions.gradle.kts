import org.jetbrains.kotlin.gradle.targets.js.NpmVersions
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.wasm.npm.WasmNpmExtension

plugins {
    id("examplesbuild.node-conventions")
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
    webpack.version = libVersion("webpack")
    webpackCli.version = libVersion("webpack-cli")
    webpackDevServer.version = libVersion("webpack-dev-server")
    mocha.version = libVersion("mocha")
}
