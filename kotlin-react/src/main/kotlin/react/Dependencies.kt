package react

import kotlinext.js.ReadonlyArray

typealias Dependencies = ReadonlyArray<dynamic>

@Deprecated(
    message = "Legacy API",
    replaceWith = ReplaceWith("Dependencies", "react.Dependencies")
)
typealias RDependenciesArray = Dependencies
