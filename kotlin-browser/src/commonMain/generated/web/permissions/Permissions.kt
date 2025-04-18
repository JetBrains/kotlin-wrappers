// Automatically generated - do not modify!

package web.permissions

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
 * The **`Permissions`** interface of the Permissions API provides the core Permission API functionality, such as methods for querying and revoking permissions - Permissions.query - : Returns the user permission status for a given API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions)
 */
external class Permissions
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun query(permissionDesc: PermissionDescriptor): PermissionStatus

    @JsName("query")
    fun queryAsync(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}
