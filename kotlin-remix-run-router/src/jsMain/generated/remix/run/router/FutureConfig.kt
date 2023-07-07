package remix.run.router


/**
 * Future flags to toggle new feature behavior
 */

sealed external interface FutureConfig {
    var v7_normalizeFormMethod: Boolean
    var v7_prependBasename: Boolean
}
