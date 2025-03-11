package wrappers.example.app

import wrappers.example.hooks.usePhotosOrNull

fun useIsLoading(): Boolean =
    usePhotosOrNull() == null
