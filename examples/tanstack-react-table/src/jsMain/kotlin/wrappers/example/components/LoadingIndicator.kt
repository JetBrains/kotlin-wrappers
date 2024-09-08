package wrappers.example.components

import react.FC
import wrappers.example.hooks.useUsers

val LoadingIndicator = FC {
    val users = useUsers()

    if (users.isEmpty())
        +"Loading..."
}
