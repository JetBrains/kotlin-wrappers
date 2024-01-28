package web.scheduling

external fun requestIdleCallback(
    callback: IdleRequestCallback,
    options: IdleRequestOptions = definedExternally,
): IdleRequestId
