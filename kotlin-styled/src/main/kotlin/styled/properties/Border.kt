package styled.properties

import styled.*

fun StyledElement.border(width: LinearDimension, style: BorderStyle, color: Color) {
    border = "$width $style $color"
}

fun StyledElement.borderTop(width: LinearDimension, style: BorderStyle, color: Color) {
    borderTop = "$width $style $color"
}

fun StyledElement.borderRight(width: LinearDimension, style: BorderStyle, color: Color) {
    borderRight = "$width $style $color"
}

fun StyledElement.borderBottom(width: LinearDimension, style: BorderStyle, color: Color) {
    borderBottom = "$width $style $color"
}

fun StyledElement.borderLeft(width: LinearDimension, style: BorderStyle, color: Color) {
    borderLeft = "$width $style $color"
}
