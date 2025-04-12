package karakum.cesium

private val INTEGER_NAMES = setOf(
    "m",
    "n",

    "index",
    "key",
    "level",
    "length",

    "retryAttempts",
    "componentsPerAttribute",
    "cacheCapacity",
    "skipLevels",

    "canvasSize",
    "tilesize", // spelling error?
    "tileWidth",
    "tileHeight",
    "tileCacheSize",
    "childTileMask",

    "elementsPerHeight",
    "stride",
    "inputOrder",
    "outputOrder",

    "channel",
    "cells",
    "glowWidth",

    "row",
    "column",

    "baseResolution",
    "maximumAttenuation",
    "skipScreenSpaceErrorFactor",
    "emissionRate",
    "slices",

    "pixelRange",
    "minimumClusterSize",
    "sampleDuration",
    "lastFramesPerSecond",
    "negativeAltitudeExponentBias",

    "port",
    "statusCode",
    "maximumRequests",
    "maximumRequestsPerServer",

    "year",
    "month",
    "day",
    "hour",
    "minute",
    "second",
    "millisecond",

    "days",
    "hours",
    "minutes",
    "seconds",

    "mod",
    "factorial",

    "indexOf",
    "indexOfCollection",
    "binarySearch",
    "findTimeInterval",
    "computeNumberOfVertices",
    "getRequiredDataPoints",

    "targetFrameRate",
    "minimumFrameRateDuringWarmup",
    "minimumFrameRateAfterWarmup",
    "loadingDescendantLimit",

    "SIXTY_FOUR_KILOBYTES",
    "FOUR_GIGABYTES"
)

internal fun isInteger(name: String?): Boolean {
    name ?: return false

    return when {
        name in INTEGER_NAMES -> true

        name == "focalLength" -> false
        name == "chordLength" -> false

        name.startsWith("numberOf") -> true

        name.endsWith("Id") -> true
        name.endsWith("Index") -> true
        name.endsWith("Level") -> true
        name.endsWith("Length") -> true
        name.endsWith("Partitions") -> true
        name.endsWith("SpaceError") -> true
        name.endsWith("MemoryUsage") -> true
        name.endsWith("Bytes") -> true
        name.endsWith("Frustum") -> true

        name.endsWith("OfTwo") -> true

        else -> false
    }
}
