package dom

import cssom.fonts.FontFaceSet

inline val Document.fonts: FontFaceSet
    get() = asDynamic().fonts
