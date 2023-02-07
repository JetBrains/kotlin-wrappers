// Automatically generated - do not modify!

package actions.core

sealed external interface SummaryTableCell {
    /**
     * Cell content
     */
    var data: String

    /**
     * Render cell as header
     * (optional) default: false
     */
    var header: Boolean?

    /**
     * Number of columns the cell extends
     * (optional) default: '1'
     */
    var colspan: String?

    /**
     * Number of rows the cell extends
     * (optional) default: '1'
     */
    var rowspan: String?
}
