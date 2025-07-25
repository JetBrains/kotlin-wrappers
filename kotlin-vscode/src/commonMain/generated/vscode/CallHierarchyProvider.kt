// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.JsName

/**
 * The call hierarchy provider interface describes the contract between extensions
 * and the call hierarchy feature which allows to browse calls and caller of function,
 * methods, constructor etc.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyProvider)
 */
external interface CallHierarchyProvider {
    /**
     * Bootstraps call hierarchy by returning the item that is denoted by the given document
     * and position. This item will be used as entry into the call graph. Providers should
     * return `undefined` or `null` when there is no item at the given location.
     *
     * @param document The document in which the command was invoked.
     * @param position The position at which the command was invoked.
     * @param token A cancellation token.
     * @returns One or multiple call hierarchy items or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined`, `null`, or an empty array.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyProvider.prepareCallHierarchy)
     */
    @JsName("prepareCallHierarchy")
    fun prepareCallHierarchyAsync(
        document: TextDocument,
        position: Position,
        token: CancellationToken,
    ): ProviderResult<JsAny /* CallHierarchyItem | CallHierarchyItem[] */>

    /**
     * Provide all incoming calls for an item, e.g all callers for a method. In graph terms this describes directed
     * and annotated edges inside the call graph, e.g the given item is the starting node and the result is the nodes
     * that can be reached.
     *
     * @param item The hierarchy item for which incoming calls should be computed.
     * @param token A cancellation token.
     * @returns A set of incoming calls or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyProvider.provideCallHierarchyIncomingCalls)
     */
    @JsName("provideCallHierarchyIncomingCalls")
    fun provideCallHierarchyIncomingCallsAsync(
        item: CallHierarchyItem,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<CallHierarchyIncomingCall>>

    /**
     * Provide all outgoing calls for an item, e.g call calls to functions, methods, or constructors from the given item. In
     * graph terms this describes directed and annotated edges inside the call graph, e.g the given item is the starting
     * node and the result is the nodes that can be reached.
     *
     * @param item The hierarchy item for which outgoing calls should be computed.
     * @param token A cancellation token.
     * @returns A set of outgoing calls or a thenable that resolves to such. The lack of a result can be
     * signaled by returning `undefined` or `null`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyProvider.provideCallHierarchyOutgoingCalls)
     */
    @JsName("provideCallHierarchyOutgoingCalls")
    fun provideCallHierarchyOutgoingCallsAsync(
        item: CallHierarchyItem,
        token: CancellationToken,
    ): ProviderResult<ReadonlyArray<CallHierarchyOutgoingCall>>
}
