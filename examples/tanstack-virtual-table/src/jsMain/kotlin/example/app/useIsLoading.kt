package example.app

import example.hooks.usePhotosOrNull

fun useIsLoading(): Boolean =
    usePhotosOrNull() == null
