// Automatically generated - do not modify!

package electron.core

external interface ClearStorageDataOptions {
    /**
     * Should follow `window.location.origin`’s representation `scheme://host:port`.
     */
    var origin: String?

    /**
     * The types of storages to clear, can be `cookies`, `filesystem`, `indexdb`,
     * `localstorage`, `shadercache`, `websql`, `serviceworkers`, `cachestorage`. If
     * not specified, clear all storage types.
     */
    var storages: js.array.ReadonlyArray<ClearStorageDataOptionsStorage>?

    /**
     * The types of quotas to clear, can be `temporary`. If not specified, clear all
     * quotas.
     */
    var quotas: js.array.ReadonlyArray<String /* 'temporary' */>?
}
