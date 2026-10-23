import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsPlugin
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsPlugin

plugins.withType<NodeJsPlugin> {
    the<NodeJsEnvSpec>().version = libVersion("node")
}

plugins.withType<WasmNodeJsPlugin> {
    the<WasmNodeJsEnvSpec>().version = libVersion("node")
}
