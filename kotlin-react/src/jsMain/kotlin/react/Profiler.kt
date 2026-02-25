@file:JsModule("react")

package react

external interface ProfilerProps :
    PropsWithChildren {

    var id: String
    var onRender: ProfilerOnRenderCallback
}

/**
 * [Online Documentation](https://react.dev/reference/react/Profiler)
 */
external val Profiler: ExoticComponent<ProfilerProps>
