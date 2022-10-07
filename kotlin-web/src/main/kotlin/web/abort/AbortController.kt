package web.abort

external class AbortController {
    val signal: AbortSignal
    fun abort()
}
