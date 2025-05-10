// Automatically generated - do not modify!

package typescript

sealed external interface TypeAcquisition {
    var enable: Boolean?
    var include: js.array.ReadonlyArray<String>?
    var exclude: js.array.ReadonlyArray<String>?
    var disableFilenameBasedTypeAcquisition: Boolean?

    @seskar.js.JsNativeGetter
    operator fun get(key: String): CompilerOptionsValue

    @seskar.js.JsNativeSetter
    operator fun set(
        key: String,
        value: CompilerOptionsValue,
    )
}
