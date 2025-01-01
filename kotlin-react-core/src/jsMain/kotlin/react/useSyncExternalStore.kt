@file:JsModule("react")

package react

/**
 * [Online Documentation](https://react.dev/reference/react/useSyncExternalStore)
 */
external fun <Snapshot> useSyncExternalStore(
    subscribe: (onStoreChange: () -> Unit) -> Cleanup,
    getSnapshot: () -> Snapshot,
    getServerSnapshot: () -> Snapshot = definedExternally,
): Snapshot
