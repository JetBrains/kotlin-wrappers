package karakum.tauri.apps.api

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import io.github.sgrishchenko.karakum.util.ruleOf
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
    "event",
    "image",

    "menu/checkMenuItem",
    "menu/iconMenuItem",
    "menu/menu",
    "menu/menuItem",
    "menu/predefinedMenuItem",
    "menu/submenu",

    "webview",
    "webviewWindow",
    "window",
)

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertBuiltinTauriTypeReference
        )
        inheritanceModifiers = manyOf()

        input = manyOf("**/*.d.ts")
        isolatedOutputPackage = true

        packageNameMapper = recordOf(
            *conflictingFiles.renameCaseConflicts()
        )

        // disable defaults
        moduleNameMapper = recordOf()

        importMapper = recordOf(
            "\\./app" to ruleOf("tauri.apps.api.app"),
            "\\./core" to ruleOf("tauri.apps.api.core"),
            "\\./dpi" to ruleOf("tauri.apps.api.dpi"),
            "\\./event" to ruleOf("tauri.apps.api.event"),
            "\\./image" to ruleOf("tauri.apps.api.image"),
            "\\./mocks" to ruleOf("tauri.apps.api.mocks"),
            "\\./path" to ruleOf("tauri.apps.api.path"),
            "\\./tray" to ruleOf("tauri.apps.api.tray"),
            "\\./webview" to ruleOf(
                "WebviewWindow" to "tauri.apps.api.webviewWindow.WebviewWindow",
                "Color" to "tauri.apps.api.window.Color",
                ".+" to "tauri.apps.api.webview."
            ),
            "\\./webviewWindow" to ruleOf("tauri.apps.api.webviewWindow"),
            "\\./window" to ruleOf(
                "LogicalPosition" to "tauri.apps.api.dpi.LogicalPosition",
                "PhysicalPosition" to "tauri.apps.api.dpi.PhysicalPosition",
                ".+" to "tauri.apps.api.window."
            ),

            "^\\./(menu/)?base" to ruleOf("tauri.apps.api.menu.base"),
            "^\\./(menu/)?checkMenuItem" to ruleOf("tauri.apps.api.menu.checkMenuItem"),
            "^\\./(menu/)?iconMenuItem" to ruleOf("tauri.apps.api.menu.iconMenuItem"),
            "^\\./(menu/)?menuItem" to ruleOf("tauri.apps.api.menu.menuItem"),
            "^\\./(menu/)?predefinedMenuItem" to ruleOf("tauri.apps.api.menu.predefinedMenuItem"),
            "^\\./(menu/)?submenu" to ruleOf("tauri.apps.api.menu.submenu"),

            "^\\./(menu/)?menu$" to ruleOf(
                "Submenu" to "tauri.apps.api.menu.submenu.Submenu",
                ".+" to "tauri.apps.api.menu.menu.",
            ),

            "^\\.\\./menu$" to ruleOf(
                "MenuItemOptions" to "tauri.apps.api.menu.menuItem.MenuItemOptions",
                "SubmenuOptions" to "tauri.apps.api.menu.submenu.SubmenuOptions",
            )
        )
    }
}
