// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Checkbox state of the tree item
 */
sealed /* enum */
external interface TreeItemCheckboxState {
    companion object {
        /**
         * Determines an item is unchecked
         */
        val Unchecked: TreeItemCheckboxState // 0

        /**
         * Determines an item is checked
         */
        val Checked: TreeItemCheckboxState // 1
    }
}
