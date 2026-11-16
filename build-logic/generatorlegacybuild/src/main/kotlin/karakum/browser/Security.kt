package karakum.browser

// TODO: read from IDL
internal fun Sequence<ConversionResult>.withFinalSecurityMembers(): Sequence<ConversionResult> =
    map { result ->
        val newBody = when (result.name) {
            "Window",
                -> result.body
                .replace("open val location:", "final val location:")
                .replace("open val top:", "final val top:")

            "Document",
                -> result.body
                .replace("open val location:", "final val location:")

            "Location",
                -> result.body
                .replace("open val ", "final val ")
                .replace("open var ", "final var ")
                .replace("open fun ", "final fun ")

            "Event",
                -> result.body
                .replace("open val isTrusted:", "final val isTrusted:")

            else -> return@map result
        }

        result.copy(body = newBody)
    }
