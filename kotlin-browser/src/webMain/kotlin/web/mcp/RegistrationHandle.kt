package web.mcp

/**
 * Registration handle returned by registration methods.
 */
external interface RegistrationHandle {
    /**
     * Unregisters the associated item.
     */
    fun unregister()
}
