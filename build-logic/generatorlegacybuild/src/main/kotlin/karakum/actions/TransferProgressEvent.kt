package karakum.actions

import karakum.common.ConversionResult

internal fun TransferProgressEvent(): ConversionResult =
    ConversionResult(
        name = "TransferProgressEvent",
        body = """
        // Copy of `TransferProgressEvent` from '@azure/ms-rest-js'
        @JsPlainObject
        external interface TransferProgressEvent {
          /**
           * The number of bytes loaded so far.
           */
          val loadedBytes: UInt53
        }
        """.trimIndent(),
    )
