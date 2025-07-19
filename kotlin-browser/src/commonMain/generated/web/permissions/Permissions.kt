// Automatically generated - do not modify!

package web.permissions

import js.promise.Promise
import js.promise.await
import kotlin.js.JsName

/**
 * The **`Permissions`** interface of the Permissions API provides the core Permission API functionality, such as methods for querying and revoking permissions - Permissions.query - : Returns the user permission status for a given API.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions)
 */
open external class Permissions
private constructor() {
    /**
     * The **`query()`** method of the Permissions interface returns the state of a user permission on the global scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query)
     */
    @JsName("query")
    fun queryAsync(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}

/**
 * The **`query()`** method of the Permissions interface returns the state of a user permission on the global scope.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query)
 */
suspend inline fun Permissions.query(permissionDesc: PermissionDescriptor): PermissionStatus {
    return queryAsync(permissionDesc = permissionDesc).await()
}
