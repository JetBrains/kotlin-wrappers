// Automatically generated - do not modify!

package tanstack.history

import js.objects.JsPlainObject

@JsPlainObject
external interface ParsedHistoryState : HistoryState {
    var key: String?
    var __TSR_key: String?
    var __TSR_index: Int

    /** Whether to reset scroll position on this navigation (default: true) */
    var __TSR_resetScroll: Boolean?

    /** Session id for cached TSR internals */
    var __TSR_sessionId: String?

    /** Match snapshot for fast-path on back/forward navigation */
    var __TSR_matches: (Temp0)?
}
