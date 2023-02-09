// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")

package tanstack.react.query

import tanstack.query.core.HydrateOptions

external fun useHydrate(
    state: Any?,
    options: Any /* HydrateOptions & ContextOptions */ = definedExternally,
)

external interface HydrateProps : react.PropsWithChildren {
    var state: Any?
    var options: HydrateOptions
    override var children: react.ReactNode?
}

external val Hydrate: react.FC<HydrateProps>
