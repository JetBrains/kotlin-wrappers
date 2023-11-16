@file:JsModule("react")

package react

external interface SuspenseProps : PropsWithChildren {
    var fallback: ReactNode?
}

external val Suspense: ExoticComponent<SuspenseProps>
