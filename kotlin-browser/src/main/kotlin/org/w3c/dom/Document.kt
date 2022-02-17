package org.w3c.dom

val Document.fonts: FontFaceSet
    get() = asDynamic().fonts
