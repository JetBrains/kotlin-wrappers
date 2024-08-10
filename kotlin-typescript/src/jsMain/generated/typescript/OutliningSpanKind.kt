// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

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
