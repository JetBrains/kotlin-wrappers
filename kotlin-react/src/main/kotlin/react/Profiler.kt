@file:JsModule("react")
@file:JsNonModule

package react

external interface ProfilerProps : RProps {
    var id: String
    var onRender: (
        id: String,
        phase: String,
        actualDuration: Number,
        baseDuration: Number,
        startTime: Number,
        commitTime: Number,
        interactions: dynamic,
    ) -> Unit
}

external val Profiler: ComponentClass<ProfilerProps>
