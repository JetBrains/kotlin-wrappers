package karakum.browser

internal val JS_CLOSABLE_INHERITORS = setOf(
    // codecs
    "AudioData",
    "AudioEncoder",
    "ImageDecoder",
    "VideoDecoder",
    "VideoEncoder",
    "VideoFrame",

    "FileSystemSyncAccessHandle",
    "IDBDatabase",
    "PresentationConnection",
    "RTCDataChannel",
    "RTCPeerConnection",
    "Window",
    "DedicatedWorkerGlobalScope",
    "SharedWorkerGlobalScope",
    "RTCDataChannel",

    "BroadcastChannel",
    "ImageBitmap",
    "MessagePort",
    "EventSource",
)
