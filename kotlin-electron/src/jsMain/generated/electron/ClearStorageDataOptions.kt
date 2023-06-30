package electron


external interface ClearStorageDataOptions {
    /**
     * Should follow `window.location.origin`’s representation `scheme://host:port`.
     */
    var origin: String?

    /**
     * The types of storages to clear, can contain: `cookies`, `filesystem`, `indexdb`,
     * `localstorage`, `shadercache`, `websql`, `serviceworkers`, `cachestorage`. If
     * not specified, clear all storage types.
     */
    var storages: js.core.ReadonlyArray<String>?

    /**
     * The types of quotas to clear, can contain: `temporary`, `syncable`. If not
     * specified, clear all quotas.
     */
    var quotas: js.core.ReadonlyArray<String>?
}
