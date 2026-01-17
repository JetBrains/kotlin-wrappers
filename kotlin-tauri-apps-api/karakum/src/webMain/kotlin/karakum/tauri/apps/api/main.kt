package karakum.tauri.apps.api

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import io.github.sgrishchenko.karakum.util.ruleOf
import js.array.ReadonlyArray
import js.objects.recordOf
import karakum.tauri.apps.api.plugins.convertBuiltinTauriTypeReference

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = manyOf(
            convertBuiltinTauriTypeReference
        )
        inheritanceModifiers = manyOf()

        input = manyOf("**/*.d.ts")
        isolatedOutputPackage = true

        packageNameMapper = recordOf(
            "webviewWindow" to "webviewwindow",

            "menu/checkMenuItem/" to "menu/",
            "menu/iconMenuItem/" to "menu/",
            "menu/menu/" to "menu/",
            "menu/menuItem/" to "menu/",
            "menu/predefinedMenuItem/" to "menu/",
            "menu/submenu/" to "menu/",
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
            "\\./webview$" to ruleOf(
                "WebviewWindow" to "tauri.apps.api.webviewwindow.WebviewWindow",
                "Color" to "tauri.apps.api.window.Color",
                ".+" to "tauri.apps.api.webview."
            ),
            "\\./webviewWindow" to ruleOf("tauri.apps.api.webviewwindow"),
            "\\./window" to ruleOf(
                "LogicalPosition" to "tauri.apps.api.dpi.LogicalPosition",
                "PhysicalPosition" to "tauri.apps.api.dpi.PhysicalPosition",
                ".+" to "tauri.apps.api.window."
            ),

            "^\\./(menu/)?base" to ruleOf("tauri.apps.api.menu.base"),
            "^\\./(menu/)?checkMenuItem" to ruleOf("tauri.apps.api.menu"),
            "^\\./(menu/)?iconMenuItem" to ruleOf("tauri.apps.api.menu"),
            "^\\./(menu/)?menu$" to ruleOf("tauri.apps.api.menu"),
            "^\\./(menu/)?menuItem" to ruleOf("tauri.apps.api.menu"),
            "^\\./(menu/)?predefinedMenuItem" to ruleOf("tauri.apps.api.menu"),
            "^\\./(menu/)?submenu" to ruleOf("tauri.apps.api.menu"),

            "^\\.\\./menu$" to ruleOf("tauri.apps.api.menu")
        )
    }
}
