@file:JsModule("react-router-dom")
@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom


/**
 * NOTE: If you refactor this to split up the modules into separate files,
 * you'll need to update the rollup config for react-router-dom-v5-compat.
 */
/* import * as React from "react"; */

/* import type { FutureConfig, NavigateOptions, RelativeRoutingType, RouteObject, To } from "react-router"; */

/* import type { Fetcher, FormEncType, FormMethod, FutureConfig as RouterFutureConfig, GetScrollRestorationKeyFunction, History, HTMLFormMethod, HydrationState, Router as RemixRouter, V7_FormMethod } from "@remix-run/router"; */

/* import type { SubmitOptions, ParamKeyValuePair, URLSearchParamsInit } from "./dom"; */

/* import { createSearchParams } from "./dom"; */

/* export type { FormEncType, FormMethod, GetScrollRestorationKeyFunction, ParamKeyValuePair, SubmitOptions, URLSearchParamsInit, V7_FormMethod, }; */

/* export { createSearchParams }; */

/* export type { ActionFunction, ActionFunctionArgs, AwaitProps, unstable_Blocker, unstable_BlockerFunction, DataRouteMatch, DataRouteObject, Fetcher, Hash, IndexRouteObject, IndexRouteProps, JsonFunction, LazyRouteFunction, LayoutRouteProps, LoaderFunction, LoaderFunctionArgs, Location, MemoryRouterProps, NavigateFunction, NavigateOptions, NavigateProps, Navigation, Navigator, NonIndexRouteObject, OutletProps, Params, ParamParseKey, Path, PathMatch, Pathname, PathPattern, PathRouteProps, RedirectFunction, RelativeRoutingType, RouteMatch, RouteObject, RouteProps, RouterProps, RouterProviderProps, RoutesProps, Search, ShouldRevalidateFunction, To, } from "react-router"; */

/* export { AbortedDeferredError, Await, MemoryRouter, Navigate, NavigationType, Outlet, Route, Router, RouterProvider, Routes, createMemoryRouter, createPath, createRoutesFromChildren, createRoutesFromElements, defer, isRouteErrorResponse, generatePath, json, matchPath, matchRoutes, parsePath, redirect, renderMatches, resolvePath, useActionData, useAsyncError, useAsyncValue, unstable_useBlocker, useHref, useInRouterContext, useLoaderData, useLocation, useMatch, useMatches, useNavigate, useNavigation, useNavigationType, useOutlet, useOutletContext, useParams, useResolvedPath, useRevalidator, useRouteError, useRouteLoaderData, useRoutes, } from "react-router"; */

/** @internal */
/* export { UNSAFE_DataRouterContext, UNSAFE_DataRouterStateContext, UNSAFE_NavigationContext, UNSAFE_LocationContext, UNSAFE_RouteContext, UNSAFE_useRouteId, } from "react-router"; */

/* declare global {
    var __staticRouterHydrationData: HydrationState | undefined;
} */


/* export { HistoryRouter as unstable_HistoryRouter }; */

/**
 * The public API for rendering a history-aware <a>.
 */
external val Link: react.ForwardRefExoticComponent<LinkProps>

/**
 * A <Link> wrapper that knows if it's "active" or not.
 */
external val NavLink: react.ForwardRefExoticComponent<NavLinkProps>

/**
 * A `@remix-run/router`-aware `<form>`. It behaves like a normal form except
 * that the interaction with the server is with `fetch` instead of new document
 * requests, allowing components to add nicer UX to the page as the form is
 * submitted and returns with data.
 */
external val Form: react.ForwardRefExoticComponent<FormProps>


/* export { useScrollRestoration as UNSAFE_useScrollRestoration }; */

/* export { usePrompt as unstable_usePrompt }; */
