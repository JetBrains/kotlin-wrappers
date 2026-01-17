plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(jspkg.tauriApps.api)
}

tasks.generateKarakumExternals {
    doLast {
        addTauriFixes()
    }
}

fun addTauriFixes() {
    listOf(
        "core/Channel.kt",
        "core/Resource.kt",
        "menu/base/MenuItemBase.kt"
    ).forEach { path ->
        addFix(path) { content ->
            content.replace("var /* #private */: Any? /* type isn't declared */", "")
        }
    }

    listOf(
        "core/Resource.kt",
        "menu/base/MenuItemBase.kt",
        "menu/Menu.kt",
        "menu/Submenu.kt",
        "webviewwindow/WebviewWindow.kt",
        "webview/Webview.kt",
        "window/Window.kt"
    ).forEach { path ->
        addFix(path) { content ->
            content
                .replace("external class", "open external class")
                .replace("var label", "open var label")
                .replace("var listeners", "open var listeners")
                .replace("fun setBackgroundColor", "open fun setBackgroundColor")
                .replace("fun <T> listen", "open fun <T> listen")
                .replace("fun <T> once", "open fun <T> once")
        }
    }

    addFix("webviewwindow/WebviewWindow.kt") {
        it
            .replace("fun emit", "override fun emit")
            .replace("fun emitTo", "override fun emitTo")
            .replace("fun _handleTauriEvent", "override fun _handleTauriEvent")
            .replace("fun close", "override fun close")
            .replace("fun setSize", "override fun setSize")
            .replace("fun setPosition", "override fun setPosition")
            .replace("fun setFocus", "override fun setFocus")
            .replace("fun hide", "override fun hide")
            .replace("fun show", "override fun show")
            .replace("fun onDragDropEvent", "override fun onDragDropEvent")
            .replace("fun <T> listen", "override fun <T> listen")
            .replace("fun <T> once", "override fun <T> once")
            .replace("fun setBackgroundColor", "override fun setBackgroundColor")
            .replace("var label", "override var label")
            .replace("var listeners", "override var listeners")
            .replace("Window {", "// TODO @seskar.js.JsMixin tauri.apps.api.Window {")
            .replace("Webview,", "Webview {")
            .replace(
                "open override fun setBackgroundColor(color: Color): js.promise.Promise<js.core.Void>",
                "// TODO open override fun setBackgroundColor(color: Color): js.promise.Promise<js.core.Void>"
            )
    }

    listOf(
        "LogicalPositionObject",
        "LogicalSizeObject",
        "PhysicalPositionObject",
        "PhysicalSizeObject"
    ).forEach { fileName ->
        addFix("dpi/$fileName.kt") { content ->
            content.replaceFirst("interface $fileName", "interface ${fileName}Temp")
        }
    }

    listOf(
        "LogicalPosition",
        "LogicalSize",
        "PhysicalPosition",
        "PhysicalSize"
    ).forEach { fileName ->
        addFix("dpi/$fileName.kt") { content ->
            content.replaceFirst(
                "constructor (`object`: ${fileName}Object)",
                "constructor(`object`: ${fileName}ObjectTemp)"
            )
        }
    }

    addFix("app/DataStoreIdentifier.kt") {
        it.replace(Regex("js.array.Tuple16<.*?>"), "js.array.ReadonlyArray<Double>")
    }

    addFix("webviewwindow/WebviewWindowOptions.kt") {
        it.replace(Regex("Omit<.*?>"), "JsAny")
    }
}

fun addFix(
    relativePath: String,
    transform: (String) -> String,
) {
    val file = file("../src/webMain/generated/tauri/apps/api/$relativePath")
    require(file.exists()) {
        "File not found: $relativePath for fix"
    }

    val oldContent = file.readText()
    val newContent = transform(oldContent)

    require(oldContent != newContent) {
        "Transformation fo path `$relativePath` changed nothing!"
    }

    file.writeText(newContent)
}
