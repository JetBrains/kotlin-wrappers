package org.w3c.fetch

external class AbortController : kotlinx.js.AbortController {
    /**
     * Returns the AbortSignal object associated with this object.
     */
    override val signal: AbortSignal

    /**
     * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
     */
    override fun abort()
}
