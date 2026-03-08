// Automatically generated - do not modify!

package testing.library.user.event

// unhandled import: setupMain from "./setup"
// unhandled import: * as directApi from "./directApi"

external interface UserEvent {
    fun setup(options: Options = definedExternally): UserEvent

    @JsName("clear")
    fun clearAsync(element: web.dom.Element): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun clear(element: web.dom.Element): js.core.Void

    @JsName("click")
    fun clickAsync(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun click(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("copy")
    fun copyAsync(options: DirectOptions = definedExternally): js.promise.Promise<web.data.DataTransfer?>

    @seskar.js.JsAsync
    suspend fun copy(options: DirectOptions = definedExternally): web.data.DataTransfer?

    @JsName("cut")
    fun cutAsync(options: DirectOptions = definedExternally): js.promise.Promise<web.data.DataTransfer?>

    @seskar.js.JsAsync
    suspend fun cut(options: DirectOptions = definedExternally): web.data.DataTransfer?

    @JsName("dblClick")
    fun dblClickAsync(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun dblClick(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: web.dom.Element,
        values: web.html.HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<web.html.HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: web.dom.Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: web.dom.Element,
        values: web.html.HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<web.html.HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: web.dom.Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("hover")
    fun hoverAsync(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun hover(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("keyboard")
    fun keyboardAsync(
        text: String,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<System>

    @seskar.js.JsAsync
    suspend fun keyboard(
        text: String,
        options: DirectOptions = definedExternally,
    ): System

    @JsName("pointer")
    fun pointerAsync(
        input: PointerInput,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<System>

    @seskar.js.JsAsync
    suspend fun pointer(
        input: PointerInput,
        options: DirectOptions = definedExternally,
    ): System

    @JsName("paste")
    fun pasteAsync(): js.promise.Promise<js.core.Void>

    @JsName("paste")
    fun pasteAsync(
        clipboardData: web.data.DataTransfer = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("paste")
    fun pasteAsync(
        clipboardData: String = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun paste(): js.core.Void

    @seskar.js.JsAsync
    suspend fun paste(
        clipboardData: web.data.DataTransfer = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun paste(
        clipboardData: String = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: web.dom.Element,
        values: web.html.HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<web.html.HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: web.dom.Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: web.dom.Element,
        values: web.html.HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<web.html.HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: web.dom.Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: web.dom.Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("tripleClick")
    fun tripleClickAsync(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun tripleClick(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("type")
    fun typeAsync(
        element: web.dom.Element,
        text: String,
        options: DirectTypeOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun type(
        element: web.dom.Element,
        text: String,
        options: DirectTypeOptions = definedExternally,
    ): js.core.Void

    @JsName("unhover")
    fun unhoverAsync(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun unhover(
        element: web.dom.Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("upload")
    fun uploadAsync(
        element: web.html.HTMLElement,
        fileOrFiles: web.file.File,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @JsName("upload")
    fun uploadAsync(
        element: web.html.HTMLElement,
        fileOrFiles: js.array.ReadonlyArray<web.file.File>,
        options: DirectOptions = definedExternally,
    ): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun upload(
        element: web.html.HTMLElement,
        fileOrFiles: web.file.File,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun upload(
        element: web.html.HTMLElement,
        fileOrFiles: js.array.ReadonlyArray<web.file.File>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("tab")
    fun tabAsync(options: DirectTabOptions = definedExternally): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun tab(options: DirectTabOptions = definedExternally): js.core.Void
}
