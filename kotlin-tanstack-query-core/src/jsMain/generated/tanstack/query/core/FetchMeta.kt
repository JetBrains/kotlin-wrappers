// Automatically generated - do not modify!

package tanstack.query.core

sealed external interface FetchMeta {
    var fetchMore: FetchMore?

    sealed interface FetchMore {
        var direction: FetchDirection
    }
}
