package karakum.tanstack.karakum.tauri.apps.api

import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.array.ReadonlyArray
import js.objects.recordOf

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        input = manyOf(
            "index.d.ts",
            "menu/base.d.ts",
            "menu/checkMenuItem.d.ts",
            "menu/iconMenuItem.d.ts",
            "menu/menu.d.ts",
            "menu/menuItem.d.ts",
            "menu/predefinedMenuItem.d.ts",
            "menu/submenu.d.ts",
            "app.d.ts",
            "core.d.ts",
            "dpi.d.ts",
            "event.d.ts",
            "image.d.ts",
            "menu.d.ts",
            "mocks.d.ts",
            "path.d.ts",
            "tray.d.ts",
            "webview.d.ts",
            "webviewWindow.d.ts",
            "window.d.ts",
        )
        //libraryNameOutputPrefix = true
    }
}
