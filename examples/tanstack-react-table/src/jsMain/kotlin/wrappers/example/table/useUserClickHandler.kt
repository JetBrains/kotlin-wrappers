package wrappers.example.table

import react.useCallback
import wrappers.example.entities.User
import wrappers.example.selection.useSetSelectedUser

internal fun useUserClickHandler(): (User) -> Unit {
    val setSelectedUser = useSetSelectedUser()

    return useCallback {
        setSelectedUser(it)
    }
}
