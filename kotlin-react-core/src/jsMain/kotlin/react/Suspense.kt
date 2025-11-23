@file:JsModule("react")

package react

external interface SuspenseProps :
    PropsWithChildren {

    var fallback: ReactNode?

    /**
     * A name for this Suspense boundary for instrumentation purposes.
     * The name will help identify this boundary in React DevTools.
     */
    var name: String?

    /**
     * The presence of this prop indicates that the content is computationally expensive to render.
     * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
     *
     * [https://github.com/facebook/react/pull/19936](https://github.com/facebook/react/pull/19936)
     */
    var defer: Boolean?
}

/**
 * [Online Documentation](https://react.dev/reference/react/Suspense)
 */
external val Suspense: ExoticComponent<SuspenseProps>
