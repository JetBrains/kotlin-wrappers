// Automatically generated - do not modify!

package web.permissions

import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions)
 */
sealed external class Permissions {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query)
     */
    @JsAsync
    suspend fun query(permissionDesc: PermissionDescriptor): PermissionStatus

    @JsName("query")
    fun queryAsync(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}
