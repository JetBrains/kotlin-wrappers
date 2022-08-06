package node

external class AbortController : kotlinx.js.AbortController {
    override val signal: AbortSignal
    override fun abort()
}
