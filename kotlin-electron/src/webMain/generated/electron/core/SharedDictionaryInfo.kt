// Automatically generated - do not modify!

package electron.core

external interface SharedDictionaryInfo {
// Docs: https://electronjs.org/docs/api/structures/shared-dictionary-info
    /**
     * URL of the dictionary.
     */
    var dictionaryUrl: String

    /**
     * The expiration time for the dictionary which was declared in 'use-as-dictionary'
     * response header's `expires` option in seconds.
     */
    var expirationDuration: Double

    /**
     * The sha256 hash of the dictionary binary.
     */
    var hash: String

    /**
     * The Id for the dictionary which was declared in 'use-as-dictionary' response
     * header's `id` option.
     */
    var id: String

    /**
     * The time of when the dictionary was received from the network layer.
     */
    var lastFetchTime: js.date.Date

    /**
     * The time when the dictionary was last used.
     */
    var lastUsedTime: js.date.Date

    /**
     * The matching path pattern for the dictionary which was declared in
     * 'use-as-dictionary' response header's `match` option.
     */
    var match: String

    /**
     * An array of matching destinations for the dictionary which was declared in
     * 'use-as-dictionary' response header's `match-dest` option.
     */
    var matchDestinations: js.array.ReadonlyArray<String>

    /**
     * The time of when the dictionary was received from the server. For cached
     * responses, this time could be "far" in the past.
     */
    var responseTime: js.date.Date

    /**
     * The amount of bytes stored for this shared dictionary information object in
     * Chromium's internal storage (usually Sqlite).
     */
    var size: Double
}
