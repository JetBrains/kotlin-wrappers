package kotlinx.js

external interface AbortSignal {
    val aborted: Boolean
    var onabort: Function<Unit>?
}

// CONSTRUCTOR EMULATION START

@JsName("AbortSignal")
private external class AbortSignalImpl : AbortSignal {
    override val aborted: Boolean
    override var onabort: Function<Unit>?
}

fun AbortSignal(): AbortSignal =
    AbortSignalImpl()

// CONSTRUCTOR EMULATION END
