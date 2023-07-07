package remix.run.router


/**
 * Map of routeId -> data returned from a loader/action/error
 */

sealed external interface RouteData {


    @Suppress(
        "DEPRECATION",
        "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    )
    @nativeGetter
    operator fun get(key: String): Any?


    @Suppress(
        "DEPRECATION",
        "NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
    )
    @nativeSetter
    operator fun set(key: String, value: Any?)


}
