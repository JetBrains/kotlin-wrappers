// Automatically generated - do not modify!

package muix.tree.view

import js.array.ReadonlyArray
import js.reflect.unsafeCast

/**
 * The selection of a Tree View: the ids of the selected items when `multiSelect` is `true`, one id or `null`
 * otherwise (`TreeViewSelectionValue<Multiple>` upstream). Built with the factories below and read back with
 * [asMultiple] or [asSingle], whichever the component is configured for.
 */
sealed external interface TreeViewSelectionValue

/**
 * The selection of a `multiSelect` Tree View.
 */
inline fun TreeViewSelectionValue(
    ids: ReadonlyArray<TreeViewItemId>,
): TreeViewSelectionValue =
    unsafeCast(ids)

/**
 * The selection of a single-select Tree View; `null` is an empty selection.
 */
inline fun TreeViewSelectionValue(
    id: TreeViewItemId?,
): TreeViewSelectionValue? =
    unsafeCast(id)

/**
 * The selected ids regardless of the selection mode: an empty selection is an empty array and a single id is a
 * selection of one item.
 */
fun TreeViewSelectionValue?.asMultiple(): ReadonlyArray<TreeViewItemId> =
    when {
        this == null -> emptyArray()
        kotlin.js.jsTypeOf(this) == "string" -> arrayOf(unsafeCast<TreeViewItemId>(this))
        else -> unsafeCast(this)
    }

/**
 * The selected id regardless of the selection mode: the first id of a multi-selection, `null` when nothing is
 * selected.
 */
fun TreeViewSelectionValue?.asSingle(): TreeViewItemId? =
    asMultiple().firstOrNull()
