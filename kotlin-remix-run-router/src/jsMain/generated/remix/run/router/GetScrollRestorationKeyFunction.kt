package remix.run.router


/**
 * Function signature for determining the key to be used in scroll restoration
 * for a given location
 */
typealias GetScrollRestorationKeyFunction = (location: Location, matches: js.core.ReadonlyArray<UseMatchesMatch>) -> String?
