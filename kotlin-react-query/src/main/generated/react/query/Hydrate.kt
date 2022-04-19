// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

package react.query

external fun useHydrate(
    state: dynamic,
    options: HydrateOptions = definedExternally,
)

external interface HydrateProps : react.PropsWithChildren {
    var state: dynamic
    var options: HydrateOptions
    override var children: react.ReactNode?
}

external val Hydrate: react.FC<HydrateProps>
