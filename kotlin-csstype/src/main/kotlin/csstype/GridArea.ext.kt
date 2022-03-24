package csstype

fun GridArea(
    gridRowStart: Ident,
    gridColumnStart: Ident,
    gridRowEnd: Ident,
    gridColumnEnd: Ident,
): GridArea =
    "$gridRowStart-start / $gridColumnStart-start / $gridRowEnd-end / $gridColumnEnd-end".unsafeCast<GridArea>()
