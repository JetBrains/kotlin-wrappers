package example.table

import example.entities.User
import example.selection.useSetSelectedUser
import react.useCallback

internal fun useUserClickHandler(): (User) -> Unit {
    val setSelectedUser = useSetSelectedUser()

    return useCallback {
        setSelectedUser(it)
    }
}
