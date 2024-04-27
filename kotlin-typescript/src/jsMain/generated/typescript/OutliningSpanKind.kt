// Automatically generated - do not modify!

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
