// Automatically generated - do not modify!

package web.cssom

import js.array.ReadonlyArray

/**
 * The **`CSSLayerStatementRule`** represents a @layer statement rule. Unlike CSSLayerBlockRule, it doesn't contain other rules and merely defines one or several layers by providing their names.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSLayerStatementRule)
 */
open external class CSSLayerStatementRule
private constructor() :
    CSSRule {
    /**
     * The read-only **`nameList`** property of the CSSLayerStatementRule interface returns the list of associated cascade layer names. The names can't be modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSLayerStatementRule/nameList)
     */
    open val nameList: ReadonlyArray<JsString>
}
