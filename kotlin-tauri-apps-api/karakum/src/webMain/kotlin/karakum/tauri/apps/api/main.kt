package karakum.tauri.apps.api

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf
import karakum.tauri.apps.api.plugins.convertBuiltinTauriTypeReference

private fun Array<String>.renameCaseConflicts(suffix: String = "_lc"): Array<Pair<String, String>> {
    return map { path ->
        path.substringAfterLast("/").let { name ->
            "(^|/)$name\\.kt$" to "$1${name}$suffix.kt"
        }
    }.toTypedArray()
}

private val conflictingFiles = arrayOf(
    "menu/menuItem",
    "menu/predefinedMenuItem",
    "event",
    "webview",
    "webviewWindow",
    "window",
    "menu/menu",
    "menu/submenu",
    "menu/checkMenuItem",
    "menu/iconMenuItem",
    "image"
)

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = manyOf("**/*.d.ts")
        libraryNameOutputPrefix = true
        plugins = manyOf(
            convertBuiltinTauriTypeReference
        )
        packageNameMapper = recordOf(
            *conflictingFiles.renameCaseConflicts()
        )
        inheritanceModifiers = manyOf(

        )
    }
}
