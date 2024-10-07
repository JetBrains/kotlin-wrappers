// Automatically generated - do not modify!

package actions.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface SummaryTableCell {
    /**
     * Cell content
     */
    val data: String

    /**
     * Render cell as header
     * (optional) default: false
     */
    val header: Boolean?

    /**
     * Number of columns the cell extends
     * (optional) default: '1'
     */
    val colspan: String?

    /**
     * Number of rows the cell extends
     * (optional) default: '1'
     */
    val rowspan: String?
}
