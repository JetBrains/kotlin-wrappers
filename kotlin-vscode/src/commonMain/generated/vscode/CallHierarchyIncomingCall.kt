// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents an incoming call, e.g. a caller of a method or constructor.
 */
open external class CallHierarchyIncomingCall {
    /**
     * The item that makes the call.
     */
    var from: CallHierarchyItem

    /**
     * The range at which at which the calls appears. This is relative to the caller
     * denoted by {@linkcode CallHierarchyIncomingCall.from this.from}.
     */
    var fromRanges: ReadonlyArray<Range>

    /**
     * Create a new call object.
     *
     * @param item The item making the call.
     * @param fromRanges The ranges at which the calls appear.
     */
    constructor(
        item: CallHierarchyItem,
        fromRanges: ReadonlyArray<Range>,
    )
}
