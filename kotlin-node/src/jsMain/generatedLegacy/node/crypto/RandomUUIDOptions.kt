// Automatically generated - do not modify!

package node.crypto

sealed external interface RandomUUIDOptions {
    /**
     * By default, to improve performance,
     * Node.js will pre-emptively generate and persistently cache enough
     * random data to generate up to 128 random UUIDs. To generate a UUID
     * without using the cache, set `disableEntropyCache` to `true`.
     *
     * @default `false`
     */
    var disableEntropyCache: Boolean?
}
