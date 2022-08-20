// Automatically generated - do not modify!

package node.vm

sealed external interface ScriptOptions : BaseOptions {
    var displayErrors: Boolean?
    var timeout: Number?
    var cachedData: node.buffer.Buffer?

    /** @deprecated in favor of `script.createCachedData()` */
    var produceCachedData: Boolean?
}
