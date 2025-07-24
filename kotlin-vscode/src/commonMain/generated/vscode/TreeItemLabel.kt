// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsInt

/**
 * Label describing the {@link TreeItem Tree item}
 */
external interface TreeItemLabel {
    /**
     * A human-readable string describing the {@link TreeItem Tree item}.
     */
    var label: String

    /**
     * Ranges in the label to highlight. A range is defined as a tuple of two number where the
     * first is the inclusive start index and the second the exclusive end index
     */
    var highlights: ReadonlyArray<Tuple2<JsInt, JsInt>>?
}
