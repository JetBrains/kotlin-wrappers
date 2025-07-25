// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents an outgoing call, e.g. calling a getter from a method or a method from a constructor etc.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyOutgoingCall)
 */
open external class CallHierarchyOutgoingCall {
    /**
     * The item that is called.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyOutgoingCall.to)
     */
    var to: CallHierarchyItem

    /**
     * The range at which this item is called. This is the range relative to the caller, e.g the item
     * passed to {@linkcode CallHierarchyProvider.provideCallHierarchyOutgoingCalls provideCallHierarchyOutgoingCalls}
     * and not {@linkcode CallHierarchyOutgoingCall.to this.to}.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyOutgoingCall.fromRanges)
     */
    var fromRanges: ReadonlyArray<Range>

    /**
     * Create a new call object.
     *
     * @param item The item being called
     * @param fromRanges The ranges at which the calls appear.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyOutgoingCall.constructor)
     */
    constructor(
        item: CallHierarchyItem,
        fromRanges: ReadonlyArray<Range>,
    )
}
