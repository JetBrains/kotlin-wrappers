@file:JsModule("react-dom/client")
@file:JsNonModule

package react.dom.client

import org.w3c.dom.Element
import react.ReactNode

// See https://reactjs.org/docs/react-dom.html

// 18.0+
external fun hydrateRoot(
  container: Element,
  initialChildren: React.ReactNode,
  options: HydrationOptions = definedExternally,
): Root