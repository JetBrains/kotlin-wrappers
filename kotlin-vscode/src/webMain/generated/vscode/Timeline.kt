// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * A set of timeline items returned by a [TimelineProvider] or a [WorkspaceTimelineProvider].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Timeline)
 */
@JsPlainObject
external interface Timeline {
    /**
     * The timeline items, ordered from newest to oldest.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Timeline.items)
     */
    val items: ReadonlyArray<TimelineItem>

    /**
     * A provider-defined cursor for requesting the items that come after the ones returned, see
     * [TimelineOptions.cursor]. Omit when there are no more items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#Timeline.cursor)
     */
    val cursor: String?
}
