package web.mcp

import web.experimental.ExperimentalWebApi

/**
 * Registration handle returned by registration methods.
 */
@ExperimentalWebApi
external interface RegistrationHandle {
    /**
     * Unregisters the associated item.
     */
    fun unregister()
}
