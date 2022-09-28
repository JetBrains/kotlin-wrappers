package web.http

import web.AbortSignal

external interface RequestInit : org.w3c.fetch.RequestInit {
    var signal: AbortSignal?
}
