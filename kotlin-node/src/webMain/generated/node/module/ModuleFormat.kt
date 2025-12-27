// Automatically generated - do not modify!

package node.module

sealed external interface ModuleFormat {
    companion object {
        @seskar.js.JsValue("addon")
        val addon: ModuleFormat

        @seskar.js.JsValue("builtin")
        val builtin: ModuleFormat

        @seskar.js.JsValue("commonjs")
        val commonjs: ModuleFormat

        @seskar.js.JsValue("commonjs-typescript")
        val commonjsTypescript: ModuleFormat

        @seskar.js.JsValue("json")
        val json: ModuleFormat

        @seskar.js.JsValue("module")
        val module: ModuleFormat

        @seskar.js.JsValue("module-typescript")
        val moduleTypescript: ModuleFormat

        @seskar.js.JsValue("wasm")
        val wasm: ModuleFormat
    }
}
