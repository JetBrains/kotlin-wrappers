// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OutliningSpanKind {
    companion object {
        /** Single or multi-line comments */
        @JsValue("comment")
        val Comment: OutliningSpanKind

        /** Sections marked by '// #region' and '// #endregion' comments */
        @JsValue("region")
        val Region: OutliningSpanKind

        /** Declarations and expressions */
        @JsValue("code")
        val Code: OutliningSpanKind

        /** Contiguous blocks of import declarations */
        @JsValue("imports")
        val Imports: OutliningSpanKind
    }
}
