package team.karakum.components

import react.FC
import team.karakum.hooks.useUsers

val LoadingIndicator = FC {
    val users = useUsers()

    if (users.isEmpty())
        +"Loading..."
}
