// Automatically generated - do not modify!

package node.vm

import node.buffer.Buffer

sealed external interface ScriptOptions : BaseOptions {
    var displayErrors: Boolean?
    var timeout: Number?
    var cachedData: Buffer?

    /** @deprecated in favor of `script.createCachedData()` */
    var produceCachedData: Boolean?
}
