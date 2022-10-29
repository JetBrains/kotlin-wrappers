// Automatically generated - do not modify!

package web.permissions

import kotlin.js.Promise

sealed external class Permissions {
    fun query(permissionDesc: PermissionDescriptor): Promise<PermissionStatus>
}
