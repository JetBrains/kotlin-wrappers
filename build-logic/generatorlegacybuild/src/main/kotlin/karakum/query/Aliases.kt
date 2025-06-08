package karakum.query

import karakum.common.GENERATOR_COMMENT

// language=Kotlin
internal val ALIASES_BODY = """
// $GENERATOR_COMMENT    

${Package.CORE.pkg}

typealias JsDuration = Double

typealias Union = Any

typealias Type = String  

typealias False = Boolean    
typealias True = Boolean

typealias Page = Any
typealias PageParam = Any
"""
