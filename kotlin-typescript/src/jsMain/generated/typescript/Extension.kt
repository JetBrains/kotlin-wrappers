// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Extension {
    companion object {
        @JsValue(".ts")
        val Ts: Extension

        @JsValue(".tsx")
        val Tsx: Extension

        @JsValue(".d.ts")
        val Dts: Extension

        @JsValue(".js")
        val Js: Extension

        @JsValue(".jsx")
        val Jsx: Extension

        @JsValue(".json")
        val Json: Extension

        @JsValue(".tsbuildinfo")
        val TsBuildInfo: Extension

        @JsValue(".mjs")
        val Mjs: Extension

        @JsValue(".mts")
        val Mts: Extension

        @JsValue(".d.mts")
        val Dmts: Extension

        @JsValue(".cjs")
        val Cjs: Extension

        @JsValue(".cts")
        val Cts: Extension

        @JsValue(".d.cts")
        val Dcts: Extension
    }
}
