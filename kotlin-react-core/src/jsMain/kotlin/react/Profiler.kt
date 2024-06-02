@file:JsModule("react")

package react

external interface ProfilerProps : PropsWithChildren {
    var id: String
    var onRender: ProfilerOnRenderCallback
}

external val Profiler: ExoticComponent<ProfilerProps>
