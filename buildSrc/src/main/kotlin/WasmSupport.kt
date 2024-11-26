import org.gradle.api.Project

internal val Project.wasmSupported: Boolean
    get() {
        val supported = findProperty("wasm.supported") as String?
            ?: return false

        return supported.toBoolean()
    }
