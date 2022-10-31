package dom

inline val Document.fonts: FontFaceSet
    get() = asDynamic().fonts
