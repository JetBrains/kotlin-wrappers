package wrappers.example.app

import wrappers.example.hooks.useUsersOrNull

fun useIsLoading(): Boolean =
    useUsersOrNull() == null
