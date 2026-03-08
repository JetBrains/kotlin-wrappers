// Automatically generated - do not modify!

package testing.library.user.event.setup

// unhandled import: setupMain from "./setup"
// unhandled import: * as directApi from "./directApi"
import js.promise.Promise
import testing.library.user.event.generated.DirectTabOptions
import testing.library.user.event.generated.DirectTypeOptions
import testing.library.user.event.options.Options
import testing.library.user.event.pointer.PointerInput
import testing.library.user.event.setup.directApi.DirectOptions
import testing.library.user.event.system.System
import web.data.DataTransfer
import web.dom.Element
import web.html.HTMLElement

external interface UserEvent {
    fun setup(options: Options = definedExternally): UserEvent

    @JsName("clear")
    fun clearAsync(element: Element): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun clear(element: Element): js.core.Void

    @JsName("click")
    fun clickAsync(
        element: Element,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun click(
        element: Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("copy")
    fun copyAsync(options: DirectOptions = definedExternally): Promise<DataTransfer?>

    @seskar.js.JsAsync
    suspend fun copy(options: DirectOptions = definedExternally): DataTransfer?

    @JsName("cut")
    fun cutAsync(options: DirectOptions = definedExternally): Promise<DataTransfer?>

    @seskar.js.JsAsync
    suspend fun cut(options: DirectOptions = definedExternally): DataTransfer?

    @JsName("dblClick")
    fun dblClickAsync(
        element: Element,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun dblClick(
        element: Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: Element,
        values: HTMLElement,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: Element,
        values: js.array.ReadonlyArray<HTMLElement>,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("deselectOptions")
    fun deselectOptionsAsync(
        select: Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: Element,
        values: HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: Element,
        values: js.array.ReadonlyArray<HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun deselectOptions(
        select: Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("hover")
    fun hoverAsync(
        element: Element,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun hover(
        element: Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("keyboard")
    fun keyboardAsync(
        text: String,
        options: DirectOptions = definedExternally,
    ): Promise<System>

    @seskar.js.JsAsync
    suspend fun keyboard(
        text: String,
        options: DirectOptions = definedExternally,
    ): System

    @JsName("pointer")
    fun pointerAsync(
        input: PointerInput,
        options: DirectOptions = definedExternally,
    ): Promise<System>

    @seskar.js.JsAsync
    suspend fun pointer(
        input: PointerInput,
        options: DirectOptions = definedExternally,
    ): System

    @JsName("paste")
    fun pasteAsync(): Promise<js.core.Void>

    @JsName("paste")
    fun pasteAsync(
        clipboardData: DataTransfer = definedExternally,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("paste")
    fun pasteAsync(
        clipboardData: String = definedExternally,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun paste(): js.core.Void

    @seskar.js.JsAsync
    suspend fun paste(
        clipboardData: DataTransfer = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun paste(
        clipboardData: String = definedExternally,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: Element,
        values: HTMLElement,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: Element,
        values: js.array.ReadonlyArray<HTMLElement>,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("selectOptions")
    fun selectOptionsAsync(
        select: Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: Element,
        values: HTMLElement,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: Element,
        values: js.array.ReadonlyArray<HTMLElement>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: Element,
        values: js.array.ReadonlyArray<String>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun selectOptions(
        select: Element,
        values: String,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("tripleClick")
    fun tripleClickAsync(
        element: Element,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun tripleClick(
        element: Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("type")
    fun typeAsync(
        element: Element,
        text: String,
        options: DirectTypeOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun type(
        element: Element,
        text: String,
        options: DirectTypeOptions = definedExternally,
    ): js.core.Void

    @JsName("unhover")
    fun unhoverAsync(
        element: Element,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun unhover(
        element: Element,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("upload")
    fun uploadAsync(
        element: HTMLElement,
        fileOrFiles: web.file.File,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @JsName("upload")
    fun uploadAsync(
        element: HTMLElement,
        fileOrFiles: js.array.ReadonlyArray<web.file.File>,
        options: DirectOptions = definedExternally,
    ): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun upload(
        element: HTMLElement,
        fileOrFiles: web.file.File,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @seskar.js.JsAsync
    suspend fun upload(
        element: HTMLElement,
        fileOrFiles: js.array.ReadonlyArray<web.file.File>,
        options: DirectOptions = definedExternally,
    ): js.core.Void

    @JsName("tab")
    fun tabAsync(options: DirectTabOptions = definedExternally): Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun tab(options: DirectTabOptions = definedExternally): js.core.Void
}
