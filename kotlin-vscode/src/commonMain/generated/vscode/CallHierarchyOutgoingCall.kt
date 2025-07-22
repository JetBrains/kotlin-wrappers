// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents an outgoing call, e.g. calling a getter from a method or a method from a constructor etc.
 */
open external class CallHierarchyOutgoingCall {
    /**
    // ORIGINAL SOURCE


    /**
     * The item that is called.
    */
    to: CallHierarchyItem;

    /**
     * The range at which this item is called. This is the range relative to the caller, e.g the item
     * passed to {@linkcode CallHierarchyProvider.provideCallHierarchyOutgoingCalls provideCallHierarchyOutgoingCalls}
     * and not {@linkcode CallHierarchyOutgoingCall.to this.to}.
    */
    fromRanges: Range[];

    /**
     * Create a new call object.
     *
     * @param item The item being called
     * @param fromRanges The ranges at which the calls appear.
    */
    constructor(item: CallHierarchyItem, fromRanges: Range[]);

    // ORIGINAL SOURCE
     **/
}
