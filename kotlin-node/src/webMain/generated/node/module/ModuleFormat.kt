// Automatically generated - do not modify!

package node.module

sealed external interface ModuleFormat {
    companion object
}

inline val ModuleFormat.Companion.addon: ModuleFormat
    get() = js.reflect.unsafeCast("addon")

inline val ModuleFormat.Companion.builtin: ModuleFormat
    get() = js.reflect.unsafeCast("builtin")

inline val ModuleFormat.Companion.commonjs: ModuleFormat
    get() = js.reflect.unsafeCast("commonjs")

inline val ModuleFormat.Companion.commonjsTypescript: ModuleFormat
    get() = js.reflect.unsafeCast("commonjs-typescript")

inline val ModuleFormat.Companion.json: ModuleFormat
    get() = js.reflect.unsafeCast("json")

inline val ModuleFormat.Companion.module: ModuleFormat
    get() = js.reflect.unsafeCast("module")

inline val ModuleFormat.Companion.moduleTypescript: ModuleFormat
    get() = js.reflect.unsafeCast("module-typescript")

inline val ModuleFormat.Companion.wasm: ModuleFormat
    get() = js.reflect.unsafeCast("wasm")
