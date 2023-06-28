// Automatically generated - do not modify!

package web.permissions

import js.promise.Promise

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions) */
sealed external class Permissions {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Permissions/query) */
    fun query(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}
