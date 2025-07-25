// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents an incoming call, e.g. a caller of a method or constructor.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyIncomingCall)
 */
open external class CallHierarchyIncomingCall {
    /**
     * The item that makes the call.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyIncomingCall.from)
     */
    var from: CallHierarchyItem

    /**
     * The range at which at which the calls appears. This is relative to the caller
     * denoted by {@linkcode CallHierarchyIncomingCall.from this.from}.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyIncomingCall.fromRanges)
     */
    var fromRanges: ReadonlyArray<Range>

    /**
     * Create a new call object.
     *
     * @param item The item making the call.
     * @param fromRanges The ranges at which the calls appear.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyIncomingCall.constructor)
     */
    constructor(
        item: CallHierarchyItem,
        fromRanges: ReadonlyArray<Range>,
    )
}
