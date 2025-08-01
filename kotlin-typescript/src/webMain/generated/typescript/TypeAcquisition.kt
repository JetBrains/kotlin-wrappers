// Automatically generated - do not modify!

package typescript

sealed external interface TypeAcquisition {
    var enable: Boolean?
    var include: js.array.ReadonlyArray<String>?
    var exclude: js.array.ReadonlyArray<String>?
    var disableFilenameBasedTypeAcquisition: Boolean?

    operator fun get(key: String): CompilerOptionsValue

    operator fun set(
        key: String,
        value: CompilerOptionsValue,
    )
}
