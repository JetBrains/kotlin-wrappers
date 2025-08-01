// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.array.Tuple2
import js.core.JsInt
import js.objects.JsPlainObject

/**
 * Label describing the [Tree item][TreeItem]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItemLabel)
 */
@JsPlainObject
external interface TreeItemLabel {
    /**
     * A human-readable string describing the [Tree item][TreeItem].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItemLabel.label)
     */
    var label: String

    /**
     * Ranges in the label to highlight. A range is defined as a tuple of two number where the
     * first is the inclusive start index and the second the exclusive end index
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TreeItemLabel.highlights)
     */
    var highlights: ReadonlyArray<Tuple2<JsInt, JsInt>>?
}
