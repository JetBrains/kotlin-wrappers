import org.gradle.api.Project

internal enum class JsTarget(
    val js: Boolean = false,
    val wasm: Boolean = false,
) {
    COMMON(js = true, wasm = true),
    JS(js = true),
    WASM(wasm = true),

    ;
}

internal val Project.jsTarget: JsTarget
    get() {
        val target = findProperty("js.target") as String?

        return if (target != null) {
            JsTarget.valueOf(target.uppercase())
        } else JsTarget.JS
    }
