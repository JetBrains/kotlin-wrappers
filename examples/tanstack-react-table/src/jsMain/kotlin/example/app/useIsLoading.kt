package example.app

import example.hooks.useUsersOrNull

fun useIsLoading(): Boolean =
    useUsersOrNull() == null
