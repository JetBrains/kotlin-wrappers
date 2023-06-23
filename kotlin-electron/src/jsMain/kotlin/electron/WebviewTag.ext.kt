package electron

import web.html.HTMLElement

inline fun WebviewTag.asHTMLElement(): HTMLElement = asDynamic()
