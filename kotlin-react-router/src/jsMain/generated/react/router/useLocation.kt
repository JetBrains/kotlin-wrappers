// Generated by Karakum - do not modify it manually!

@file:JsModule("react-router")

package react.router

import remix.run.router.Location

/**
 * Returns the current location object, which represents the current URL in web
 * browsers.
 *
 * Note: If you're using this it may mean you're doing some of your own
 * "routing" in your app, and we'd like to know what your use case is. We may
 * be able to provide something higher-level to better suit your needs.
 *
 * @see https://reactrouter.com/v6/hooks/use-location
 */
external fun useLocation(): Location<*>
