package karakum.query

internal val HYDRATION_BOUNDARY_OPTIONS_SOURCE = """
OmitKeyof<HydrateOptions, 'defaultOptions'> & {
        defaultOptions?: OmitKeyof<Exclude<HydrateOptions['defaultOptions'], undefined>, 'mutations'>;
    };
""".trimIndent()

internal val HYDRATION_BOUNDARY_OPTIONS_REPLACEMENT = HYDRATION_BOUNDARY_OPTIONS_SOURCE
    .replace("\n        ", " ")
    .replace("\n    ", " ")

internal val HYDRATION_BOUNDARY_OPTIONS = HYDRATION_BOUNDARY_OPTIONS_REPLACEMENT.removeSuffix(";")
