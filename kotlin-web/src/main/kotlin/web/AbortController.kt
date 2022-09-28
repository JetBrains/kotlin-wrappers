package web

external interface AbortController {
    val signal: AbortSignal
    fun abort()
}

// CONSTRUCTOR EMULATION START

@JsName("AbortController")
private external class AbortControllerImpl : AbortController {
    override val signal: AbortSignal
    override fun abort()

}

fun AbortController(): AbortController =
    AbortControllerImpl()

// CONSTRUCTOR EMULATION END
