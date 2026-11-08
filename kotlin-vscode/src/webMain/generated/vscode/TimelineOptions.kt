// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject

/**
 * Options for a timeline request.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineOptions)
 */
@JsPlainObject
external interface TimelineOptions {
    /**
     * A [cursor][Timeline.cursor] from a previous result, to request the items that come after it.
     * `undefined` requests the newest items.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineOptions.cursor)
     */
    val cursor: String?

    /**
     * The number of items requested. Returning more or fewer items is allowed; return a
     * [cursor][Timeline.cursor] when there are more. `undefined` requests all items.
     *
     * When a timeline changes, the newest items are requested again, with a `limit` of at least the
     * number of items already loaded.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineOptions.limit)
     */
    val limit: Int?

    /**
     * Why the timeline is requested.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TimelineOptions.triggerKind)
     */
    val triggerKind: TimelineTriggerKind
}
