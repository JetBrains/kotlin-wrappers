package kotlinx.js

external interface RequestInit : org.w3c.fetch.RequestInit {
    var signal: AbortSignal?
}
