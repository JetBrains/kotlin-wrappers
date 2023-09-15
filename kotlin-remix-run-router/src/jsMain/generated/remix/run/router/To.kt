package remix.run.router


/**
 * Describes a location that is the destination of some navigation, either via
 * `history.push` or `history.replace`. This may be either a URL or the pieces
 * of a URL path.
 */
typealias To = Any /* string | Partial<Path> */
