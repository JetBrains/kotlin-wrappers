// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName("""(/*union*/{Comment: 'comment', Region: 'region', Code: 'code', Imports: 'imports'}/*union*/)""")
sealed external interface OutliningSpanKind {
    companion object {
        /** Single or multi-line comments */
        val Comment: OutliningSpanKind

        /** Sections marked by '// #region' and '// #endregion' comments */
        val Region: OutliningSpanKind

        /** Declarations and expressions */
        val Code: OutliningSpanKind

        /** Contiguous blocks of import declarations */
        val Imports: OutliningSpanKind
    }
}
