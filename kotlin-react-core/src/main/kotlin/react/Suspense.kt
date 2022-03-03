@file:JsModule("react")
@file:JsNonModule

package react

external interface SuspenseProps : PropsWithChildren {
    var fallback: ReactNode?
}

external val Suspense: ExoticComponent<SuspenseProps>
