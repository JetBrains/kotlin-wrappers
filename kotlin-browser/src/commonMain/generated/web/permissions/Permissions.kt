// Automatically generated - do not modify!

package web.permissions

import js.promise.Promise
import seskar.js.JsAsync
import kotlin.js.JsName

/**
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
