@file:JsModule("react")

package react

external interface ActivityProps :
    PropsWithChildren {

    var mode: ActivityMode?

    /**
     * A name for this Activity boundary for instrumentation purposes.
     * The name will help identify this boundary in React DevTools.
     */
    var name: String?
}

/**
 * [Online Documentation](https://react.dev/reference/react/Activity)
 */
external val Activity: ExoticComponent<ActivityProps>
