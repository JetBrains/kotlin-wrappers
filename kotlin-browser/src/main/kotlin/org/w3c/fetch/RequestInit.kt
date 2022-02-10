package org.w3c.fetch

var RequestInit.signal: AbortSignal?
    get() = asDynamic().signal
    set(value) {
        asDynamic().signal = value
    }
