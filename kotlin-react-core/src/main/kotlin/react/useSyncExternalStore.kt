@file:JsModule("react")
@file:JsNonModule

package react

/**
 * Available since 18.0
 *
 * @see <a href="https://github.com/reactwg/react-18/discussions/86">Discussion</a>
 */
external fun <Snapshot> useSyncExternalStore(
    subscribe: (onStoreChange: () -> Unit) -> Cleanup,
    getSnapshot: () -> Snapshot,
    getServerSnapshot: () -> Snapshot = definedExternally,
): Snapshot
