// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.MutationFilters
import tanstack.query.core.MutationKey

external interface UseIsMutatingOptions : ContextOptions

external fun useIsMutating(
    filters: MutationFilters = definedExternally,
    options: UseIsMutatingOptions = definedExternally,
): Int

external fun useIsMutating(
    mutationKey: MutationKey = definedExternally,
    filters: MutationFilters = definedExternally,
    options: UseIsMutatingOptions = definedExternally,
): Int
