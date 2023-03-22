// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Legacy: 1, Auto: 2, Force: 3}/*union*/)""")
sealed external interface ModuleDetectionKind {
    companion object {
        /**
         * Files with imports, exports and/or import.meta are considered modules
         */
        val Legacy: ModuleDetectionKind

        /**
         * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
         */
        val Auto: ModuleDetectionKind

        /**
         * Consider all non-declaration files modules, regardless of present syntax
         */
        val Force: ModuleDetectionKind
    }
}
