// Automatically generated - do not modify!

package tanstack.react.query

import tanstack.query.core.HydrateOptions
import tanstack.query.core.QueryClient

external interface HydrationBoundaryProps :
    react.PropsWithChildren {
    var state: Any /* DehydratedState | null | undefined */
    var options: HydrateOptions /* OmitKeyof<HydrateOptions, 'defaultOptions'> & { defaultOptions?: OmitKeyof<Exclude<HydrateOptions['defaultOptions'], undefined>, 'mutations'>; } */?
    override var children: react.ReactNode?
    var queryClient: QueryClient?
}
