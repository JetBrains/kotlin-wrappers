// Automatically generated - do not modify!

package tanstack.query.core

external interface DehydrateOptions {
    var shouldDehydrateMutation: (mutation: Mutation<*, *, *, *>) -> Boolean
    var shouldDehydrateQuery: (query: Query<*, *, *, *>) -> Boolean
}
