@file:JsModule("react")

package react

external interface SuspenseProps :
    PropsWithChildren {

    var fallback: ReactNode?
}

/**
 * [Online Documentation](https://react.dev/reference/react/Suspense)
 */
external val Suspense: ExoticComponent<SuspenseProps>
