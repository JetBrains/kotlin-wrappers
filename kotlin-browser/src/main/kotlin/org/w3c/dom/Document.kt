package org.w3c.dom

inline val Document.fonts: FontFaceSet
    get() = asDynamic().fonts
