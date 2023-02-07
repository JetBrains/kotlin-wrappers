// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Legacy: 1, Auto: 2, Force: 3}/*union*/)""")
external enum class ModuleDetectionKind {
    /**
     * Files with imports, exports and/or import.meta are considered modules
     */
    Legacy,

    /**
     * Legacy, but also files with jsx under react-jsx or react-jsxdev and esm mode files under moduleResolution: node16+
     */
    Auto,

    /**
     * Consider all non-declaration files modules, regardless of present syntax
     */
    Force,

    ;
}
