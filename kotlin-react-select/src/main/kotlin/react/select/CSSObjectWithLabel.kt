package react.select

import csstype.Rules
import react.CSSProperties

// should be CSSObject from '@emotion/react'
external interface CSSObjectWithLabel : CSSProperties, Rules {
    var label: String?
}
