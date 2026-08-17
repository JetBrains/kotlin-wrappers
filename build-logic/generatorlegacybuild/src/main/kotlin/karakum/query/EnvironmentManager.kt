package karakum.query

import karakum.common.GENERATOR_COMMENT

// language=TypeScript
internal val ENVIRONMENT_MANAGER_SOURCE = """
declare const environmentManager: {
    /**
     * Returns whether the current runtime should be treated as a server environment.
     */
    isServer(): boolean;
    /**
     * Overrides the server check globally.
     */
    setIsServer(isServerValue: IsServerValue): void;
};
""".trim()

// language=kotlin
internal val ENVIRONMENT_MANAGER_CODE = """
// $GENERATOR_COMMENT

@file:JsModule("${Package.CORE.module}")

${Package.CORE.pkg}

sealed external class EnvironmentManager
private constructor() {
    fun isServer(): Boolean
    fun setIsServer(isServerValue: IsServerValue)
}
""".trim()

internal fun String.replaceEnvironmentManager(): String {
    if ("declare const environmentManager" !in this) return this

    check(ENVIRONMENT_MANAGER_SOURCE in this) { "Update `EnvironmentManager`! Source changed." }
    return replace(ENVIRONMENT_MANAGER_SOURCE, "declare const environmentManager: EnvironmentManager;")
}
